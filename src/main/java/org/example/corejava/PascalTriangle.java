package org.example.corejava;

public class PascalTriangle {
    public static void main(String[] args) {
        int rows = 5; // Change this to generate more rows

        for (int i = 0; i < rows; i++) {
            int number = 1; // First number in each row is always 1

            // Print spaces for alignment
            for (int j = 0; j < rows - i; j++) {
                System.out.print(" ");
            }

            // Print numbers using the binomial coefficient formula
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
            }

            System.out.println();
        }
    }
}

