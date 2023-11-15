import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Library {

    List<Book> booksInLibrary;
    List<Book> booksList;
    List<User> usersBorrowedBooks;
    int booksUniqueID = 0;
//    List<User> usersOverDue;

    public Library() {
        this.booksInLibrary = new ArrayList<>();
        this.booksList = new ArrayList<>();
        this.usersBorrowedBooks = new ArrayList<>();
        this.storeBooksforLibrary();
    }


    public void addBooksInLibrary(Book book) {
        book.setID(++booksUniqueID);
        this.booksInLibrary.add(book);
        this.booksList.add(book);

    }

    public void storeBooksforLibrary(){
        addBooksInLibrary(new NovelBook("To the Lighthouse","To the Lighthouse is a 1927 novel by Virginia Woolf. The novel centres on the Ramsay family and their visits to the Isle of Skye in Scotland between 1910 and 1920."));
        addBooksInLibrary(new PhilosophyBook("The Myth of Sisyphus","The Myth of Sisyphus (French: Le mythe de Sisyphe) is a 1942 philosophical essay by Albert Camus."));
        addBooksInLibrary(new PhilosophyBook("The Second Sex ","The Second Sex is a 1949 book by the French existentialist philosopher Simone de Beauvoir, in which the author discusses the treatment of women in the present society as well as throughout all of history."));
        addBooksInLibrary(new DisciplineBook("Macroeconomics", "economics","Macroeconomics is a macroeconomics textbook written by American economist Gregory Mankiw."));
        addBooksInLibrary(new PsychologyBook("Counselling For Toads","Toad is suffering with depression which results in him seeking the help of a counsellor. They use transactional analysis to work though Toad's depression."));


    }

    public Book findBookByID(int booksUniqueID){
        for(Book book: booksList){
            if(book.getID() == booksUniqueID){
                return book;
            }}
        return null;
    }


    public void checkOutFromUser(User user, int booksUniqueID, LocalDateTime time){
        Book book = findBookByID(booksUniqueID);
        if(booksInLibrary.contains(book)){
        user.borrowBook(book);
        booksInLibrary.remove(book);
        book.setCheckOutTime(time);
        if(!usersBorrowedBooks.contains(user)){
        usersBorrowedBooks.add(user);}
        }


    }

    public void returnFromUser(User user, int booksUniqueID){
        Book book = findBookByID(booksUniqueID);
        if(user.getBooksInPossession().contains(book)){
        user.returnBook(book);
        booksInLibrary.add(book);
        if(user.getBooksInPossession().size() == 0){
            usersBorrowedBooks.remove(user);
        }}else{
            System.out.println("Please check again, the user did not borrow this book.");
        }

    }

//    public void checkUsersOverDue(){
//        for(User user: usersBorrowedBooks){
//            if(user.getBooksInPossession() != null){
//                for(Book book:user.getBooksInPossession()){
//                    if(book.getReturnTime().isAfter(LocalDateTime.now())){
//
//                    }
//                }
//            }
//        }
//    }

//    public void checkUsersOverDue(){
//        for(User user: usersBorrowedBooks){
//            user.setListOfBooksOverDue();
//        }
//    }

//    public List<Book> getBooksInUserHand(){
//        List<Book> booksInUserHand = new ArrayList<>();
//        for(Book book: booksList){
//            if(!booksInLibrary.contains(book)){
//                booksInUserHand.add(book);
//            }
//        }
//        return booksInUserHand;
//    }


    public void contactUsers() {
        boolean booksOverDue = false;
        if (usersBorrowedBooks.size()>0) {
            for (User user : usersBorrowedBooks) {
                if (user.countNumberOfBooksOverDue() > 0) {
                    booksOverDue = true;
                    System.out.println(user.getName() + " still has " + user.getNumberOfBooksOverDue() + " book(s) to be returned. and all books borrowed by "+user.getName()+" is(are) " + user.printBooksInPossession());
                }

            }
            if(booksOverDue == false){
                System.out.println("No user have books to be returned over due.");
            }
        }else{
            System.out.println("No user borrow any books yet, no need to contact anyone.");
        }
    }

    public List<Book> getBooksInLibrary() {
        return booksInLibrary;
    }



    public List<User> getUsersBorrowedBooks() {
        return usersBorrowedBooks;

    }

    public void showUsersBorrowedBooks(){
        if(usersBorrowedBooks == null){
            System.out.println("No users borrow any books yet.");
        }
        System.out.print("user(s) who have borrowed from library is(are) ");
        for(User user: usersBorrowedBooks){
            System.out.print(user.getName()+" ");
        }
        System.out.println("\n");
    }



    public static void main(String[] args) {
        User jason = new User("jason");
        User nikki = new User("nikki");
        User bonny = new User("bonny");
        User roman = new User("roman");


        Library vubLib = new Library();


        vubLib.checkOutFromUser(jason,2,LocalDateTime.parse("2022-11-14T10:00:00"));
        vubLib.checkOutFromUser(jason,4,LocalDateTime.parse("2022-11-14T10:00:00"));
        vubLib.checkOutFromUser(nikki,1,LocalDateTime.parse("2022-11-14T10:00:00"));
        vubLib.checkOutFromUser(roman,3,LocalDateTime.parse("2022-11-14T10:00:00"));

//        vubLib.checkUsersOverDue();
        vubLib.contactUsers();

        vubLib.showUsersBorrowedBooks();

        vubLib.returnFromUser(jason, 2);
        vubLib.returnFromUser(roman, 3);

        vubLib.checkOutFromUser(jason,3,LocalDateTime.parse("2023-11-02T10:00:00"));
        vubLib.checkOutFromUser(bonny,2, LocalDateTime.parse("2023-11-09T10:00:00"));

        vubLib.showUsersBorrowedBooks();

        jason.showBooksInPossession();

//        vubLib.checkUsersOverDue();
        vubLib.contactUsers();


    }


}
