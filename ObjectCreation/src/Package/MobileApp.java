package Package;

public class MobileApp 
{
	public static void main(String[] args) 
	{
		Mobile mobile = new Mobile("Samsung","Pink",12000);
		System.out.println(mobile.brand+" "+mobile.color+" "+mobile.cost);
		mobile.allowToCall();
		mobile.allowToPlay();
		//Below line is error because compiler did not add default constructor as already one user defined constructor is present in class
		//Mobile mobile2 = new Mobile();
	}

}
