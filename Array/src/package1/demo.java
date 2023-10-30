package package1;

import java.util.Scanner;

public class demo 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int arr[]=new int[3];
		System.out.println("Enter the Elements");
		for(int i=0;i<=arr.length-1;i++)//Loop will work until array length -1 because the initial value is 0 
			                            //and the loop has to take input of only 3
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Array Elements are:-");
		for(int j=0;j<=arr.length-1;j++)
		{
			System.out.print(arr[j]+" ");
		}
		scan.close();
	}
}