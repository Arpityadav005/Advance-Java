package in.cg.Beans;

public class Student {
	private int id;
	private String name;
	private String email;
	private Address address;

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

	public void setAddress(Address address) {
	    this.address = address;
	}

	
	public void display()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(email);
		System.out.println(address);
	}
}
