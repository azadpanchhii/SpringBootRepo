package com.deepak.AbstractInterface;

interface A
{
 void a();
 void b();
 void c();
}
abstract class abs implements A
{
	public void a()
	{
		System.out.println("Overriden  method a().");
	}
}
public class Abstract2 extends abs{
	
	public static void main(String[] args) {
		Abstract2 obj=new Abstract2();
		obj.a();
		obj.b();
		obj.c();
	}

	@Override
	public void b() {
		System.out.println("Overriden b() method");
	}
	@Override
	public void c() {
		System.out.println("Overriden c() method");
	}
}
