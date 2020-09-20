package com.company;

import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        final int n = in.nextInt();
        in.nextLine();
        int counter = 0;
        for (int i = 0; i < n; i++) {
            final String[] problem = in.nextLine().split(" ");
            int sureCount = 0;
            for (int j = 0; j < 3; j++) {
                if (problem[j].equals("1")) {
                    sureCount++;
                }
            }
            if (sureCount >= 2) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
