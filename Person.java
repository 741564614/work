package com.lzw.dao.model;

public class Person {
	private int account;
	private String name;
	private String faculty;
	private String majorclass;
	private int phone;
	public Person creat(int a,String n,String f,String m,int p) {
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
	public int phonetoString(Person a) {
		return a.phone;
	}
	public void toString(Person a) {
		nametoString(a);
		facultytoString(a);
		majorclasstoString(a);
		phonetoString(a);
	}
}