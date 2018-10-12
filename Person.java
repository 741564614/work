package com.lzw.dao.model;

public class Person {
	private String account;
	private String name;
	private String faculty;
	private String majorclass;
	private String password;
	private String phone;
	public Person create(String a,String p,String n,String f,String m,String tel) {
		Person person=new Person();
		person.account=a;
		person.password=p;
		person.faculty=f;
		person.majorclass=m;
		person.phone=tel;
		return person;
	}
	public String nametoString(Person a) {
		return a.name;
	}
	public String facultytoString(Person a) {
		return a.faculty;
	}
	public String majorclasstoString(Person a) {
		return a.majorclass;
	}
	public String phonetoString(Person a) {
		return a.phone;
	}
	public String accounttoString(Person a) {
		return a.account;
	}
	public String passwordtoString(Person a) {
		return a.password;
	}
	public void toString(Person a) {
		nametoString(a);
		facultytoString(a);
		majorclasstoString(a);
		phonetoString(a);
	}
}