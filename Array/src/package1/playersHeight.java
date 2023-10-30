package package1;

import java.util.Scanner;

public class playersHeight 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		double arr[]=new double[10];
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Enter the Player "+(i+1)+" Height in CentiMetre");
			arr[i]=scan.nextDouble();		
		}
		System.out.println("List of Players Height(in CentiMetre) is:-");
		for(int j=0;j<=arr.length-1;j++)
		{
			System.out.print(arr[j]);
			System.out.print(" | ");
		}
		scan.close();
	}
}