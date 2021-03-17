package com.java21days;

public class Weather {

    public static void main(String[] args) {
	    float fah = 86;
        System.out.println(fah + " stopni Farenheita to ...");
        //Aby skonwertować temperaturę ze stopni Farenheita na stopnie Celsjusza, odejmij 32.
        fah = fah - 32;
        //Podziel przez 9
        fah = fah / 9;
        //Pomnóż przez 5
        fah = fah *5;
        System.out.println(fah + " stopni Celsjusza\n");

        float cel = 33;
        System.out.println(cel + " stopnie Celsjusza to ...");
        //Aby skonwertować temperaturę ze stopni Celsjusza na stopnie Farenheita, pomnóż przez 9.
        cel = cel * 9;
        //Podziel przez 5
        cel = cel / 5;
        //Dodaj 32
        cel = cel + 32;
        System.out.println(cel + " stopni Farenheita");
    }
}
