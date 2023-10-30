package Package;

public class MobileCOApp 
{
	public static void main(String[] args) 
	{ 
		MobileCO mobile=new MobileCO("Samsung", "Purple", 125000);
		System.out.println(mobile.brand+" "+mobile.color+" "+mobile.cost);
		System.out.println("************************************************");
		MobileCO mobile2 = new MobileCO();
		System.out.println(mobile2.brand+" "+mobile2.color+" "+mobile2.cost);
		System.out.println("*************************************************");
		MobileCO mobile3=new MobileCO("MI");
		System.out.println(mobile3.brand+" "+mobile3.color+" "+mobile3.cost);
		System.out.println("*************************************************");
		MobileCO mobile4=new MobileCO(50000);
		System.out.println(mobile4.brand+" "+mobile4.color+" "+mobile.cost);
	}

}
