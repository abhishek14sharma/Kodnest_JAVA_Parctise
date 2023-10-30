package Package;

public class MobileSHApp
{
	public static void main(String[] args) 
	{
		MobileSH mobile1=new MobileSH("Samsung", "Purple", 125000);
		System.out.println(mobile1.brand+" "+mobile1.color+" "+mobile1.cost);
		MobileSH mobile2=new MobileSH("Apple", "Gold", 250000);
		System.out.println(mobile2.brand+" "+mobile2.color+" "+mobile2.cost);
	}
}
