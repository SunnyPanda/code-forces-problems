package com.company;

import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        final int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            final String str = in.next();
            if (str.length() > 10) {
                final String newStr = "" + str.charAt(0) + (str.length() - 2) + str.charAt(str.length() - 1);
                System.out.println(newStr);
            } else {
                System.out.println(str);
            }
        }
    }
}
