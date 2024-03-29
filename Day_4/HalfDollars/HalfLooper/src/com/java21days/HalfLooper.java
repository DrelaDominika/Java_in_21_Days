package com.java21days;

public class HalfLooper {

    public static void main(String[] args) {
        int[] denver = { 1_700_000, 4_600_000, 2_100_000 };
        int[] philadelphia = { 1_800_000, 5_000_000, 2_500_000 };
        int[] total = new int[denver.length];
        int sum = 0;

        for (int i = 0; i < denver.length; i++) {
            total[i] = denver[i] + philadelphia[i];
            System.out.format("Produkcja w " + (i + 2012) + ": %,d%n",
                    total[i]);
            sum += total[i];
        }

        System.out.format("Średnia produkcja: %,d%n",
                (sum / denver.length));
    }
}
