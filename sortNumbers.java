package com.company;

import java.util.Scanner;

public class sortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt(), secondNumber = scanner.nextInt();
        if (firstNumber < secondNumber) {
            System.out.println(firstNumber + " " + secondNumber);
        } else if (firstNumber > secondNumber) {
            System.out.println(secondNumber + " " + firstNumber);
        } else {
            System.out.println(firstNumber + " " + secondNumber);
        }
    }
}

