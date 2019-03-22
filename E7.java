package com;

import java.util.Scanner;

public class E7 {

	public boolean validate(String s)
	{
		String []arr=s.split("\\_");
		if(!(arr[arr.length-1].equals("job")))
		{
			return false;
		}
		else
		{
			if((s.length()-4)<8)
			{
				return false;
			}
			else
			{
				return true;
			}
		}
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		String s=new Scanner(System.in).next();
		E7 l=new E7();
		boolean b=l.validate(s);
		if(b)
		{
			System.out.println("Passed");
		}
		else
		{
			System.out.println("Failed");
		}
	}

}
