package com.kodnest.string;

import java.util.Scanner;

public class reverseScentence 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a String:");
		String str=scan.nextLine();
		System.out.println("Entered String is:");
		System.out.println(str);
		String arr[]=str.split(" ");
		String revSce=" ";
		for(int i=0;i<=arr.length-1;i++)
		{
			String word=arr[i];
			String revWord="";
			for(int j=arr.length-i-1;j>=0;j--)
			{
			revWord=revWord+word+" ";
			revSce=revSce+revWord+" ";
			}
		}
		System.out.println("Reversed Scentence is:");
		System.out.println(revSce);
		scan.close();
	}
}