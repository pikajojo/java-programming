//The goal for this exercise is to write a Calculator that has the following functionalities (that need to be inplemented in the associated methods):
//
//addition: add(double a, double b)
//subtraction: subtract(double a, double b)
//multiplication: multiply(double a, double b)
//division: divide(double numerator, double denominator) ! return the numerator for possible edge cases !
//power: power(double base, double exponet)
//Calculation of the surface area of a circle: calculateSurfaceCircle(double radius) !Use a double (accessible beyond the scope of the class) called PI that is equal to 3.1415.
//The calculator should also preform some logic calculations:
//
//OR: logicOr(boolean a, boolean b)
//AND: logicAnd(boolean a, boolean b)
//NOT: logicNot(boolean a)
//Laslty, the calculator should also be able to do calculations for the whole part also known as the integer part of a given double. These methods are named the same as the previous one with the addition of the wordt ‘Int’ at the end of the method name. This should be implemented for the following functionalies: addition, subtraction, mulitplication, division and power. We expect integer outputs for all these methods.
//
//No main() method is needed for this exercise!


package WPO2;
import java.lang.Math;


public class Calculator {
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


    public int addInt(double a, double b){
        return (int) add((int) a, (int) b);
    }

    public int subtractInt(double a, double b){
        return (int) subtract((int) a, (int) b);
    }

    public int  multiplyInt(double a, double b){
        int mul;
        mul = (int) multiply((int) a, (int) b);
        return mul;
    }

    public int divideInt(double numerator, double denominator){
        int div = (int) divide((int) numerator, (int) denominator);
        return div;
    }

    public int powerInt(double base, double exponent){
        int power = (int) power((int) base, (int) exponent);
        return power;
    }

    public boolean logicOr(boolean a, boolean b){
        return a || b;

    }


    public boolean logicAnd(boolean a, boolean b){
        return a & b;

    }

    public boolean logicNot(boolean a){
        return !a;
    }

}

