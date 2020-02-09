package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        /**
         * Formula for largest/smallest number possible -
         * Where:
         * N = num of bits
         *
         * Max (positive) value = 2 ^ (N - 1) - 1
         * Min (negative) value = - (2 ^ (N - 1))
         * */
        
        // 32 bits === (2^(32 - 1)) - 1 for positive, -(2^(32 - 1)) for negative
        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Min Value = " + myMinIntValue); 
        System.out.println("Integer Max Value = " + myMaxIntValue);       
        System.out.println("Busted Max Value = " + (myMaxIntValue + 1));    // Overflow
        System.out.println("Busted Min Value = " + (myMinIntValue - 1));    // Underflow
        int myMaxIntTest = 2_147_483_647;

        // 8 bits === (2^(8 - 1)) - 1 for positive, -()
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Min Value = " + myMinByteValue);
        System.out.println("Byte Max Value = " + myMaxByteValue);

        // 16 bits
        long myMinShortValue = Short.MIN_VALUE;
        long myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Min Value = " + myMinShortValue);
        System.out.println("Short Max Value = " + myMaxShortValue);
        
        // 64 bits
        long myLongValue = 100L;        // Need the L to declare longs
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Min Value = " + myMinLongValue);
        System.out.println("Long Max Value = " + myMaxLongValue);

        short bigShortLiteralValue = 32767;
        int myTotal = myMinIntValue / 2;
        byte myNewByteValue = (byte) (myMinByteValue / 2);       // Type casting syntax
        short myNewShortValue = (short) (myMinShortValue / 2);   // Java assumes default of int primitive type

        byte anotherByteValue = 127;
        short anotherShortValue = 32767;
        int anotherIntValue = 32;

        long longTotal = 50000L + (10L * (anotherByteValue + anotherIntValue + anotherShortValue));
        System.out.println("Evaluation of primitive types challenge = " + longTotal);
    }
}
