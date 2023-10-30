package package1;

import java.util.Scanner;

public class factorial 
{
	public static int findFactorial(int n)
	{
		int res=0;
		if(n==0)
		{
			res=1;
		}
		else
		{
			res=n*findFactorial(n-1);
		}
		return res;
	}
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n=scan.nextInt();
		int res=findFactorial(n);
		System.out.println("Factorial of "+n+" = "+res);
		scan.close();
	}
}
