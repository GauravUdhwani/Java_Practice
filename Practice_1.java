package Q2;

public class Practice_1 {

	public static void main(String[] args) {
		
		String str = "Gaurav";
		String rev = "";
		
	    for(int i = str.length()-1 ; i>=0 ; i--)
	    {
	    	rev = rev+str.charAt(i);
	    }
	    System.out.println("The reversed string is : " +rev);
		// TODO Auto-generated method stub

	}

}
