package com.gmail.itisha;

import java.util.Scanner;

import static homeworks.homework231.PasswordGenerator.generatePassword;

public class Passwords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter password length: ");
        int passwordLength = scanner.nextInt();
        String generatedPassword = generatePassword(passwordLength);
        System.out.println("Generated password: " + generatedPassword);
    }
}
