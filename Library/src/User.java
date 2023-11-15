import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private List<Book> booksInPossession;
    private List<Book> booksOverDue;
    private int numberOfBooksOverDue = 0;


    public User(String name) {
        this.name = name;
        this.booksInPossession = new ArrayList<>();
        this.booksOverDue = new ArrayList<>();
    }

    public void borrowBook(Book book) {
        this.booksInPossession.add(book);
    }

    public void returnBook(Book book) {
        this.booksInPossession.remove(book);
        if(booksOverDue.contains(book)){
            booksOverDue.remove(book);
        }
    }

    public String getName() {
        return name;
    }


    public String printBooksInPossession() {
        String books = "";
        for (Book book : booksInPossession) {
            books += book.getName() + " ";
        }

        return books;

    }

    public List<Book> getBooksInPossession(){
        return this.booksInPossession;
    }

    public void showBooksInPossession(){
        String books = "";
        for (Book book : booksInPossession) {
            books += book.getName() + " ";
        }

        System.out.println(this.name+" borrowed book(s) named "+books);
        System.out.println("\n");
    }


    public int countNumberOfBooksOverDue() {
        numberOfBooksOverDue = 0;
        for (Book book : this.booksInPossession) {
            if(book.getReturnTime().isBefore(LocalDateTime.now())){
                this.numberOfBooksOverDue += 1;
            }

        }
        return numberOfBooksOverDue;

    }

//    public void setListOfBooksOverDue() {
//        this.booksOverDue = null;
//        if(this.booksInPossession != null){
//        for (Book book : this.booksInPossession) {
//            if (book.getReturnTime().isBefore(LocalDateTime.now())) {
//                this.booksOverDue.add(book);
//            }
//        }
//    }
//    }


            public int getNumberOfBooksOverDue() {
                return numberOfBooksOverDue;
        }


//    public List<Book> getListOfBooksOverDue(){
//        return this.booksOverDue;
//    }
}
