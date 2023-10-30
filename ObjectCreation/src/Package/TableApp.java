package Package;

public class TableApp 
{
	public static void main(String[] args)
	{
		Table t1=new Table();
		t1.seatingCapacity=6;
		t1.cost=4500;
		t1.colour="brown";
		t1.brand="greenPly";
		t1.allowToSit();
		t1.allowToWrite();
		System.out.println(t1.seatingCapacity+" "+t1.cost+" "+t1.colour+" "+t1.brand);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		Table t2=new Table();
		t2.seatingCapacity=4;
		t2.cost=3000;
		t2.colour="black";
		t2.brand="greenPly";
		t2.allowToSit();
		t2.allowToWrite();
		System.out.println(t2.seatingCapacity+" "+t2.cost+" "+t2.colour+" "+t2.brand);
	}

}
