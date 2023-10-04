package WPO1;

public class Pyramid {
    private double LengthOfTheBase;
    private double height;
    private int NumberOfSides;

    public Pyramid(double lotb, double height, int nos){

        this.LengthOfTheBase = lotb;
        this.height = height;
        if(nos == 3 || nos == 4) {
            this.NumberOfSides = nos;
        }
        else{
            this.NumberOfSides = 4;
            System.out.println("the input is changed");
        }
    }

    public double getVolume() {
        double volume;
        if (NumberOfSides == 3) {
            volume = Math.sqrt(3) / 12.0 * LengthOfTheBase * LengthOfTheBase * height;
        }
        else{
            volume = 1.0 / 3.0 * LengthOfTheBase * LengthOfTheBase * height;
        }

        return Math.abs(volume);
    }
}
