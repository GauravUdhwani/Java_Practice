package Day_5;

public class Calculator {
	
	int calculate(int a, int b)
	{
		return a+b;
		
	}
	
	double calculate(double a, double b)
	{
		return a+b;
		
	}

	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		System.out.println("Sum of integers " +c.calculate(30, 40));
		System.out.println("Sum of doubles "+c.calculate(34.5, 67.8));
		// TODO Auto-generated method stub

	}

}
