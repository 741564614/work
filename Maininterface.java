package com.lzw;
import java.util.Scanner;

import com.lzw.dao.Getperson;
import com.lzw.dao.Putperson;
import com.lzw.dao.model.Person;
public class Maininterface {
		
		
		public static void maininterface(int k,String account) {
			
			final Scanner sc=new Scanner(System.in);
			if(k==1) {
			System.out.println("��ĸ�����Ϣ����");
				Person.toString(Getperson.getperson(account));// ��ȡ������Ϣ
				System.out.println("����д��ĸ�����Ϣ");
				System.out.println("������");
				String name=sc.nextLine();
				System.out.println("ѧԺ��");
				String faculty=sc.next();
				System.out.println("רҵ�༶��");
				String majorclass=sc.next();
				System.out.println("�Ա�");
				String sex=sc.next();
				System.out.println(Putperson.putperson(name,faculty,majorclass,sex,account));//��д������Ϣ
			}
			else {
				System.out.println("����д��ĸ�����Ϣ");
				System.out.println("������");
				String name=sc.nextLine();
				System.out.println("ѧԺ��");
				String faculty=sc.next();
				System.out.println("רҵ�༶��");
				String majorclass=sc.next();
				System.out.println("�Ա�");
				String sex=sc.next();
				System.out.println(Putperson.putperson(name,faculty,majorclass,sex,account));//��д������Ϣ
			}
			sc.close();
		}
		
}
