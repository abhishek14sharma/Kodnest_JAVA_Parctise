package package1;

public class insertionSortApp 
{
	public void insertionSort(int arr[])
	{
		for (int i=0;i<=arr.length-1;i++)
		{
			int item= arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>item)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=item;
		}
	}
}