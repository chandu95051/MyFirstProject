package com.practice.dev.ExceptionsHandling;

import java.util.Scanner;

public class Program3 
{
   private static Scanner s;

public static void main(String[] args) 
   {

		  s = new Scanner(System.in);
		  System.out.println("Enter the Value a ");
		  int a=s.nextInt();
		  System.out.println("Enter the Value b ");
		  int b=s.nextInt();
		  try
		  {
			  int c=a/b;
			  System.out.println(c);
		  }
		  catch (Exception d)
		  {
			 System.out.println("Exception Handled="+d); 
		  }
		 
   }
}
