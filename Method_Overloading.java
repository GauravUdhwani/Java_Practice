package Day_5;

public class Method_Overloading {
	
	public static void main(String[] args) 
	{
		Arithmetics(8,9);
		// TODO Auto-generated method stub

	}
	
	static void Arithmetics(int a, int b)
	{
		if(a>b)
		{
			System.out.println("The greater no is: " +a);
		}
		else
		{

			System.out.println("The greater no is: " +b);

		}
	}

}
