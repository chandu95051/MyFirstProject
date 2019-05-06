package com.practice.dev.basics;

public class Test3 
{
	static int n = 10;
	
	static void   method()
	{
		System.out.println(n);
		n =20;
		System.out.println(n);
	}
	
	static void   method1()
	{
		System.out.println(n);
		
	}
	
	
	public static void main(String[] args) 
	{
		System.out.println(n);
		n = 30;
		method();
		method1();
	}
	
	

}
