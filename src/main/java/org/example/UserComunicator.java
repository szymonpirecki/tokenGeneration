package org.example;

import java.util.List;
import java.util.Scanner;

public class UserComunicator {
    static Scanner sc = new Scanner(System.in);

    public static int getTokenLengthFromUser() {
        System.out.println("How long token u want?\n" +
                "5, 10 or 15 characters?");
        int userChoice;
        List<Integer> allowedTokenLengths = TokenGenerator.ALLOWED_TOKEN_LENGTHS;
        while (true) {
            try {
                userChoice = sc.nextInt();
                if (allowedTokenLengths.contains(userChoice)) {
                    sc.close();
                    return userChoice;
                }
                System.out.println("It has to be 5, 10 or 15");
            } catch (java.util.InputMismatchException e) {
                System.out.println("It has to be a number");
                sc.next();
            }
        }
    }
}
