package package1;

public class nestWhile 
{
	public static void main(String[] args) 
	{
		int i=1;
		while(i<=5)
		{
			int j=1;
			do
			{
				System.out.print("KODNEST ");
				j++;
			}
			while(j<=5);
			System.out.println();
			i++;
		}
		System.out.println("TECHNOLOGIES");
	}
}