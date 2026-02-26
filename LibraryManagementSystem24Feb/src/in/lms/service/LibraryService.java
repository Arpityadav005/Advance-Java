package in.lms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.lms.model.Book;
import in.lms.model.Member;

@Service
public class LibraryService {
	BookService bookService;
	MemberService memberService;
	@Autowired
	public LibraryService(BookService bookService,MemberService memberService) {
		this.bookService = bookService;
		this.memberService= memberService;
	}
	
	
	public void issueBook(int memberId, int bookId) {

	    Member member = memberService.getMemberById(memberId);
	    Book book = bookService.getBookById(bookId);

	    if(member == null) {
	        System.out.println("Member not found");
	        return;
	    }

	    if(book == null) {
	        System.out.println("Book not found");
	        return;
	    }

	    if(!book.isAvailable()) {
	        System.out.println("Book not available");
	        return;
	    }

	    book.setAvailable(false);
	    System.out.println("Book issued successfully");
	}


}
