package in.cg.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.cg.Beans.Student;

public class Main {
	public static void main(String[] args) {
		String config_log = "/in/cg/resources/applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(config_log);
		
		Student st = (Student) context.getBean("StdId");
		st.display();
	}
}
