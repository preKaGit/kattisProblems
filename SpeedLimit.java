package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SpeedLimit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> finalSpeed = new ArrayList<Integer>();
        int value = 0;
        while ((value = scanner.nextInt()) != -1) {
               int count = value;
               int previousHour = 0;
               int totalmiles = 0;
               int index = 0;
               while ((index++) < count) {
                   System.out.println(count);
                   int speed = scanner.nextInt();
                   int currentHour = scanner.nextInt();
                   totalmiles += speed * (currentHour - previousHour);
                   previousHour = currentHour;
                }
                finalSpeed.add(totalmiles);
            }
            for (int miles : finalSpeed) {
                System.out.println(miles + " miles");
            }
        }


    }


