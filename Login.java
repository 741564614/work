package com.lzw.login;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import com.lzw.dao.*;
import com.lzw.register.Register;
public class Login extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int count=0;
	JButton bt1;//登陆按钮
	JButton bt2;//注册按钮
	JFrame jf_1;//登陆的框架
	JLabel jl_1;//登录的版面
    JTextField jtext1;//用户名框
    JPasswordField jtext2;//密码框
    JLabel jl_account;//用户名
    JLabel jl_password;//密码
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
				jtext1=new JTextField("请输入用户名");
				jtext1.setBounds(150, 50, 250, 50);
				jtext1.setFont(font);
				
				jtext2=new JPasswordField("请输入密码");//密码输入框
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
	public void LoginActionListener(){
		Login hl=new Login();

		ActionListener bt1_ls=new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				String admin=jtext1.getText();
				char[] password=jtext2.getPassword();
				String str=String.valueOf(password); //将char数组转化为string类型
				
				if(Getpassword.equals(admin,str))
				{
					   
					JOptionPane.showMessageDialog(null, "登录成功");
					//转跳主界面
					hl.jf_1.dispose();//销毁当前界面
				}
				else {
					count++;
					JOptionPane.showMessageDialog(null, "用户名或密码错误，连续错误三次自动退出");
					if(count==3){
						hl.jf_1.dispose();
					}
				}
			}
		};
		
		ActionListener bt2_ls=new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Register.RegisterActionListener();
				
			}
		};
	    bt2.addActionListener(bt2_ls);	
	    bt1.addActionListener(bt1_ls);
		
		}
	
}
	
