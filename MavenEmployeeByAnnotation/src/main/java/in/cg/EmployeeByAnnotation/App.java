package in.cg.EmployeeByAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.cg.Beans.Employee;
import in.cg.resources.Config;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context =  new AnnotationConfigApplicationContext(Config.class);
       Employee emp = (Employee) context.getBean(Employee.class);
       System.out.println(emp);
    }
}
