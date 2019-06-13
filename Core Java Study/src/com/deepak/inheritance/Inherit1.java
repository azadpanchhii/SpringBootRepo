package com.deepak.inheritance;

class parent
{
	int a;
	/*parent()
	{
		System.out.println("inside parent class");
	}*/
	{
		System.out.println("parent class non static block");
	}

	public void display()
	{
		System.out.println("inside base class display method");
	}
}

public class Inherit1 extends parent{
	int a;
	Inherit1()
	{
	
		System.out.println("inside child class");
	}
	
	Inherit1(int a)
	{
		this();
		this.a=a;
		
		super.a=10;
	}
	
	public void display()
	{
		System.out.println("inside child class display method vairable is :: "+super.a);
		super.display();
	}
	public static void main(String[] args) {
		Inherit1 child=new Inherit1();// dynamic method invocation i.e. run time binding.	
		child.display();
		
	}
	
}
