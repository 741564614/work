package com.lzw.dao.model;

public class Person {
	public String account;
	public String name;
	public String faculty;
	public String majorclass;
	public String sex;
	public String password;
	public String tel;
	public Person create(String a,String p,String n,String f,String m,String tel,String s) {
		Person person=new Person();
		person.account=a;
		person.password=p;
		person.faculty=f;
		person.majorclass=m;
		person.tel=tel;
		person.sex=s;
		return person;
	}
	public static String nametoString(Person a) {
		return a.name;
	}
	public static String facultytoString(Person a) {
		return a.faculty;
	}
	public static String majorclasstoString(Person a) {
		return a.majorclass;
	}
	public static String teltoString(Person a) {
		return a.tel;
	}
	public String accounttoString(Person a) {
		return a.account;
	}
	public String passwordtoString(Person a) {
		return a.password;
	}
	public static String sextoString(Person a) {
		return a.sex;
	}
	public static void toString(Person a) {
		System.out.println(nametoString(a));
		System.out.println(sextoString(a));
		System.out.println(facultytoString(a));
		System.out.println(majorclasstoString(a));
		System.out.println(teltoString(a));
	}
}