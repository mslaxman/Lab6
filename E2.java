package com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class E2 {

	
	public static void main(String []args) throws IOException
	{
		//Scanner sc=new Scanner(new File("D:\\Examples\\java.docx"));
		FileReader fr=new FileReader("D:\\Examples\\java.txt");
		@SuppressWarnings("resource")
		BufferedReader br=new BufferedReader(fr);
		int i=1;
		String str="";
		while((str=br.readLine()) != null)
		{
			
			System.out.println("Line "+i+" "+str);
			i++;
		}
	}
}
