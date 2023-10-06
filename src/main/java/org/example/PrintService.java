package org.example;

public class PrintService {

    public static void printToken(int tokenLength) {
        String token = TokenGenerator.tokenGenerator(tokenLength);
        System.out.println("Your token: " + token);
    }
}
