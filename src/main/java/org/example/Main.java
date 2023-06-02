package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        enterPassword();
    }

    public static void enterPassword() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your password: ");
        String password = scanner.nextLine();
        handleValidation(password);
    }

    public static void handleValidation(String password) {
        if (!isInInputRange(password.length())) {
            System.out.println("Your password is not in Range (4 - 20)!");
            enterPassword();
        } else if (!passwordContainsNumbers(password)) {
            System.out.println("Your password does not contain numbers!");
            enterPassword();
        } else if (!passwordContainsUpperCase(password)) {
            System.out.println("Your password does not contain uppercase letters!");
            enterPassword();
        } else if (isBadPassword(password)) {
            System.out.println("Your password is bad!");
            enterPassword();
        }
        else {
            System.out.println("Your password is valid!");
        }
    }

    public static boolean isInInputRange(int number) {
        return number > 3 && number < 21;
    }

    public static boolean passwordContainsNumbers(String password) {

        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static boolean passwordContainsUpperCase(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static boolean isBadPassword(String password) {
        return password.equals("12345") || password.equals("password");
    }

}