package in.cg.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.cg.beans.Student;

public class Main {
	
	public static void main(String[]args) {
	
	String config_log = "/in/cg/resources/applicationContext.xml";
	ApplicationContext context = new ClassPathXmlApplicationContext(config_log);
	
	Student s1 = (Student) context.getBean(Student.class);
	
	s1.display();
	}

}
