import java.time.LocalDateTime;

public class NovelBook extends Book{
    private LocalDateTime checkOutTime;
    private LocalDateTime returnTime;

    public NovelBook(String name,String description) {
        super(name, "novel",description);

    }

    @Override
    public void setCheckOutTime(LocalDateTime checkOutDate) {
        super.setCheckOutTime(checkOutDate);
        this.checkOutTime = checkOutDate;
        this.returnTime = this.checkOutTime.plusHours(64);
    }

    @Override
    public LocalDateTime getReturnTime() {
        return this.returnTime;
    }

}
