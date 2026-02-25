package in.cg.Beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	private int id;
	private String name;
	private String email;
	
	private Address a;


	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Autowired
	public void setA(Address a) {
	    this.a = a;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + "Address "+a+" ]";
	}
	

}
