package in.cg.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	private int id;
	private String name;
	private String email;
	
	public int getId() {
		return id;
	}
	
	@Value("1002")
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	@Value("LPU")
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	@Value("lpu@gmail.com")
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public void display(){
		
		System.out.println("Name: "+name+" email: "+email+" id: "+id);
	}
	
	
}
