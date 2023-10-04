package WPO2;

public class CalculatorV2 {
    public double PI = 3.1415;


    public double add(double a, double b) {
        double sum;
        sum = a + b;
        return sum;
    }

    public double subtract(double a, double b) {
        double sub;
        sub = a - b;
        return sub;
    }

    public double multiply(double a, double b) {
        double mul;
        mul = a * b;
        return mul;
    }

    public double divide(double numerator, double denominator) {
        double div;
        if (denominator == 0) {
            return numerator;
        } else {
            div = numerator / denominator;
            return div;
        }
    }

    public double power(double base, double exponent) {
        double pow;
        pow = Math.pow(base, exponent);
        return pow;
    }

    public double calculateSurfaceCircle(double radius) {
        double surface;
        surface = PI * radius * radius;
        return surface;
    }


    public int addInt(double a, double b) {
        return (int) add((int) a, (int) b);
    }

    public int subtractInt(double a, double b) {
        return (int) subtract((int) a, (int) b);
    }

    public int multiplyInt(double a, double b) {
        int mul;
        mul = (int) multiply((int) a, (int) b);
        return mul;
    }

    public int divideInt(double numerator, double denominator) {
        int div = (int) divide((int) numerator, (int) denominator);
        return div;
    }

    public int powerInt(double base, double exponent) {
        int power = (int) power((int) base, (int) exponent);
        return power;
    }

    public boolean logicOr(boolean a, boolean b) {
        return a || b;

    }


    public boolean logicAnd(boolean a, boolean b) {
        return a & b;

    }

    public boolean logicNot(boolean a) {
        return !a;
    }


    public boolean isPrime(int number) {
        int i = 2;
        if(number == 0 || number == 1){
            return false;
        }
        while (i < number){
            if(number % i == 0){
                return false;
            }else{
                i += 1;
            }
        }
        return true;
    }

    //Calculate the Fibonacci number at place N using the method fibonacciNumber(int N). The Fibonacci number is the sum of the two previous Fibonacci numbers.
    public int fibonacciNumber(int N){
        if(N == 0){
            return 0;
        }else if(N == 1){
            return 1;
        }else{
            int[] fibonacci = new int[N+1];
            fibonacci[0] = 0;
            fibonacci[1] = 1;
            for(int i = 2; i < N+1; i++){
                fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
            }
            return fibonacci[N];
        }

    }


    //Determine if a number is an Armstrong number for a given power.
    public boolean armstrongNumbers(int number, int power){
        if(number == 0 & power == 0){
            return true;
        }
        String numStr = Integer.toString(number);
        int digit = numStr.length();

        int[] digitArray = new int[digit];
        digitArray[digit-1] = (int) (number / Math.pow(10, digit-1));

        for(int i = 0; i < digit-1; i++){
            digitArray[i] = (int) ((int) (number % Math.pow(10, i+1)) / Math.pow(10, i));
        }
        int total = 0;
        for (int i = 0; i < digit; i++){
            total += Math.pow(digitArray[i], power);
        }

        return total == number;
    }
    //int[] digitArray = new int[4];
    //// 将每一位数字提取到数组中
    //digitArray[3] = number / 1000;          // 千位数字
    //digitArray[2] = (number % 1000) / 100;  // 百位数字
    //digitArray[1] = (number % 100) / 10;    // 十位数字
    //digitArray[0] = number % 10;




    //Calculate the factorial of a number using the method factorial(ind number)
    public int factorial(int number){
        int total = 1;
        for (int i = 1; i <= number; i++){
            total = total * i;
        }
        return total;

    }


    //Reverse the order of all the digits in a number.
    // Make sure the end result is still a number! Do this in the method numberReversal(int number)
    public int numberReversal(int number){
        String numStr = Integer.toString(number);
        int digit = numStr.length();

        int[] originalArray = new int[digit];
        int[] reverseArray = new int[digit];

        for (int i = 0; i < digit; i++){
            char digitChar = numStr.charAt(i);
            int digitNum = Character.getNumericValue(digitChar);
            originalArray[i] = digitNum;
        }

        for (int i = 0; i < digit; i++){
            reverseArray[i] = originalArray[digit-1-i];
        }

        int result = 0;
        for (int i = 0; i < digit; i++){
            result = result * 10 + reverseArray[i];
        }
        return result;

    }



    //Given two arrays of integers, find the index of the two numbers that give the largest product.
    // Implement this in the method productMaximiser(int[] a, int[] b).
    // The output should be an array with two integers, each integer is the index of thier respective arrays.

    public int[] productMaximiser(int[] a, int[] b){
        int maxProduct = Integer.MIN_VALUE;
        int[] result = new int[2];
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < b.length; j++){
                int product = a[i] * b[j];
                if (product > maxProduct){
                    maxProduct = product;
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }



    public static void main(String[] args) {
        CalculatorV2 calculator2 = new CalculatorV2();
        System.out.println(calculator2.isPrime(12));
        System.out.println(calculator2.isPrime(13));
        System.out.println(calculator2.fibonacciNumber(8));
        System.out.println(calculator2.armstrongNumbers(153, 3));
        System.out.println(calculator2.armstrongNumbers(154, 3));
        System.out.println(calculator2.factorial( 3));
        System.out.println(calculator2.numberReversal(123));
        int[] result = calculator2.productMaximiser(new int[]{1, 2, 3}, new int[] {4, 5, 6, 2, 10000});
        System.out.println();
    }

}

