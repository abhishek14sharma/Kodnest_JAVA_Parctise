package dpackage;

import java.util.Scanner;

public class Concatenate 
{
	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter Firt Name=");
		String str1=scan.next();
		System.out.println("Enter Last Name=");
		String str2=scan.next();
		System.out.println("Full Name= "+joinStrings(str1, str2));
		scan.close();
		
	}
	public static String joinStrings(String str1, String str2)
	{
		return str1+" "+str2;
	}
}
