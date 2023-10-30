package Package;

public class MobileSH 
{
	 String brand;
	 String color; 
	 int cost; 
	 public MobileSH(String brand,String color,int cost) 
	 {
		 //shadowing problem
		 //brand=brand;
		 //color=color; 
		 //cost=cost;
		 
		 //Shadowing Solution
		 this.brand=brand;
		 this.color=color;
		 this.cost=cost;
	 }
	 void allowToCall()
	 { 
		 System.out.println("TRING....TRING..Calling...");
	 } 
	 void allowToPlay()
	 {
	 System.out.println("Start Playing BGMI_._.");
	 }
}
