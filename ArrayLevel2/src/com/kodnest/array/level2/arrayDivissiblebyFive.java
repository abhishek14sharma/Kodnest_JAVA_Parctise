package com.kodnest.array.level2;

import java.util.Scanner;

public class arrayDivissiblebyFive 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of Array:-");
		int []arr=new int[scan.nextInt()];
		System.out.println("Enter the Elemnts of Array:-");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]%5==0)
			{
				System.out.print(arr[i]+"|");
			}
		}
		scan.close();
	}
}