package in.cg.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.cg.Beans.Student;
import in.cg.resources.ConfigFile;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigFile.class);
		
		Student st = (Student )context.getBean("st1");
		System.out.println(st);
	
	}
}
