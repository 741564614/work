package com.lzw;
import java.util.Scanner;

import com.lzw.dao.Getperson;
import com.lzw.dao.Putperson;
import com.lzw.dao.model.Person;
public class Maininterface {
		
		
		public static void maininterface(int k,String account) {
			
			final Scanner sc=new Scanner(System.in);
			if(k==1) {
			System.out.println("你的个人信息如下");
				Person.toString(Getperson.getperson(account));// 获取个人信息
				System.out.println("请填写你的个人信息");
				System.out.println("姓名：");
				String name=sc.nextLine();
				System.out.println("学院：");
				String faculty=sc.next();
				System.out.println("专业班级：");
				String majorclass=sc.next();
				System.out.println("性别：");
				String sex=sc.next();
				System.out.println(Putperson.putperson(name,faculty,majorclass,sex,account));//填写个人信息
			}
			else {
				System.out.println("请填写你的个人信息");
				System.out.println("姓名：");
				String name=sc.nextLine();
				System.out.println("学院：");
				String faculty=sc.next();
				System.out.println("专业班级：");
				String majorclass=sc.next();
				System.out.println("性别：");
				String sex=sc.next();
				System.out.println(Putperson.putperson(name,faculty,majorclass,sex,account));//填写个人信息
			}
			sc.close();
		}
		
}
