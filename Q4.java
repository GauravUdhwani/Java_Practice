package Package_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q4 {

	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<>();
        numbers.add(45);
        numbers.add(12);
        numbers.add(78);
        numbers.add(3);
        numbers.add(25);
        
        Collections.sort(numbers);
        System.out.println("Ascending Order: " + numbers);

        
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("Descending Order: " + numbers);
		// TODO Auto-generated method stub

	}

}
