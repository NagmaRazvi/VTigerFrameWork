package encapsulation;

public class TestDriver {

	public static void main(String[] args) 
	{
		Test s=new Test();
		System.out.println(s.getBrand());
		System.out.println(s.getPrice());
		s.setBrand("otto");
		System.out.println(s.getBrand());
		s.setPrice(1500);
		System.out.println(s.getPrice());
		
	}

}
