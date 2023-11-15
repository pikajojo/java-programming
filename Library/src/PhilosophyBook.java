import java.time.LocalDateTime;

public class PhilosophyBook extends Book{

    private LocalDateTime checkOutTime;
    private LocalDateTime returnTime;
    public PhilosophyBook(String name, String description) {
        super(name, "philosophy", description);
    }

    @Override
    public void setCheckOutTime(LocalDateTime checkOutDate) {
        super.setCheckOutTime(checkOutDate);
        this.checkOutTime = checkOutDate;
        this.returnTime = this.checkOutTime.plusHours(100);
    }

    @Override
    public LocalDateTime getReturnTime() {
        return this.returnTime;
    }
}
