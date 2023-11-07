package WPO5;

public class Fish extends Animals{
    public Fish(String food) {
        super(food, true,0, "bulubulu","fish");
    }
    public void swim(){
        System.out.println("fish can swim very quickly");
    }
}
