package com.kodnest.methodoverloading;

import java.util.Scanner;

public class Greet 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your Name-");
		String name = scan.nextLine();
		scan.close();
		greet(name);
	}
	public static void greet(String name)
	{
		System.out.println("Hello "+name+"...How are you?");
	}
}
		