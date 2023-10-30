package com.kodnest.newtrainer;

import java.util.Scanner;

public class studentApp 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Student Count:");
		int studentCount=scan.nextInt();
		student []arr= new student[studentCount];
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Enter the Roll No, Name & Age of Student "+(i+1));
			arr[i]=new student(scan.nextInt(), scan.next(), scan.nextInt());
		}
		scan.close();
		System.out.println("Student Information Are:-");
		System.out.println("Roll No.   Name    Age");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("  "+arr[i].rollNo+"        "+arr[i].name+"     "+arr[i].age);
		}
	}
}