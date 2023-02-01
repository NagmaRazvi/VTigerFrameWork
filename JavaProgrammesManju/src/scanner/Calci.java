package scanner;

public class Calci {

	public static void main(String[] args) {
		System.out.println("main start");
		int res = add(10,30);
		System.out.println(res);
		double res1=sub(10.5 ,5);
		System.out.println(res1);
				
		System.out.println("main ends");
	}
   public static int add(int a , int b)
   {
	   int c= a+b;
	   System.out.println("addition starts");
	   return c;
   }
   public static double sub(double d , int i)
   {
	 
	   System.out.println("substraction starts");
	   return d-i;
   }
}
