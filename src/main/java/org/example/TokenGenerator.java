package org.example;

import java.util.List;
import java.util.Random;

public class TokenGenerator {

    private static final String ALLOWED_CHARACTERS =
            "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()";
    public static final List<Integer> ALLOWED_TOKEN_LENGTHS =
            List.of(5, 10, 15);

    public static String tokenGenerator(int tokenLength) {
        Random random = new Random();
        StringBuilder token = new StringBuilder(tokenLength);
        for (int i = 0; i < tokenLength; i++) {
            char symbol = ALLOWED_CHARACTERS.charAt(random.nextInt(ALLOWED_CHARACTERS.length()));
            token.append(symbol);
        }
        return token.toString();
    }
}
