package com.deepak.kafka;

public class User {
	private String name;
	private String dept;

	public User()
	{
		this("Deepak","Java Technology");
		System.out.println("Inside default one");
	}
	public User(String name, String dept) {
		System.out.println("Inside parameterized one");
		this.name = name;
		this.dept = dept;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public String toString() {
		return "Name is : "+name+" Dept is:: "+dept;
	}
	
	
}
