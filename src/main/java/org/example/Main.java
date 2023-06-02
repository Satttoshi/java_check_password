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
        validationResponse(password);
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

    public static void validationResponse(String password) {
        if (!isInInputRange(password.length())) {
            System.out.println("Your password is not in Range (4 - 20)!"); ;
        } else if (!passwordContainsNumbers(password)) {
            System.out.println("Your password does not contain numbers!");
        } else {
            System.out.println("Your password is valid!");
        }
    }


}