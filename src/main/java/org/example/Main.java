package org.example;

import java.time.LocalTime;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        if (currentTime.isAfter(LocalTime.of(5, 0)) && currentTime.isBefore(LocalTime.of(12, 0))) {
            System.out.println("Good morning Ignacio! Welcome to COMP367");
        } else if (currentTime.isAfter(LocalTime.of(12, 0)) && currentTime.isBefore(LocalTime.of(17, 0))) {
            System.out.println("Good afternoon Ignacio! Welcome to COMP367");
        } else {
            System.out.println("Good evening Ignacio! Welcome to COMP367");
        }
    }
}