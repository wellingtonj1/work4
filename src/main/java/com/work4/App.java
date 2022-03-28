package com.work4;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // clear console
        helper.print("\033[H\033[2J");
        helper.print("Aula 4... ");

        // create a queue 
        Queue<Integer> queue = new LinkedList<Integer>();

        // add in queue 10 Integer
        for (int i = 0; i < 10; i++) {
            // generate random Integer between 0 and 100
            int random = (int) (Math.random() * 100);
            queue.add(random);
        }

        // sum all integers inside queue
        int sum = 0;
        for (int i = 0; i < queue.size(); i++) {
            sum += queue.poll();
        }

        // print sum
        helper.print("\nSum: " + sum);
        
        // print queue 
        helper.print("Queue: " + queue);

        // get queue of even integers in queue
        Queue<Integer> evenQueue = new LinkedList<Integer>();//helper.getEvenQueue(queue);

        Queue<Integer> oddQueue = new LinkedList<Integer>();//helper.getOddQueue(queue); 

        helper.print("Queue: " + queue);

        // While queue is not empty
        while (!queue.isEmpty()) {
            // get first element of queue
            int num = queue.remove();
            // if num is even
            if (num % 2 == 0) {
                // add num in evenQueue
                evenQueue.add(num);
            } else {
                // add num in oddQueue
                oddQueue.add(num);
            }
        }

        helper.print("QueueEven: " + evenQueue);
        
        helper.print("QueueOdd: " + oddQueue);

        helper.print("Queue: " + queue);

        // verify if queue is empty
        if (queue.isEmpty()) {
            helper.print("Queue is empty");
        } else {
            helper.print("Queue is not empty");
        }

    }


}
