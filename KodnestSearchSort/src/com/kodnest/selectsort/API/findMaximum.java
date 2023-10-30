package com.kodnest.selectsort.API;

public class findMaximum 
{
	public static int findMax(int arr[])
	{
		insertionSortDsc sort=new insertionSortDsc();
		sort.insertionSortDescending(arr);
		int max=arr[0];
		return max;
	}
}