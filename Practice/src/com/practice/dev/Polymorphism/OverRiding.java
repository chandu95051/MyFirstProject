package com.practice.dev.Polymorphism;

class Parent
{
	public void bike()
	{
		System.out.println("Parent Bike");
	}
}
class Child
{
	public void bike()
	{
		System.out.println("Child Bike");
	}
}
public class OverRiding 
{
     public static void main(String[] args) 
     {
//    	 Parent p = new Parent();
//    	 p.bike();
    	 
    	 Child c = new Child();
    	 c.bike();
    	 
    	 

		
	 }
}
