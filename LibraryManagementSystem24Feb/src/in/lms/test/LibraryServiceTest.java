package in.lms.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import in.lms.repository.BookRepository;
import in.lms.repository.MemberRepository;
import in.lms.service.*;

class LibraryServiceTest {

    @Test
    void testIssueBook() {

        BookRepository bookRepo = new BookRepository();
        MemberRepository memberRepo = new MemberRepository();

        BookService bookService = new BookService(bookRepo);
        MemberService memberService = new MemberService(memberRepo);

        LibraryService libraryService =
                new LibraryService(bookService, memberService);

        memberService.registerMember(1, "Rahul", "r@gmail.com");
        bookService.addBook(100, "Java", "James");

        libraryService.issueBook(1, 100);

        assertFalse(bookService.getBookById(100).isAvailable());
    }
}
