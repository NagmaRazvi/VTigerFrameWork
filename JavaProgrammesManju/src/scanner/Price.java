package scanner;

public class Price {

	public static void main(String[] args) {
		System.out.println("main starts");
		choclate(70);
		icecream(100);
		freshjuice(50);
		icecake(500);
	
		System.out.println("main ends");
		
	}
	public static void choclate(int price)
	{
		System.out.println("choclate() is called");
		System.out.println("the price of the choclate is" + price);
		
	}
	public static void icecream(int price)
	{
		System.out.println("icecream() is called");	
		System.out.println("the price of the icecream is" + price);
		
	}
	public static void freshjuice(int price)
	{
		System.out.println("freshjuice()is called");
		System.out.println("the price of the freshjuice"+ price);
	}
	public static void icecake(int price)
	{
		System.out.println("icecakeis called");
		System.out.println("the price of the ice cake" + price);
	}

}
