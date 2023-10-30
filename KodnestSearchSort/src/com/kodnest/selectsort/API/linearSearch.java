package com.kodnest.selectsort.API;

public class linearSearch 
{
	public static int linearSearching(int arr[], int key)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
			{
				return i;
			}
		}
		return -1;
	}
}