package in.cg.beans;

public class Student {

	private String name;
	private String email;
	private int id;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public void display(){
		
		System.out.println("Name: "+name+" email: "+email+" id: "+id);
	}
	
	
}
