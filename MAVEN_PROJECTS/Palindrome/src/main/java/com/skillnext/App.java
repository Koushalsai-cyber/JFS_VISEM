package com.skillnext;

import java.util.Scanner;

public class App {

    // Method to check number palindrome
    public static boolean isNumberPalindrome(int num) {
        int original = num;
        int reversed = 0;

        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num / 10;
        }

        return original == reversed;
    }

    // Method to check string palindrome
    public static boolean isStringPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Number palindrome
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (isNumberPalindrome(number)) {
            System.out.println(number + " is a Number Palindrome");
        } else {
            System.out.println(number + " is NOT a Number Palindrome");
        }

        sc.nextLine(); // clear buffer

        // String palindrome
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        if (isStringPalindrome(text)) {
            System.out.println("\"" + text + "\" is a String Palindrome");
        } else {
            System.out.println("\"" + text + "\" is NOT a String Palindrome");
        }

        sc.close();
    }
}
