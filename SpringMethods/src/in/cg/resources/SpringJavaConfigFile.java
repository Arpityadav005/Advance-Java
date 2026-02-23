package in.cg.resources;

import in.cg.beans.Student;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringJavaConfigFile {
	
	@Bean
	public Student stdId() {
		
		Student s1 = new Student();
		s1.setId(1001);
		s1.setName("Raj");
		s1.setEmail("raj@gmail.com");
		
		return s1;	
		
	}
	
	@Bean("stdObj")
	public Student createStudentObject() {
		
		Student s1 = new Student();
		s1.setId(1005);
		s1.setName("Raja");
		s1.setEmail("raja@gmail.com");
		
		return s1;	
		
	}


}
