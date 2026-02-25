package in.cg.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.cg.Beans.Student;

@Configuration
public class ConfigFile {
	
	@Bean("st1")
	public Student studentOne() {
		
		Student s1 = new Student();
		s1.setId(101);
		s1.setName("Nitin");
		s1.setEmail("nitin@gmail.com");
		return s1;
		
	}

}
