package ͨѶ¼;
import java.util.Scanner;
import java.util.ArrayList;
public class Run {
	private static final Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		int a;
		ArrayList<Person>lis=new ArrayList<>();
		Person b=new Person();
		System.out.println("��¼ѡ1 ע��ѡ2");
		a=sc.nextInt();
		if(a==2) {
			System.out.println("�������û������������֣�");
			int user=sc.nextInt();
			System.out.println("���������루�������֣�");
			int password=sc.nextInt();
			System.out.println("�������ֻ���");
			int phone=sc.nextInt();
			lis=b.creat(user,password,phone);
			System.out.println("ע��ɹ�");
		}
		if(a==1) {
			System.out.println("�������û������������֣�");
			int user=sc.nextInt();
			System.out.println("���������루�������֣�");
			int password=sc.nextInt();
			if(!b.equals(user,password)) {
				System.out.println("�û������������");
			}
		
		}
	}
}
