package com.practice.dev.ExceptionsHandling;

public final class FinallyBlock 
{
	public static void main(String[] args) 
	{
		try
		{
			System.out.println("Connection Successfull");
			int i =1/0;
			System.out.println(i);
	
		}
		catch(Exception e)
		{
			System.out.println("Exception Handled :"+e);
		}
		finally 
		{
			System.out.println("finally");
			
		}
		
	}

}
