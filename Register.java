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
		private JFrame jf_1;//ע�ᴰ�ڿ��
		private JLabel jl_1;//ע�ᴰ�����
		private static JButton bt2;//ע�ᰴť
		private static JTextField jtext1;//�û�����
		private static JTextField jtext2;//�����
		private static JTextField jtext3;//�绰��
		private static JLabel jl_account;//�û���
		private static JLabel jl_password;//����
		private static JLabel jl_phone;//�绰
	    public Register(){
	    	Font font =new Font("����", Font.PLAIN, 20);//��������
			jl_1=new JLabel();
			
		    jf_1=new JFrame("ע�����");
			jf_1.setSize(450, 450);

			
			jl_account=new JLabel("�û���");
			jl_account.setBounds(20, 50, 60, 50);
			jl_account.setFont(font);
			
			jl_password=new JLabel("����");
			jl_password.setBounds(20, 120, 60, 50);
			jl_password.setFont(font);
			
			jl_phone=new JLabel("�绰����");
			jl_phone.setBounds(20,190,60,50);
			jl_phone.setFont(font);
			
			jtext1=new JTextField("�������û���");
			jtext1.setBounds(150, 50, 250, 50);
			jtext1.setFont(font);
			
			jtext2=new JTextField("����������");
			jtext2.setBounds(150, 120, 250, 50);
			jtext2.setFont(font);
			
			jtext3=new JTextField("������绰����");
			jtext3.setBounds(150, 190, 250, 50);
			jtext3.setFont(font);
			
			bt2=new JButton("ע��");
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
					com.lzw.dao.Register.Registers("",password,phone,account);//ע�ᵽ���ݿ�
					hl.jf_1.dispose();
				}
			};
		    bt2.addActionListener(bt2_ls);
	    }
		
	    
}
