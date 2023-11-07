package WPO5;

public class Elephant extends Animals{
    public Elephant(String food) {
        super(food,true, 4, "nuuuu", "Elephant");
    }

    public void walk(){
        System.out.println("Elephant walks very slowly");
    }
}
