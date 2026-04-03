package Getter_Setter_Method;

public class Bank {

	private String name;
	private String branch;
	private String ifsc;
	private Long contactno;
	private String location;
	
	public String getName()
	{
		return name;
	}
	
	public String getBranch()
	{
		return branch;
	}
	
	public String getIFSC()
	{
		return ifsc;
	}
	
	public Long getContactNo()
	{
		return contactno;
	}
	
	public String getLocation()
	{
		return location;
	}
	
	Bank(String name, String branch, String ifsc, Long contactno, String location)
	{
		this.name = name;
		this.branch = branch;
		this.ifsc = ifsc;
		this.contactno = contactno;
		this.location = location;
				
	}
	
	public void setBranch(String branch)
	{
		this.branch = branch;
	}
	
	public void setContactNo(Long contactno)
	{
		this.contactno = contactno;
	}
	
	public void setLocation(String location)
	{
		this.location = location;
	}
	
	

	 
	
}
