package com.lzw;
import java.util.Scanner;
import com.lzw.dao.*;
import com.lzw.dao.model.*;
public class Lzw {
	private static final Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		int a;
		System.out.println("��¼ѡ1 ע��ѡ2");
		a=sc.nextInt();
		Person user=new Person();
		if(a==2) {
			System.out.println("�������û������������֣�");
			String account=sc.next();
			System.out.println("����������");
			String password=sc.next();
			System.out.println("�������ֻ���");
			String phone=sc.next();
			user.create(account, password, null, null, null, phone);
			Register.Registers("","","","");//ע�ᵽ���ݿ�
		}
		if(a==1) {
			System.out.println("�������û������������֣�");
			String account=sc.next();
			System.out.println("����������");
			String password=sc.next();
			if(!Getpassword.equals(account,password)) {
				System.out.println("�û������������");
			}
			else {
				System.out.println("��¼�ɹ�");
				a=sc.nextInt();
				if(a==0) {
					//��������
				}
				
			}
		}
	}
}
