package scanner;

public class Test {
	static int a=90;
	static
	{
		System.out.println("initializer 3 is executing");
	}
	static
	{
		System.out.println("initializer 1 is executing");
	}

	public static void main(String[] args)
	{
		System.out.println("main starts");
System.out.println("main ends");		
	}
	static
	{
		System.out.println("initializer2 i s executing");
	}
	

}
