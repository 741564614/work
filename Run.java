package 通讯录;
import java.util.Scanner;
import java.util.ArrayList;
public class Run {
	private static final Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		int a;
		ArrayList<Person>lis=new ArrayList<>();
		Person b=new Person();
		System.out.println("登录选1 注册选2");
		a=sc.nextInt();
		if(a==2) {
			System.out.println("请输入用户名（仅限数字）");
			int user=sc.nextInt();
			System.out.println("请输入密码（仅限数字）");
			int password=sc.nextInt();
			System.out.println("请输入手机号");
			int phone=sc.nextInt();
			lis=b.creat(user,password,phone);
			System.out.println("注册成功");
		}
		if(a==1) {
			System.out.println("请输入用户名（仅限数字）");
			int user=sc.nextInt();
			System.out.println("请输入密码（仅限数字）");
			int password=sc.nextInt();
			if(!b.equals(user,password)) {
				System.out.println("用户名或密码错误");
			}
		
		}
	}
}
