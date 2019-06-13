package com.deepak.Object;

public class Demo1 {
	static int i=5;
	String name ;
	String job;
	int exp;
	public Demo1()
	{
		System.out.println("No arg constructor");
	}
	public Demo1(String name,int exp)
	{
		this();
		System.out.println("inside two arg");
		this.name=name;
		this.exp=exp;
	}
	public Demo1(String name,String job,int exp)
	{
		this(name, exp);
		System.out.println("inside 3 arg cons");
		this.job=job;
	}
	public  void Demo1(Object obj)
	{
		System.out.println("Object is instance of Demo1 "+Demo1.i);
		System.out.println("Name is :: "+name+ " Job is :: "+job+" Exp is :: "+exp);
	}
	public Demo1(Demo1 d)
	{
		this();
		name=d.name;
		exp=d.exp;
		job=d.job;
	}
	{
		System.out.println("inside non static block");
	}
	static 
	{
		i=10;
		System.out.println("inside static block"+i);
	}
	public static void main(String[] args) {
		Demo1 d=new Demo1("Deepak","Software",5);
		Demo1 d1=new Demo1(d);
		//Demo1(this);
		d1.Demo1(d1);
	}
}
