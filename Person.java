package 通讯录;
import java.util.ArrayList;
public class Person{
	private int user;
	private int password;
	private int phone;
	ArrayList<Person>list=new ArrayList<>();
	public ArrayList<Person> creat(int user,int password,int phone) {
		this.user=user;
		this.password=password;
		this.phone=phone;
		ArrayList<Person>list=new ArrayList<>();
		list.add(this);
		return list;
	}
	public boolean equals(int user,int password) {
		Person a=new Person();
		a.user=user;
		a.password=password;
		if(list.indexOf(a)==-1) {
			return false;
		}
		else return true;
		
	}
}

