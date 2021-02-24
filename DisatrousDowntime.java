package com.company;

import java.util.*;

public class DisatrousDowntime {
    public static void main(String[] args) {
        int n, k, t, sizeOflist = 0;

        Queue<Integer> queue = new LinkedList<Integer>();
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        k = scanner.nextInt();
        for (int i = 0; i < n; i++){
            t = scanner.nextInt();
            if (!queue.isEmpty()){
                if (t - queue.peek() >= 1000){
                    queue.poll();
                }
            }
            queue.add(t);
            if (queue.size() >= sizeOflist){
                sizeOflist = queue.size();
            }
        }

    }
}


