package in.cg.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.cg.Beans.Student;

@Configuration
public class ConfigFile {
	
	@Bean("st1")
	public Student studentOne() {
	    return new Student(101, "Nitin", "nitin@gmail.com");
	}


}
