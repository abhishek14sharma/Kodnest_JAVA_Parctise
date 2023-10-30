package package1;

import java.util.Scanner;

public class customersName 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		String [][]arr=new String[5][6];
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println("Enter the name of Bank "+i+" Customer "+j);
				arr[i][j]=scan.next();
			}
		}
		System.out.println("Names Cutomers are..........");
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.print("B-"+i+" C-"+j+" "+arr[i][j]+"|");
			}
			System.out.println();
			System.out.println("------------------------------------------------------------------");
		}
		scan.close();
	}
}