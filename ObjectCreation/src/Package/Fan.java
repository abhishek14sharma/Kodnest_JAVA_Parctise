package Package;

class Fan 
{
	int numberOfWIngs;
	String colour;
	int cost;
	String brand;
	
	void rotate()
	{
		System.out.println("This rotating fan is of "+colour+" colour, "+brand+" brand, has "+numberOfWIngs+" number of wings & cost "+cost+" rupees.");
	}
	void blowAir()
	{
		System.out.println("The "+colour+" colour fan is blowing air.");
	}

}
