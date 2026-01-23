package Day_5;

public class factorial {
	
	static int factorial(int n) {
		if (n==1)
			return 1;
		else
			return n*factorial(n-1);
	 }
	 

	public static void main(String[] args) {
		
		factorial f = new factorial();
		System.out.println("The factorial is : "+f.factorial(2));
		
		// TODO Auto-generated method stub
        
	}
	
	

}
