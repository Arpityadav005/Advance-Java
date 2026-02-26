package in.lms.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import in.lms.repository.BookRepository;
import in.lms.service.BookService;

class BookServiceTest {

    @Test
    void testAddBook() {

        // Arrange (create objects manually)
        BookRepository repo = new BookRepository();
        BookService service = new BookService(repo);

        // Act (perform action)
        service.addBook(1, "Java", "James");

        // Assert (check result)
        assertEquals(1, service.getAvailableBook().size());
    }
}
