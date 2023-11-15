import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.time.LocalDateTime;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private User jason;
    private User nikki;
    private User bonny;
    private User roman;



    private Library VUBLib;
    //used code from the BankingTest
    private final ByteArrayOutputStream output = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {

        System.setOut(new PrintStream(output));
    }

    @Before
    public void setupUser(){
        jason = new User("jason");
        nikki = new User("nikki");
        bonny = new User("bonny");
        roman = new User("roman");
    }

    @Before
    public void setupLibrary(){
        VUBLib = new Library();
    }

    @Test
    public void testCheckoutFromUser(){
        VUBLib.checkOutFromUser(jason,2, LocalDateTime.parse("2023-11-01T10:00:00"));
        VUBLib.checkOutFromUser(nikki,1,LocalDateTime.parse("2023-11-02T10:00:00"));
        VUBLib.checkOutFromUser(roman,3,LocalDateTime.parse("2023-11-04T10:00:00"));
        assertEquals(2, VUBLib.booksInLibrary.size());
        assertEquals(3,VUBLib.usersBorrowedBooks.size());
    }



    @Test
    public void testContactUsersWithNoUsers() {
        VUBLib.usersBorrowedBooks = new ArrayList<>();
        VUBLib.contactUsers();
        Assert.assertEquals("No user borrow any books yet, no need to contact anyone.",
                output.toString().trim());
    }

    @Test
    public void testContactUsersWithUserButNoOverdueBooks() {
        VUBLib.checkOutFromUser(jason,2,LocalDateTime.parse("2024-11-14T10:00:00"));
        VUBLib.checkOutFromUser(nikki,1,LocalDateTime.parse("2024-11-14T10:00:00"));
        VUBLib.checkOutFromUser(roman,3,LocalDateTime.parse("2024-11-14T10:00:00"));
        VUBLib.contactUsers();
        Assert.assertEquals("No user have books to be returned over due.",
                output.toString().trim());
    }


    @Test
    public void testContactUsersWithOverdueBooks() {
        VUBLib.checkOutFromUser(jason,2,LocalDateTime.parse("2022-11-14T10:00:00"));
        VUBLib.checkOutFromUser(jason,4,LocalDateTime.parse("2022-11-14T10:00:00"));
        VUBLib.checkOutFromUser(nikki,1,LocalDateTime.parse("2022-11-14T10:00:00"));
        VUBLib.checkOutFromUser(roman,3,LocalDateTime.parse("2022-11-14T10:00:00"));

        Assert.assertEquals(2, jason.countNumberOfBooksOverDue());


        VUBLib.contactUsers();
        Assert.assertEquals("jason still has 2 book(s) to be returned. and all books borrowed by jason is(are) The Myth of Sisyphus Macroeconomics \n" +
                        "nikki still has 1 book(s) to be returned. and all books borrowed by nikki is(are) To the Lighthouse \n" +
                        "roman still has 1 book(s) to be returned. and all books borrowed by roman is(are) The Second Sex",
                output.toString().trim());
    }

    @Test
    public void testReturnFromUser(){
        VUBLib.checkOutFromUser(jason,2,LocalDateTime.parse("2023-11-14T10:00:00"));
        VUBLib.checkOutFromUser(nikki,1,LocalDateTime.parse("2023-11-14T10:00:00"));
        VUBLib.checkOutFromUser(roman,3,LocalDateTime.parse("2023-11-14T10:00:00"));

        VUBLib.returnFromUser(jason,2);
        VUBLib.returnFromUser(nikki,1);
        VUBLib.returnFromUser(roman,3);

        assertEquals(5, VUBLib.booksInLibrary.size());
        assertEquals(0, VUBLib.usersBorrowedBooks.size());
        assertEquals(0, jason.getBooksInPossession().size());



    }






}
