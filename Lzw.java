package com.lzw;
import java.util.Scanner;
import com.lzw.dao.*;
import com.lzw.dao.model.*;
public class Lzw {
	private static final Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		int a;
		System.out.println("登录选1 注册选2");
		a=sc.nextInt();
		Person user=new Person();
		if(a==2) {
			System.out.println("请输入用户名（仅限数字）");
			String account=sc.next();
			System.out.println("请输入密码");
			String password=sc.next();
			System.out.println("请输入手机号");
			String phone=sc.next();
			user.create(account, password, null, null, null, phone);
			String j=Register.register(account,password,phone);//注册到数据库
			System.out.println(j);
		}
		if(a==1) {
			System.out.println("请输入用户名（仅限数字）");
			String account=sc.next();
			System.out.println("请输入密码");
			String password=sc.next();
			if(Getpassword.equals(account,password)==false) {
				System.out.println("用户名或密码错误");
			}
			else {
				System.out.println("登录成功");
				a=sc.nextInt();
				if(a==0) {
					Ergodic.ergidic();//遍历函数
				}
				
			}
		}
	}
}
