package Package;

public class FanApp 
{
	public static void main(String[] args)
	{
		Fan f1=new Fan();
		f1.numberOfWIngs=3;
		f1.colour="black";
		f1.cost=2100;
		f1.brand="Usha";
		System.out.println(f1.numberOfWIngs+" "+f1.colour+" "+f1.cost+" "+f1.brand);
		f1.rotate();
		f1.blowAir();
		System.out.println("***********************************************************************************************");
		Fan f2=new Fan();
		f2.numberOfWIngs=4;
		f2.colour="brown";
		f2.cost=2400;
		f2.brand="Cinni";
		System.out.println(f2.numberOfWIngs+" "+f2.colour+" "+f2.cost+" "+f2.brand);
		f2.rotate();
		f2.blowAir();
		System.out.println("***********************************************************************************************");
		Fan f3=new Fan();
		f3.numberOfWIngs=5;
		f3.colour="white";
		f3.cost=3000;
		f3.brand="Crompton";
		System.out.println(f3.numberOfWIngs+" "+f3.colour+" "+f3.cost+" "+f3.brand);
		f3.rotate();
		f3.blowAir();
	}

}
