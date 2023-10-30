package package1;

import java.util.Scanner;

public class gcd 
{
	public static int findgcd(int m, int n)
	{
		int res=0;
		if(n==0)
		{
			res= m;
		}
		else
		{
			res=findgcd(n, m%n);
		}
		return res;
	}
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Two Numbers:");
		int m=scan.nextInt();
		int n=scan.nextInt();
		int res=findgcd(m,n);
		System.out.println("GCD of "+m+" "+n+" is "+res);
		scan.close();
	}
}