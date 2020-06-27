package com.company;

public class Main {

    public static void main(String[] args) {
	    String string = "I am a String. Yes, I am.";
        System.out.println(string);
        String yourString = string.replaceAll("I", "You");
        System.out.println(yourString);

        String alphanumeric = "abcDeeeF12Ghhiiiiijk199z";
        /**
         * The . class is the wildcard class. Matches any character.
         */
        System.out.println(alphanumeric.replaceAll(".", "Y"));

        /**
         * The ^ class starts at the beginning of the string and replaces if it finds a match.
         * Matches must be exact matches... the third printout below means we won't match because
         * there's a 'c' in between 'ab' and 'D'
         */
        // ^ class starts at the beginning of the string, replaces what is found
        System.out.println(alphanumeric.replaceAll("^abcDeee", "YYY"));

        // If no match is found, the original string is returned. That is true for both expressions below
        System.out.println(alphanumeric.replaceAll("^1234", "YY"));
        System.out.println(alphanumeric.replaceAll("abD", "ZZ"));

        // Only matches the first occurrence
        String alphanumeric2 = "abcDeeeF12GhhiiabcDeeeiiijk199z";
        System.out.println(alphanumeric2.replaceAll("^abcDeee", "XXX"));
    }
}
