package package1;

import java.util.Scanner;

public class replaceNegativeElements 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Length of Array:");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" Elements");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Elements of Array ");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]<0)
			{
				arr[i]=0;
			}
		}
		System.out.println();
		System.out.println("Modified Array: ");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		scan.close();
	}	
}