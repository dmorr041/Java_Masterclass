package academy.learnprogramming;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        float minFloatValue = Float.MIN_VALUE;
        float maxFloatValue = Float.MAX_VALUE;
        System.out.println("Min Float Value = " + minFloatValue);
        System.out.println("Max Float Value = " + maxFloatValue);

        double minDoubleValue = Double.MIN_VALUE;
        double maxDoubleValue = Double.MAX_VALUE;
        System.out.println("Min Double Value = " + minDoubleValue);
        System.out.println("Max Double Value = " + maxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValueUgly = (float) 5.25;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5.00 / 3.00;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);           // Precision is up to 7 decimal places
        System.out.println("myDoubleValue = " + myDoubleValue);         // Precision is up to 16 decimal places

        double myPoundMeasurement = 200;
        System.out.println("5 lbs = " + poundsToKilos(myPoundMeasurement) + " kilos");

        double pi = 3.1415927;
        double anotherNumber = 3_000_000.4_567_890d;
    }

    private static double poundsToKilos(double pounds) {
        return pounds * 0.45359237;
    }
}
