package com.company;

import java.util.Scanner;

public class Watermelon {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        final int weight = in.nextInt();
        final String canDivideIntoToEvenParts = weight > 3 && weight % 2 == 0 ? "YES" : "NO";

        System.out.println(canDivideIntoToEvenParts);
    }
}
