import java.time.LocalDateTime;

public class DisciplineBook extends Book {
   private LocalDateTime checkOutTime;
   private LocalDateTime returnTime;


    public DisciplineBook(String name,String type, String description) {
        super(name, "economics", description);
    }

//    @Override
//    public void setCheckOutTime(LocalDateTime checkOutDate) {
//        this.returnTime = checkOutDate.plusHours(56);
//    }


    @Override
    public void setCheckOutTime(LocalDateTime checkOutDate) {
        super.setCheckOutTime(checkOutDate);
        this.checkOutTime = checkOutDate;
        this.returnTime = this.checkOutTime.plusHours(98);
    }
    @Override
    public LocalDateTime getReturnTime() {
        return this.returnTime;
    }
}
