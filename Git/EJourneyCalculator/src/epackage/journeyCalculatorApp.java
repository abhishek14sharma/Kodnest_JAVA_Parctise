package epackage;

import java.util.Scanner;

public class journeyCalculatorApp 
{
	public static void main(String[] args) 
	{
		journeyCalculator journeyCalculator= new journeyCalculator();
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the speed in kmph=");
		double speed=scan.nextDouble();
		System.out.println("Enter the time in hours=");
		double time=scan.nextDouble();
		journeyCalculator.calculateDistance(speed, time);
		System.out.println("The distance travelled is="+journeyCalculator.calculateDistance(speed, time));
		scan.close();
	}
}