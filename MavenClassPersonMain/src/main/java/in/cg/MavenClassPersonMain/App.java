package in.cg.MavenClassPersonMain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.cg.resources.ConfigFile; 
import in.cg.Beans.Address;
import in.cg.Beans.Person;

public class App {
  public static void main(String[] args) {
	  
    ApplicationContext context = new AnnotationConfigApplicationContext(ConfigFile.class);
    
    Person obj = (Person) context.getBean("person");
    Address obj1 = (Address) context.getBean("address");
    System.out.println(obj);
    System.out.println(obj1);
  }
}
