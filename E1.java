package com;

import java.util.StringTokenizer;

public class E1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="12 22 33 44";
		int sum=0;
		StringTokenizer s1=new StringTokenizer(s);
		while(s1.hasMoreTokens())
		{
			int a=Integer.parseInt(s1.nextToken());
			System.out.println(a);
			sum+=a;
		}
		System.out.println("sum is : "+sum);
	}
}
