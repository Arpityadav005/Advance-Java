package in.cg.Beans;

public class Student {
	private int id;
	private String name;
	private String email;
	private Address address;

	public Student(int id,String name,String email,Address address){
		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
		
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", address=" + address + "]";
	}
	
}
