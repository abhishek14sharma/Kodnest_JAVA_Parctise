package com.kodnest.methodoverloading;

public class Monday {
	//#1
public static void main(String[] args) {
	greet();
	int x=20;
	int y=10;
	int res=multi(x,y);
	System.out.println("Multiplication Result "+res);
	int res1=add(x,y);
	System.out.println("Addition Result is "+res1);
	boolean res2=checkGreater(x, y);
	System.out.println(res2);
	int res3=add(x,y)/2;
	System.out.println("Average is "+res3);
	
}
//#2
public static void greet()
{
	System.out.println("Hello World.....");
	
}
//#3
public static int add(int x,int y)
{
	return x+y;
}
//#4
public static void sub()
{
	int a=20;
	int b=10;
	System.out.println("Subtraction Result is "+(a-b));
}
//#5
public static int div(int m,int n)
{
	return m/n;
}
//#6
public static int mod(int a,int b)
{
	return a%b;
}
//#7
public static int multi(int x,int y)
{
	return x*y;
}
public static  boolean checkGreater(int x,int y)
{
	return x>y;
}

}
