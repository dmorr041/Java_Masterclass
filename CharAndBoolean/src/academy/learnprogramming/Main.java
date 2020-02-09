package academy.learnprogramming;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        char myChar = 'D';                          // 16 bits for unicode characters
        char myUnicodeChar = '\u0044';
        char myUnicodeChar2 = '\u00a9';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);
        System.out.println(myUnicodeChar2);

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;
        boolean isOver21 = true;
        System.out.println(isOver21);
    }
}
