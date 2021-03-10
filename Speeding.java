package com.company;

import java.util.Scanner;

public class Speeding {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int index, time, miles;
        int highestSpeed= 0, oldTime= 0, oldMiles= 0;
        index = scanner.nextInt();
        for (int i = 0; i < index; i++){
            time = scanner.nextInt();
            miles = scanner.nextInt();
            if (time > 0 && miles > 0 ){
                if (highestSpeed < (miles-oldMiles)/(time-oldTime)){
                    highestSpeed = (miles-oldMiles)/(time-oldTime);
                }
            }
            oldMiles = miles;
            oldTime = time;
        }   System.out.println(highestSpeed);
    }
}
