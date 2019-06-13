package com.deepak.inheritance;

class first
{
	int a=10;
	first()
	{
		System.out.println("First class");
	}
	public void show()
	{
		System.out.println("First class show method");
	}
	public static void main(String[] args) {
		first fir=new first();
		fir.show(); 
	}
}
class second extends first 
{
	second()
	{
		System.out.println("Inside class second");
	}
	 public void show()
	{
		super.show();
		System.out.println("inside second class show method");
	}
	public static void main(String[] args) {
		second demo=new second();
		demo.show();
	}
}
public class Inherit2 extends first{
int a=20;
	Inherit2()
	{
		System.out.println("inside child class");
	}
	public void show()
	{
		super.show();
		System.out.println("inside last child class show"+super.a);
	}
	public static void main(String[] args) {
		Inherit2 obj=new Inherit2();
		obj.show();
		System.out.println(obj.a);
	}
}
