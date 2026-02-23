package in.cg.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.cg.beans.Student;
import in.cg.resources.SpringJavaConfigFile;


public class MainClass {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringJavaConfigFile.class);
		
		//Student s1 = (Student) context.getBean(Student.class);
		Student s1 = (Student) context.getBean("stdObj",Student.class);
	    Student s2 = (Student) context.getBean("stdId");
	    Student s3 = (Student) context.getBean("stdObj");
	
		s1.display();
		s2.display();
		s3.display();
		
	}
	

}
