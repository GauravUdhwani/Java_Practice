package Day_5;

public class Book {
	
	String book_name;
	double Price;
	
	Book(String book_name, double Price)
	{
		this.book_name = book_name;
		this.Price = Price;
	}
	
	void Printdetails()
	{
		System.out.println("Enter name of the book : "+book_name);
		System.out.println("Enter Price of the same book : "+Price);
	}
	

	
	public static void main(String[] args) 
	{
		Book B1 = new Book("XYZ", 789);
		B1.Printdetails();
		// TODO Auto-generated method stub

	}

}
