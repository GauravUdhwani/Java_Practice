package Getter_Setter_Method;

public class Bank_Driver {

	public static void main(String[] args) {
		
		Bank b1 = new Bank("PNB", "Kutchery Road", "IFSC00276001", 9079236762L, "Ajmer");
		System.out.println("Bank Name : "+b1.getName());
		System.out.println("Branch Name : "+b1.getBranch());
		System.out.println("IFSC : "+b1.getIFSC());
		System.out.println("Contact No : "+b1.getContactNo());
		System.out.println("Location : "+b1.getLocation());
		
		
		System.out.println("-------------------------------------");
		b1.setBranch("MGH");
		b1.setContactNo(9829322709L);
		b1.setLocation("Jodhpur");
		
		System.out.println("Bank Name : "+b1.getName());
		System.out.println("Branch Name : "+b1.getBranch());
		System.out.println("IFSC : "+b1.getIFSC());
		System.out.println("Contact No : "+b1.getContactNo());
		System.out.println("Location : "+b1.getLocation());
		// TODO Auto-generated method stub

	}

}
