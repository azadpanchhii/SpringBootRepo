package com.deepak.Object;

public class StaticDemo1 {
	static int a;
	static int b;
	static 
	{
		a=10;b=15;
	}
	public  void show()
	{
		System.out.println("value of a is:: "+a+" value of b is :: "+b);
	}
	public static void main(String[] args) {
		int a=5;
		StaticDemo1 d=new StaticDemo1();
		d.show();
		b+=5;
		StaticDemo1 d1=new StaticDemo1();
		d1.show();
		System.out.println("value of a is:: "+StaticDemo1.a+" value of b is :: "+b);
	}
}
