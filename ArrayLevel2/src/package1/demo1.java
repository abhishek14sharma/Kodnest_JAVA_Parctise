package package1;

import java.util.Scanner;

public class demo1 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1st D and 2nd D length");
		int arr[][]=new int[scan.nextInt()][scan.nextInt()];
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println("Enter an Element");
				arr[i][j]=scan.nextInt();
			}
		}
		System.out.println("Array Contents Are....");
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		scan.close();
	}
}
