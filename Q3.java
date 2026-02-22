package Package_1;

import java.util.HashMap;

public class Q3 {

	public static void main(String[] args) {
		
		HashMap<String, String> users = new HashMap<String, String>();
		users.put("Gaurav_Udh", "gaurav123");
		users.put("Kalpesh_Sarode", "Kalpesh");
		users.put("SoorajPatil", "Sooraj12123");
		
		for (String username : users.keySet()) {
            System.out.println(username + " → " + users.get(username));
        }
		// TODO Auto-generated method stub

	}

}
