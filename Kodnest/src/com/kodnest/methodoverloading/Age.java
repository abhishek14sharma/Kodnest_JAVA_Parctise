package com.kodnest.methodoverloading;

import java.util.Scanner;

public class Age {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your Name & Year of Birth");
		String name = scan.nextLine();
		int year = scan.nextInt();
		scan.close();
		greet(name);
		age(year);
		System.out.println("Your age is "+age(year));
	}
	public static void greet(String name)
	{
		System.out.println("Hello "+name);
	}
	public static int age(int year)
	{
		return 2023 - year;
	}
}
		