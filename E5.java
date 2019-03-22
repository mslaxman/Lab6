package com;

import java.util.Scanner;

public class E5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		String s=new Scanner(System.in).nextLine();
		int flag=0;
		for(int i=1;i<s.length();i++)
		{
			if((int)s.charAt(i)<(int)(s.charAt(i-1)))
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("Positive");
		}
		else
		{
			System.out.println("not positive");
		}
	}

}
