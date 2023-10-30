package package1;

import java.util.Scanner;

public class employeesName 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		String arr[]=new String[8];
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Enter the Name of Employee"+(i+1));
			arr[i]=scan.next();
		}
		System.out.println("List of Employees Name:-");
		for(int j=0;j<=arr.length-1;j++)
		{
			System.out.print(arr[j]);
			System.out.print(" | ");
		}
		scan.close();	
	}
}