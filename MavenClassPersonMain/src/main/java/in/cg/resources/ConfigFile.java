package in.cg.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.cg.Beans.Address;
import in.cg.Beans.Person;

@Configuration
public class ConfigFile {
	
	@Bean("person")
	public Person personInfo(){
		Person s1 = new Person();
		s1.setPin(1001);
		s1.setPname("Raj");
		return s1;
	}
	
	@Bean("address")
	public Address addressInfo(){
		Address s1 = new Address();
		s1.setCity("Etawah");
		s1.setPincode(205001);
		
		return s1;
	}

}
