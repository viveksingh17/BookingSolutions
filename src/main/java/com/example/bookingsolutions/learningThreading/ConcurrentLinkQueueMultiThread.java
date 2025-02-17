package com.example.bookingsolutions.learningThreading;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLinkQueueMultiThread {
    public static void main(String[] args){
        ConcurrentLinkedQueue<Integer> queue  = new ConcurrentLinkedQueue<>();

        Thread producer = new Thread(()->{
           for(int i=0;i<=5;i++){
               queue.offer(i);
               System.out.println("Produced:"+ i);
               try{
                   Thread.sleep(500);
               } catch(Exception ignored){

               }
           }
        });

        // consumer thread

        Thread consumer = new Thread(()->{
            while(true){
                Integer value = queue.poll();
                if(value!=null){
                    System.out.println("consumed: "+ value);
                }
                try{
                    Thread.sleep(200); } catch (Exception ignored){}
            }
        });
        producer.start();
        consumer.start();
    }
}
