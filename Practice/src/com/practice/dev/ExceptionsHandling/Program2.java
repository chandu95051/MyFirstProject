package com.practice.dev.ExceptionsHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program2 {

	private static Scanner s;

	public static void main(String[] args) 
	{
	  
		s = new Scanner(System.in);
		  try
		  {
			  System.out.println("Enter the Value a ");
			  int a=s.nextInt();
			  System.out.println("Enter the Value b ");
			  int b=s.nextInt();
			  int c=a/b;
			  System.out.println("The value of C: "+c);
		  }
		  catch (ArithmeticException d)
		  {
			 System.out.println("Exception Solved ="+d); 
		  }
		  catch (InputMismatchException d)
		  {
			 System.out.println("Exception Solved ="+d); 
		  }
		  catch (Exception d)
		  {
			 System.out.println("Exception Solved ="+d); 
		  }
		  

	}

}
