package in.cg.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.cg.beans.Address;
import in.cg.beans.Student;

public class MainMethod {
	public static void main(String[] args) {
		
		String config_log = "/in/cg/resources/applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(config_log);
		
		Student std = (Student) context.getBean("StdId");
		std.display();
		
		Student std1 = (Student) context.getBean("StdId1");
		std1.display();
		
		Address obj = (Address) context.getBean("Ad1");
		obj.display();
		
	}
}
