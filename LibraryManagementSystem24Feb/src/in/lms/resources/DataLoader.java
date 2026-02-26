package in.lms.resources;
import in.lms.service.*;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements InitializingBean {

    private BookService bookService;
    private MemberService memberService;

    public DataLoader(BookService bookService, MemberService memberService) {
        this.bookService = bookService;
        this.memberService = memberService;
    }

    @Override
    public void afterPropertiesSet() {
        loadData();
    }

    private void loadData() {
        memberService.registerMember(1, "Rahul", "rahul@gmail.com");
        memberService.registerMember(2, "Anita", "anita@gmail.com");

        bookService.addBook(101, "Java", "James Gosling");
        bookService.addBook(102, "Spring", "Rod Johnson");

        System.out.println("Initial data loaded...");
    }
}
