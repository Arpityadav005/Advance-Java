package in.lms.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.lms.model.Book;
import in.lms.repository.BookRepository;

@Service
public class BookService {
	
	BookRepository bookrepo;
	
	@Autowired
	public BookService(BookRepository bookrepo){
		 this.bookrepo = bookrepo;
	}
	
	public void addBook(int id,String title,String auther){
		
//		Book b = new Book(id,title,auther,true);
//		bookrepo.addBook(b);
		bookrepo.addBook(new Book(id,title,auther,true));
	}
	
	public List<Book> getAvailableBook(){
		 
		List<Book> list = new ArrayList<>();
		
		for(Book book : bookrepo.allBooks()) {
			
			if(book.isAvailable()) {
				list.add(book);
			}
		}
		return list;
	}
	
	
	public Book getBookById(int id) {
		return bookrepo.bookById(id);
	}

}
