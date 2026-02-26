package in.lms.repository;

import java.util.*;

import org.springframework.stereotype.Repository;

import in.lms.model.Book;

@Repository
public class BookRepository {

	private List<Book> list =  new ArrayList<>();
	
	public void addBook(Book obj) {
		list.add(obj);
	}
	
	public Book bookById(int id) {
		for(Book book : list) {
			if(book.getId() == id){
				return book;
			}
		}
		return null;
	}
	
	public List<Book> allBooks(){
		return list;
	}

}
