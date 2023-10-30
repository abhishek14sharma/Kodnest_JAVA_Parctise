package com.kodnest.string;

import java.util.Scanner;

public class stringRotateSamePosition 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = scanner.nextLine();
		System.out.println("Entered String is:");
		System.out.println(str);
		String arr[]=str.split(" ");
		String revScentence="";
		for (int i=0; i<=arr.length-1;i++)
		{
			String word=arr[i];
			String revWord="";
			for(int j=word.length()-1;j>=0;j--)
			{
				revWord=revWord+word.charAt(j);
			}
			revScentence=revScentence+revWord+" ";
		}
		System.out.println("Reversed Word Scentence is:");
		System.out.println(revScentence);
		scanner.close();
	}	
}