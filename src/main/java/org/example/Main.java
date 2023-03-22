package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double rate = 23000;
        double USD,VND;
        System.out.println("Enter USD: ");
        USD = scanner.nextDouble();
        VND = USD * rate;
        System.out.println(VND + "vnd");
    }
}