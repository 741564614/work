package com.lzw.dao.model;

public class Person {
	private int account;
	private String name;
	private String faculty;
	private String majorclass;
	public Person creat(int a,String n,String f,String m) {
		Person person=new Person();
		person.account=a;
		person.faculty=f;
		person.majorclass=m;
		return person;
	}
	public String nametoSring(Person a) {
		return a.name;
	}
	public String facultytoSring(Person a) {
		return a.faculty;
	}
	public String majorclasstoSring(Person a) {
		return a.majorclass;
	}
	public void toSring(Person a) {
		nametoSring(a);
		facultytoSring(a);
		majorclasstoSring(a);
	}
}