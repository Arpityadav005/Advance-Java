package in.lms.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.lms.config.ConfigFile;
import in.lms.service.BookService;
import in.lms.service.LibraryService;

public class MainClass {
	
	public static void main(String[]args) {
	
	ApplicationContext context = new AnnotationConfigApplicationContext(ConfigFile.class);
	
	BookService bs = (BookService) context.getBean(BookService.class);
	LibraryService ls = (LibraryService) context.getBean(LibraryService.class);
	
	System.out.println("Avaialable books");
	bs.getAvailableBook().forEach(System.out::println);
	System.out.println("===== Issuing Book =====");
    ls.issueBook(1, 101);
    System.out.println("\n===== Available Books After Issue =====");
    bs.getAvailableBook()
               .forEach(System.out::println);


	}
}
