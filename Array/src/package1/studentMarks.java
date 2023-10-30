package package1;

import java.util.Scanner;

public class studentMarks 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int arr[]=new int[5];
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Enter the Marks of Student "+(i+1));
			arr[i]=scan.nextInt();
		}
		System.out.println("List of Marks are:-");
		for(int j=0;j<=arr.length-1;j++)
		{
			System.out.print(arr[j]);
			System.out.print("|");
		}
		scan.close();
	}
}