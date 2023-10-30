package Package;

public class Camera 
{
	String brand;
	String color;
	int cost;
	public Camera(String x, String y, int z)
	{
		brand=x;
		color=y;
		cost=z;
	}
	void captureImage()
	{
		System.out.println("Brand "+brand+" color "+color+" cost "+cost+" is capturing the image.");
	}
	void displayImage()
	{
		System.out.println("Brand "+brand+" color "+color+" cost "+cost+" is displaying the image.");
	}

}
