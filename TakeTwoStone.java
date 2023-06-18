package com.company;

import java.util.Scanner;

public class TakeTwoStone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.nextInt() % 2 == 0) {
            System.out.println("Bob");
        } else {
            System.out.println("Alice");
        }
    }
}
