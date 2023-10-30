package Package;

class Mobile 
{
	String brand;
	String color;
	int cost;
	public Mobile(String a, String b, int c)
	{
		brand=a;
		color=b;
		cost=c;
	}
	void allowToCall()
	{
		System.out.println("Tring...Tring...Calling");
	}
	void allowToPlay()
	{
		System.out.println("Start Playing BGMI...");
	}

}
