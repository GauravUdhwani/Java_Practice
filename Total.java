package Array_Package;

public class Total {

	public static void main(String[] args) {
		
		int[] a = {10,20,30,40,50,60};
		int sum = 0;
		
		for(int i = 0;i<=a.length-1;i++)
		{
			sum = sum+a[i];
		}
		System.out.println("Sum of an elements in an array :" +sum);
		// TODO Auto-generated method stub

	}

}
