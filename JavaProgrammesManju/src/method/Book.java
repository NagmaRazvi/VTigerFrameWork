package method;

public class Book {

	public static void main(String[] args) {
		System.out.println("mains start");
		Bookdetails(12345);
		Bookdetails("abc");
		Bookdetails(12345,"abc","xyz");
		Bookdetails("abc","xyz",12345,1000);
		System.out.println("mains ends");

	}
     public static void Bookdetails(int id)
     {
		System.out.println("Book id is :"  + id);
	}
     public static void Bookdetails(String name)
     {
		System.out.println("Book name is :"  + name);
	}
     public static void Bookdetails(int id , String name, String author)
     {
		System.out.println("Book id is:"  + id  +"\n book name is:"  + name +"\n author name is:"  +author);
		
	}
     public static void Bookdetails( String name,String author ,int id ,double price)
     {
		System.out.println(" book name is:"  + name  +"\n author name is:"  +author + "\n Book id is:"  + id  +" \nbook price is:" +price);
		
	}
}
