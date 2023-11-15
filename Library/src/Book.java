import java.time.LocalDateTime;


public class Book {

    private String name;
    private String type;
    private int ID;
    private String description;
    //asked chatGPT for the representation of time in java.
    private LocalDateTime checkOutTime;
    private LocalDateTime returnTime;

    public Book(String name, String type, String description) {
        this.name = name;
        this.type = type;
        this.description = description;

    }

    public String getName() {
        return name;
    }

    public LocalDateTime getCheckOutTime() {
        return checkOutTime;
    }

    public void setCheckOutTime(LocalDateTime checkOutDate) {
        this.checkOutTime = checkOutDate;
        this.returnTime = this.checkOutTime.plusHours(24);
    }

    public LocalDateTime getReturnTime() {
        return returnTime;
    }

    public String getDescription() {
        return description;
    }


    public int getID() {
        return this.ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

//    LocalDateTime dateTime = LocalDateTime.now();
//        System.out.println("the local time is: " + dateTime);
//
//    // plus 5 hours 4 minutes
//    LocalDateTime dateTimePlus = dateTime.plusHours(5).plusMinutes(4);
//        System.out.println("the local time plus this period is : " + dateTimePlus);
}
