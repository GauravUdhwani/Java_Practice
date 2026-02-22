package Package_1;

import java.util.HashSet;

public class Q2 {

	public static void main(String[] args) {
		
		HashSet<String> Browsers = new HashSet<String>();
		Browsers.add("Chrome");
		Browsers.add("Internet Explorer");
		Browsers.add("Chrome");
		Browsers.add("Internet Explorer");
		Browsers.add("Microsoft Edge");
		
		for(String a : Browsers)
		{
			System.out.println(a);
		}
		
		// TODO Auto-generated method stub

	}

}
