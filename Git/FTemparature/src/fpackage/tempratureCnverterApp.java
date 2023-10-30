package fpackage;

import java.util.Scanner;

public class tempratureCnverterApp 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the temprature in degree Fahrenheit=");
		double farhenheit=scan.nextDouble();
		scan.close();
		tempratureConverter tempratureConverter= new tempratureConverter();
		System.out.println("The temprature in degree Celcius is= "+tempratureConverter.convertFahrenheitToCelsius(farhenheit));
	}
}