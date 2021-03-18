package com.java21days;

public class Investor {

    public static void main(String[] args) {
	    float money = 14_000;
        System.out.println("Initial amount: " + money);
	    //money after 1st year
        money = money + (money * .4F);
        System.out.println("Money after 1st year: " + money);
        //money after 2nd year
        money = money - 1500F;
        System.out.println("Money after 2nd year: " + money);
        //money after 3rd year
        money = money + (money * .12F);
        System.out.println("Money after 3rd year: " + money);
    }
}
