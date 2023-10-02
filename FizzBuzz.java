package WPO1;

public class FizzBuzz {
    private final int StartingNumber;
    private final int FinishingNumber;
    private int number;

    public FizzBuzz(int SN, int FN) {
        this.StartingNumber = SN;
        this.FinishingNumber = FN;
        if (StartingNumber == FinishingNumber){
            number = StartingNumber;
        }
    }

    public void fizzBuzz() {
        int i;
        for (i = StartingNumber; i <= FinishingNumber; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0 && i % 5 != 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0 && i % 3 != 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    public void fizzBuzzOne() {
        if (number % 3 == 0 && number % 5 != 0) {
            System.out.println("Fizz");
        }
        else if (number % 5 == 0 && number % 3 != 0) {
            System.out.println("Buzz");
        }
        else if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("FizzBuzz");
        }
        else {
            System.out.println(number);
        }

    }

}
