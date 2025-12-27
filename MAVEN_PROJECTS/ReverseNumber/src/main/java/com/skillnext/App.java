package com.skillnext;

import java.util.Scanner;

public class App {

    // Reverse number using String (no size limit)
    public static String reverseNumber(String num) {
        String reversed = "";

        for (int i = num.length() - 1; i >= 0; i--) {
            reversed = reversed + num.charAt(i);
        }

        return reversed;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String number = sc.nextLine();

        String result = reverseNumber(number);

        System.out.println("Reversed number: " + result);

        sc.close();
    }
}
