package com.kodnest.test;

import java.util.Scanner;

public class kodnestSearchSortApp 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Array Length");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" Elements");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Press 1 for Search");
		System.out.println("Press 2 for Sorting");
		System.out.println("Press 3 for Finding Minimum");
		System.out.println("Press 4 for Finding Maximum");
		System.out.println("Select Your Choice");
		int choice=scan.nextInt();
		switch(choice)
		{
		case 1:
		{
			System.out.println("Press 1 for Linear Search");
			System.out.println("Press 2 for Binary Search");
			int search=scan.nextInt();
			switch(search)
			{
			case 1:
			{
				System.out.println("Enter the Key");
				int key=scan.nextInt();
				int res=new kodnestSearchSort().linearSearching(arr, key);
				if(res>=0)
				{
					System.out.println("Key Fount at Index "+res);
				}
				else
				{
					System.out.println("Key Not Found");
				}
				break;
				
			}
			case 2:
			{
				System.out.println("Enter the Key");
				int key=scan.nextInt();
				int res=new kodnestSearchSort().binarySearching(arr, key);
				if(res>=0)
				{
					System.out.println("Key Fount at Index "+res);
				}
				else
				{
					System.out.println("Key Not Found");
				}
				break;
			}
			default:
			{
				System.out.println("That's a Wrong Number");
				break;
			}
			}
			break;
		}
		case 2:
		{
			System.out.println("Press 1 for Bubble Sort");
			System.out.println("Press 2 for Selection Sort");
			System.out.println("Press 3 for Insertion Sort");
			int sort=scan.nextInt();
			switch(sort)
			{
			case 1:
			{
				System.out.println("Press 1 for Ascending Order");
				System.out.println("Press 2 for Descending Order");
				int order=scan.nextInt();
				switch(order)
				{
				case 1:
				{
					System.out.println("Elements Before Sorting....");
					for(int i=0;i<arr.length-1;i++)
					{
						System.out.print(arr[i]+" ");
					}
					kodnestSearchSort asc=new kodnestSearchSort();
					asc.bubbleSortingAscending(arr);
					System.out.println();
					System.out.println("Elements After Sorting....");
					for(int i=0;i<=arr.length-1;i++)
					{
						System.out.print(arr[i]+" ");
					}
					break;
				}
				case 2:
				{
					System.out.println("Elements Before Sorting....");
					for(int i=0;i<arr.length-1;i++)
					{
						System.out.print(arr[i]+" ");
					}
					kodnestSearchSort dsc=new kodnestSearchSort();
					dsc.bubbleSortingDescending(arr);
					System.out.println();
					System.out.println("Elements After Sorting....");
					for(int i=0;i<=arr.length-1;i++)
					{
						System.out.print(arr[i]+" ");
					}
					break;
					
				}
				default:
				{
					System.out.println("That's a Wrong Number");
					break;
				}
				}
				break;
			}
			case 2:
			{
				System.out.println("Press 1 for Ascending Order");
				System.out.println("Press 2 for Descending Order");
				int order=scan.nextInt();
				switch(order)
				{
				case 1:
				{
					System.out.println("Elements Before Sorting....");
					for(int i=0;i<arr.length-1;i++)
					{
						System.out.print(arr[i]+" ");
					}
					kodnestSearchSort asc=new kodnestSearchSort();
					asc.secectionSortAscending(arr);
					System.out.println();
					System.out.println("Elements After Sorting....");
					for(int i=0;i<=arr.length-1;i++)
					{
						System.out.print(arr[i]+" ");
					}
					break;
				}
				case 2:
				{
					System.out.println("Elements Before Sorting....");
					for(int i=0;i<arr.length-1;i++)
					{
						System.out.print(arr[i]+" ");
					}
					kodnestSearchSort dsc=new kodnestSearchSort();
					dsc.secectionSortDescending(arr);
					System.out.println();
					System.out.println("Elements After Sorting....");
					for(int i=0;i<=arr.length-1;i++)
					{
						System.out.print(arr[i]+" ");
					}
					break;
					
				}
				default:
				{
					System.out.println("That's a Wrong Number");
					break;
				}
				}
				break;
			}
			case 3:
			{
				System.out.println("Press 1 for Ascending Order");
				System.out.println("Press 2 for Descending Order");
				int order=scan.nextInt();
				switch(order)
				{
				case 1:
				{
					System.out.println("Elements Before Sorting....");
					for(int i=0;i<arr.length-1;i++)
					{
						System.out.print(arr[i]+" ");
					}
					kodnestSearchSort asc=new kodnestSearchSort();
					asc.insertionSortAscending(arr);
					System.out.println();
					System.out.println("Elements After Sorting....");
					for(int i=0;i<=arr.length-1;i++)
					{
						System.out.print(arr[i]+" ");
					}
					break;
				}
				case 2:
				{
					System.out.println("Elements Before Sorting....");
					for(int i=0;i<arr.length-1;i++)
					{
						System.out.print(arr[i]+" ");
					}
					kodnestSearchSort dsc=new kodnestSearchSort();
					dsc.insertionSortDescending(arr);
					System.out.println();
					System.out.println("Elements After Sorting....");
					for(int i=0;i<=arr.length-1;i++)
					{
						System.out.print(arr[i]+" ");
					}
					break;
					
				}
				default:
				{
					System.out.println("That's a Wrong Number");
					break;
				}
				}
				break;
			}
			}
			break;
		}
		case 3:
		{
			int res=new kodnestSearchSort().findMin(arr);
			System.out.println("The Minimum Element is "+res);
			break;
		}
		case 4:
		{
			int res=new kodnestSearchSort().findMax(arr);
			System.out.println("The Maximum Element is "+res);
			break;
		}
		default:
		{
			System.out.println("That's a Wrong Number");
			break;
		}
		}
		scan.close();
	}
}