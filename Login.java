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
	JButton bt1;//��½��ť
	JButton bt2;//ע�ᰴť
	JFrame jf_1;//��½�Ŀ��
	JLabel jl_1;//��¼�İ���
    JTextField jtext1;//�û�����
    JPasswordField jtext2;//�����
    JLabel jl_account;//�û���
    JLabel jl_password;//����
	public Login() {
		Font font =new Font("����", Font.PLAIN, 20);//��������
		jl_1=new JLabel();
		
	    jf_1=new JFrame("��½����");
		jf_1.setSize(450, 400);

		
		jl_account=new JLabel("�û���");
		jl_account.setBounds(20, 50, 60, 50);
		jl_account.setFont(font);
		
		jl_password=new JLabel("����");
		jl_password.setBounds(20, 120, 60, 50);
		jl_password.setFont(font);
		
		bt1=new JButton("��½");         
		bt1.setBounds(90, 250, 100, 50);
		bt1.setFont(font);
 
		bt2=new JButton("ע��");
		bt2.setBounds(250, 250, 100, 50);
		bt2.setFont(font);
		
		//�����ı���
				jtext1=new JTextField("�������û���");
				jtext1.setBounds(150, 50, 250, 50);
				jtext1.setFont(font);
				
				jtext2=new JPasswordField("����������");//���������
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
				String str=String.valueOf(password); //��char����ת��Ϊstring����
				
				if(Getpassword.equals(admin,str))
				{
					   
					JOptionPane.showMessageDialog(null, "��¼�ɹ�");
					//ת��������
					hl.jf_1.dispose();//���ٵ�ǰ����
				}
				else {
					count++;
					JOptionPane.showMessageDialog(null, "�û�������������������������Զ��˳�");
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
	
