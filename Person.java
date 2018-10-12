package com.lzw.dao.model;

public class Person {
	private String account;
	private String name;
	private String faculty;
	private String majorclass;
	private String phone;
	public Person creat(String a,String n,String f,String m,String p) {
		Person person=new Person();
		person.account=a;
		person.faculty=f;
		person.majorclass=m;
		person.phone=p;
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
	public void toString(Person a) {
		nametoString(a);
		facultytoString(a);
		majorclasstoString(a);
		phonetoString(a);
	}
}