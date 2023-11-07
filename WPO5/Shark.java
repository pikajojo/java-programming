package WPO5;

public class Shark extends Animals {
    public Shark(String food) {
        super(food, false, 0, "oww", "shark");
    }

    public void jump() {
        System.out.println("shark can jump very high");
    }
}