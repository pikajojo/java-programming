package WPO5;

public class Eagle extends Animals {
    public Eagle(String food) {
        super(food, false, 2, "kuku", "Eagle");
    }

  public void fly(){
      System.out.println("Eagles can fly");
  }
}
