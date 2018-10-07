package 通讯录;
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
	    System.out.println("请输入姓名："); 
	    a.name = sc.nextLine(); 
	    System.out.println("请输入性别："); 
	    a.sex=sc.next();
	    System.out.println("请输入电话号码："); 
	    a.phone = sc.nextInt(); 
	    System.out.println("请输入学号：");
	    a.StudentID=sc.nextInt();
	    return a;
	}
}


