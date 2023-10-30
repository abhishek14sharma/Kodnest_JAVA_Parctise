package Package;

public class MobileCO 
{
	 String brand;
	 String color; 
	 int cost; 
	 public MobileCO(String a,String b,int c) 
	 { 
		 brand=a;
		 color=b; 
		 cost=c; 
	 } 
	 public MobileCO() 
	 {
		 brand="Apple";color="Gold"; cost=250000; 
	 } 
	 public MobileCO(String x) 
	 { 
		 brand=x; cost=40000; 
	 }
		 public MobileCO(int c)
	 {
			 cost=c; color="Silver"; brand="GIONEE";
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
