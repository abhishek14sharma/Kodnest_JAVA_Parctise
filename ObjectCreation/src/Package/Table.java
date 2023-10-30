package Package;

class Table 
{
	//Attributes or Properties or DataMembers
	int seatingCapacity;
	int cost;
	String colour;
	String brand;
	
	//Behaviors or Functionalities
	void allowToSit()
	{
		System.out.println("User can sit on table which is "+colour+" in colour");
	}
	void allowToWrite()
	{
		System.out.println("User can write in the book by keeping it on the table which cost "+cost+" rupees");
	}

}
