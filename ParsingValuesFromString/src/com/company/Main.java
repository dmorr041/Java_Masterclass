package com.company;

public class Main {

    public static void main(String[] args) {
	    String numberAsString = "2018";
        System.out.println("numberAsAString = " + numberAsString);

        int number = Integer.parseInt(numberAsString);
        System.out.println("number = " + number);

        numberAsString += 1;
        number += 1;

        System.out.println("numberAsAString = " + numberAsString);
        System.out.println("number = " + number);

        // This will error out. parse methods don't handle this out of the box
//        numberAsString = "2018A";
//        number = Integer.parseInt(numberAsString);
//        System.out.println("number = " + number);

        String otherNumberAsString = "2018.125";
        double otherNumber = Double.parseDouble(otherNumberAsString);
        System.out.println("otherNumberAsString = " + otherNumberAsString);
        System.out.println("double = " + otherNumber);

        otherNumber += 0.444;
        System.out.println("double = " + otherNumber);
    }
}
