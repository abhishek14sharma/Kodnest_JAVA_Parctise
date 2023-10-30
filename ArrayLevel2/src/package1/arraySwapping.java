package package1;

import java.util.Scanner;

public class arraySwapping 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Length of Array:");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" Elements");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter the values to be Swapped:");
		int index1=scan.nextInt();
		int index2=scan.nextInt();
		System.out.println("Array before Sswapping: ");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		if(index1>=0 && index1<=arr.length && index2>=0 && index2<=arr.length)
		{
			int temp=arr[index1];
			arr[index1]=arr[index2];
			arr[index2]=temp;	
		}
		System.out.println("Array after Swapping:");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		scan.close();
	}
}