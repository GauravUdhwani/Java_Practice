package Methods;

public class Tests {
	
	public static void add()
	{
		int a = 16;
		int b = 39;
		int c = a+b;
		System.out.println(c);
	}
	
	public static void sub()
	{
		add();
		int a = 10;
		int b = 5;
		int c = a-b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		
		System.out.println("Main start");
		add();
		sub();
		System.out.println("Main end");
		// TODO Auto-generated method stub

	}

}
