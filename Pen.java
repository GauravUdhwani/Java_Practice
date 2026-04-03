package Methods;

public class Pen {
	String brand;
	String color;
	String type;
	int cost;
	
	Pen(String brand)
	{
		this.brand = brand;
	}
	
	Pen(String brand, String color)
	{
		this.brand = brand;
		this.color = color;
	}
	
	Pen(String brand, String color, String type)
	{
		this.brand = brand;
		this.color = color;
		this.type = type;
	}
	
	Pen(String brand, String color, String type, int cost)
	{
		this.brand = brand;
		this.color = color;
		this.type = type;
		this.cost = cost;
	}

	public static void main(String[] args) 
	{
		Pen p1 = new Pen("Reynolds");
		System.out.println("Brand of a Pen : " +p1.brand);
		System.out.println("Color of a Pen : " +p1.color);
		System.out.println("Type of a Pen : " +p1.type);
		System.out.println("Cost of a Pen : " +p1.cost);
		Pen p2 = new Pen("Cello", "Blue");
		System.out.println("---------------------");
		System.out.println("Brand of a Pen : " +p2.brand);
		System.out.println("Color of a Pen : " +p2.color);
		System.out.println("Type of a Pen : " +p2.type);
		System.out.println("Cost of a Pen : " +p2.cost);
		
		// TODO Auto-generated method stub

	}

}
