package com.lzw.register;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Register extends JFrame{
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		private JFrame jf_1;//注册窗口框架
		private JLabel jl_1;//注册窗口面板
		private static JButton bt2;//注册按钮
		private static JTextField jtext1;//用户名框
		private static JTextField jtext2;//密码框
		private static JTextField jtext3;//电话框
		private static JLabel jl_account;//用户名
		private static JLabel jl_password;//密码
		private static JLabel jl_phone;//电话
	    public Register(){
	    	Font font =new Font("黑体", Font.PLAIN, 20);//设置字体
			jl_1=new JLabel();
			
		    jf_1=new JFrame("注册界面");
			jf_1.setSize(450, 450);

			
			jl_account=new JLabel("用户名");
			jl_account.setBounds(20, 50, 60, 50);
			jl_account.setFont(font);
			
			jl_password=new JLabel("密码");
			jl_password.setBounds(20, 120, 60, 50);
			jl_password.setFont(font);
			
			jl_phone=new JLabel("电话号码");
			jl_phone.setBounds(20,190,60,50);
			jl_phone.setFont(font);
			
			jtext1=new JTextField("请输入用户名");
			jtext1.setBounds(150, 50, 250, 50);
			jtext1.setFont(font);
			
			jtext2=new JTextField("请输入密码");
			jtext2.setBounds(150, 120, 250, 50);
			jtext2.setFont(font);
			
			jtext3=new JTextField("请输入电话号码");
			jtext3.setBounds(150, 190, 250, 50);
			jtext3.setFont(font);
			
			bt2=new JButton("注册");
			bt2.setBounds(225, 250, 100, 50);
			bt2.setFont(font);
			
			jl_1=new JLabel();
			jl_1.add(bt2);
			jl_1.add(jl_account);
			jl_1.add(jl_password);
			jl_1.add(jl_phone);
			jl_1.add(jtext1);
			jl_1.add(jtext2);
			jl_1.add(jtext3);
			
			jf_1.add(jl_1);
			jf_1.setVisible(true);
			jf_1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			jf_1.setLocation(800,400);
	    }
	    public static void RegisterActionListener() {
	    	Register hl=new Register();
	    	ActionListener bt2_ls=new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String account=jtext1.getText();
					String password=jtext2.getText();
					String phone=jtext3.getText();
					com.lzw.dao.Register.Registers("",password,phone,account);//注册到数据库
					hl.jf_1.dispose();
				}
			};
		    bt2.addActionListener(bt2_ls);
	    }
		
	    
}
