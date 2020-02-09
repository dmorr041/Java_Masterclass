public class Hello {
    public static void hello() {
        System.out.println("Hello, Darien");
    }

    public static void main(String[] args) {
        hello();

        int myFirstNumber = 5;
        int mySecondNumber = 12;
        int myThirdNumber = 6;
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        float myFirstFloat = 4.2f;
        double myFirstDouble = 4.2;
        String mySecondString = "carneasaduuh";
        int myFirstExpression = 10 + 5 + (2 * 10);

        int myLastOne = myTotal - 1000;

        boolean flag = true;
        byte B = 2;
        char x = 'a';
        short smallNumber = 2;
        long bigNumber = 34567687;

        System.out.println("myFirstNumber: " + myFirstNumber);
        System.out.println("myFirstFloat: " + myFirstFloat);
        System.out.println("myFirstDouble: " + myFirstDouble);
        System.out.println("mySecondString: " + mySecondString);
        System.out.println("myFirstExpression: " + myFirstExpression);
        System.out.println("myTotal: " + myTotal);
        System.out.println("myLastOne: " + myLastOne);
    }
}
