package ͨѶ¼;
import java.util.Scanner;
public class Person{
	int phone;
	String name;
	String sex;
	int StudentID;
	@SuppressWarnings({ "unused", "resource" })
	public Person input(){ 
		Person a=new Person();
	    Scanner sc = new Scanner(System.in); 
	    System.out.println("������������"); 
	    a.name = sc.nextLine(); 
	    System.out.println("�������Ա�"); 
	    a.sex=sc.next();
	    System.out.println("������绰���룺"); 
	    a.phone = sc.nextInt(); 
	    System.out.println("������ѧ�ţ�");
	    a.StudentID=sc.nextInt();
	    return a;
	}
}


