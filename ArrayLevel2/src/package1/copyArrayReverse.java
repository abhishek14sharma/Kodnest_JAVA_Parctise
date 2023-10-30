package package1;

import java.util.Scanner;

public class copyArrayReverse 
{
	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter length of the array");
		int arr[]=new int[scan.nextInt()];
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		int arr2[]=new int[arr.length];
		for(int i=0;i<=arr.length-1;i++)
		{
			arr2[i]=arr[arr.length-1-i];
		}
		System.out.print("arr==> ");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.print("arr2==> ");
		for(int i=0;i<=arr2.length-1;i++)
		{
			System.out.print(arr2[i]+" ");
		}
		scan.close();
	}
}