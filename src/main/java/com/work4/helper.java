package com.work4;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;  // Import the Scanner class


public class helper {

    public static void print(String str) {
        System.out.println(str);
    }

    /**
     * Function to return scan int
     */
    public static Scanner scan() {
        return new java.util.Scanner(System.in);
    }

    // Gest only Even Integers from queue
    public static Queue<Integer> getEvenQueue(Queue queue) {
        Queue<Integer> queueEven = new LinkedList<Integer>();
        for (Object obj : queue) {
            int num = (int) obj;
            if (num % 2 == 0) {
                // remove by reference the num from queue
                queue.remove(num);
                queueEven.add(num);
            }
        }
        return queueEven;
    }

    public static Queue<Integer> getOddQueue(Queue queue) {
        Queue<Integer> queueOdd = new LinkedList<Integer>();
        for (Object obj : queue) {
            int num = (int) obj;
            if (num % 2 != 0) {
                // remove num from original queue 
                queue.remove(num);
                queueOdd.add(num);
            }
        }
        return queueOdd;
    }
}
