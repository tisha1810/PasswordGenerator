package com.gmail.itisha;

import static homeworks.homework231.PasswordGenerator.generatePassword;

public class Passwords {
    public static void main(String[] args) {
        int passwordLength = 12;
        String generatedPassword = generatePassword(passwordLength);
        System.out.println("Generated password: " + generatedPassword);
    }
}
