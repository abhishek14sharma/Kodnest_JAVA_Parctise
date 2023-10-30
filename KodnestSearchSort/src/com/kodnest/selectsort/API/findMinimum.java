package com.kodnest.selectsort.API;

public class findMinimum 
{
	public static int findMin(int arr[])
	{
		insertionSortAsc sort=new insertionSortAsc();
		sort.insertionSortAscending(arr);
		int min=arr[0];
		return min;
	}
}