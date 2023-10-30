package Package;

public class CameraApp 
{
	public static void main(String[] args) 
	{
		Camera c1= new Camera("Sony","Black",45000);
		c1.captureImage();
		c1.displayImage();
		Camera c2= new Camera("Nikon","Grey",30000);
		c2.captureImage();
		c2.displayImage();
		
	}

}
