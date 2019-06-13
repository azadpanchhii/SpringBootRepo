package com.deepak.exceptionHandling;

public class demo {
	
	public void finalize()
	{
		System.out.println("Garbage is collected");
		
	}
	public static void main(String[] args) {
		demo d1=new demo();
		demo d2=new demo();
		d1=null;
		d2=null;
		System.gc();
	}
}
