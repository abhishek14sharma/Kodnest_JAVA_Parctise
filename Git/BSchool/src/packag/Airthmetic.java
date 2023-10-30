package packag;

import java.util.Scanner;

public class Airthmetic 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the two numbers for substraction=");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		System.out.println("The result is="+subtractNumbers(num1, num2));
		System.out.println("Enter the two numbers for multiplication=");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		System.out.println("The result is="+multiplyNumbers(num1, num2));
		System.out.println("Enter the two numbers for division=");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		System.out.println("The result is="+divideNumbers(num1, num2));
		System.out.println("Enter the two numbers for remainder=");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		System.out.println("The result is="+findRemainder(num1, num2));
		scan.close();
	}
	public static int subtractNumbers(int num1, int num2)
	{
		return num2-num1;
	}
	public static int multiplyNumbers(int num1, int num2)
	{
		return num1*num2;
	}
	public static double divideNumbers(int num1, int num2)
	{
		return num1/num2;
	}
	public static int findRemainder(int num1, int num2)
	{
		return num1%num2;
	}
}
