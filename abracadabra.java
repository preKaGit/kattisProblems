package com.company;

import java.util.Scanner;

public class abracadabra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputDigit = scanner.nextInt();
        for (int i = 1; i <= inputDigit; i++)  {
            System.out.println(i + " " + "Abracadabra");
        }
    }
}
