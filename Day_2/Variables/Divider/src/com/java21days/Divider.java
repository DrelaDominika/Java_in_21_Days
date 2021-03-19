package com.java21days;

public class Divider {

    public static void main(String[] args) {
	    double x = 50;
        double y = 8;

        double division = x / y;
        double remainder = x % y;

        System.out.println(x + " divided by " + y);
        System.out.println("\nResult\tRemainder");
        System.out.println(division + "\t" + remainder);

    }
}
