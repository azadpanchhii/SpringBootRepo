package com.deepak.AbstractInterface;

abstract class Demo
{
	abstract void run();
	public void show()
	{
		System.out.println("non abstract method");
	}
	public int a=10;
	Demo(int a)
	{
		this.a=a;
		System.out.println("Inside parent abstract class constructor"+a);
	}
	static {
		System.out.println("Inside static block of abstract class");
	}
	  abstract void display();
	
}

public class Abstract1 extends Demo{
	

	Abstract1(int a) {
		super(a);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Demo d=new Abstract1(30);
		d.run();
		d.show();
		d.display();
	}

	@Override
	void run() {
		System.out.println("Overriden run method"+a);
	}

	@Override
	void display() {
		System.out.println("Overriden method display");
		
	}
}
