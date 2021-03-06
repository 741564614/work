package com.lzw.login;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import com.lzw.dao.*;
import com.lzw.register.Register1;
import com.lzw.*;
public class Login extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static int count=0;
	static JButton bt1;//登陆按钮
	static JButton bt2;//注册按钮
	static JFrame jf_1;//登陆的框架
	static JLabel jl_1;//登录的版面
    static JTextField jtext1;//用户名框
    static JPasswordField jtext2;//密码框
    static JLabel jl_account;//用户名
    static JLabel jl_password;//密码
	public Login() {
		Font font =new Font("黑体", Font.PLAIN, 20);//设置字体
		jl_1=new JLabel();
		
	    jf_1=new JFrame("登陆界面");
		jf_1.setSize(450, 400);

		
		jl_account=new JLabel("用户名");
		jl_account.setBounds(20, 50, 60, 50);
		jl_account.setFont(font);
		
		jl_password=new JLabel("密码");
		jl_password.setBounds(20, 120, 60, 50);
		jl_password.setFont(font);
		
		bt1=new JButton("登陆");         
		bt1.setBounds(90, 250, 100, 50);
		bt1.setFont(font);
 
		bt2=new JButton("注册");
		bt2.setBounds(250, 250, 100, 50);
		bt2.setFont(font);
		
		//加入文本框
				jtext1=new JTextField("");
				jtext1.setBounds(150, 50, 250, 50);
				jtext1.setFont(font);
				
				jtext2=new JPasswordField("");//密码输入框
				jtext2.setEchoChar('*');
				jtext2.setBounds(150, 120, 250, 50);
				jtext2.setFont(font);
				
			
				
				jl_1.add(jl_account);
				jl_1.add(jl_password);
				jl_1.add(bt1);
				jl_1.add(bt2);
				jl_1.add(jtext1);
				jl_1.add(jtext2);
				jf_1.add(jl_1);
				jf_1.setVisible(true);
				jf_1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				jf_1.setLocation(800,400);
				
	}
	public static void LoginActionListener(){
		

		ActionListener bt1_ls=new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
				String admin=jtext1.getText();
				char[] password=jtext2.getPassword();
				String str=String.valueOf(password); //将char数组转化为string类型
				
				if(Getpassword.equals(admin,str))
				{
					
					
					JOptionPane.showMessageDialog(null, "登录成功");
					Login.jf_1.dispose();//销毁当前界面
					Maininterface.maininterface(1,admin);//转跳主界面
					
				}
				else {
					count++;
					JOptionPane.showMessageDialog(null, "用户名或密码错误，连续错误三次自动退出");
					if(count==3){
						Login.jf_1.dispose();
					}
				}
			}
		};
		
		ActionListener bt2_ls=new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login.jf_1.dispose();
				Register1.RegisterActionListener();
				
			}
		};
	    bt2.addActionListener(bt2_ls);	
	    bt1.addActionListener(bt1_ls);
		
		}
	
}
	
