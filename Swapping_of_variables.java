package Q2;

public class Swapping_of_variables {

	public static void main(String[] args) 
	{
		int a = 15;
		int b = 20;
		System.out.println("Before Swapping of variables");
        System.out.println("a : " +a);
        System.out.println("b : " +b);
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("After Swapping of variables");
        System.out.println("a : " +a);
        System.out.println("b : " +b);
		// TODO Auto-generated method stub

	}

}
