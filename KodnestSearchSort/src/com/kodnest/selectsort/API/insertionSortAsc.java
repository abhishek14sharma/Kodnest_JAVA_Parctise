package com.kodnest.selectsort.API;

public class insertionSortAsc 
{
	public void insertionSortAscending(int arr[])
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