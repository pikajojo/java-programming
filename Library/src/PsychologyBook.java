import java.time.LocalDateTime;

public class PsychologyBook extends Book{

    private LocalDateTime checkOutTime;
    private LocalDateTime returnTime;
    public PsychologyBook(String name,String description) {
        super(name, "psychology",description);
    }

    @Override
    public void setCheckOutTime(LocalDateTime checkOutDate) {
        super.setCheckOutTime(checkOutDate);
        this.checkOutTime = checkOutDate;
        this.returnTime = this.checkOutTime.plusHours(48);
    }

    @Override
    public LocalDateTime getReturnTime() {
        return this.returnTime;
    }
}
