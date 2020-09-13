package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the height of pyramid");
        int height = in.nextInt();
        int rowCount = 0;

        for (int i = height; i > 0; i--) {

            for (int j = 1; j <= i * 2; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= rowCount; j++) {
                System.out.print(j + " ");
            }

            for (int j = rowCount - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
            rowCount++;
        }
    }
}

