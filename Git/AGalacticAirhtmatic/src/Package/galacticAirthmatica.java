package Package;

import java.util.Scanner;

public class galacticAirthmatica
{
	public static void main(String[] args)
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the two numbers");
		long num1=scan.nextLong();
		long num2=scan.nextLong();
		scan.close();
		System.out.println(galcticAddition(num1, num2));
	}
	public static long galcticAddition(long num1, long num2)
	{
		return num1+num2;
	}

}