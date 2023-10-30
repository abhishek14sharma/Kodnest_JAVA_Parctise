package package1;

import java.util.Scanner;

public class combiningArray 
{
	public static void main(String[] args) 
	{	
		Scanner scan=new Scanner(System.in);
		int arr1[]=new int[3];
		int arr2[]=new int[4];
		System.out.println("Enter the Elements of first array");
		for(int i=0;i<=arr1.length-1;i++)
		{
			arr1[i]=scan.nextInt();
		}
		System.out.println("Enter the Elements of second array");
		for(int j=0;j<=arr2.length-1;j++)
		{
			arr2[j]=scan.nextInt();
		}
		int combine[]=new int[arr1.length+arr2.length];
		for(int k=0;k<=arr1.length-1;k++)
		{
			combine[k]=arr1[k];
		}
		for(int m=0;m<=arr2.length-1;m++)
		{
			combine[m]=arr2[m];
		}
		System.out.println(combine);
		scan.close();
	}
}