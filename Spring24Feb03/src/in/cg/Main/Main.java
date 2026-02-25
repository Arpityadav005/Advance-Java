package in.cg.Main;
import in.cg.resources.ConfigFile;
import in.cg.Beans.Student;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigFile.class);
		
		Student st = (Student) context.getBean(Student.class);
		System.out.println(st);
	}
}
