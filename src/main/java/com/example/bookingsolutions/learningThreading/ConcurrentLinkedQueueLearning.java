package com.example.bookingsolutions.learningThreading;


// conncurent Linked Queue is a thread safe , lock free , non blocking queue in java's.
// Desgined for highly concurrent  enviorments where thread can safely enque and deque without explict synchronization


import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * Unlike local linked list (which is not thread safe). concurrentLinkedQueue is optimized for multi threaded performance by using
 * compare and Swap operation instead of locks
 * Thread Safe :- can safely used by multiple threads without external synchronization
 * Lock-free :-  instead of using synchronization it uses compare and sweep
 * non blocking :- threads will never be blocked while performing operations , making it more efficient than blocking queue
 * FIFO :- As it is type of queue.Elements are retrieved in the FIFO order.
 *
 */

public class ConcurrentLinkedQueueLearning {
    public static void main(String[] args){
        ConcurrentLinkedQueue<String> concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
        concurrentLinkedQueue.offer("test");
        concurrentLinkedQueue.offer("test1");
        concurrentLinkedQueue.offer("test2");

        System.out.println(concurrentLinkedQueue.peek());
        System.out.println(concurrentLinkedQueue.poll());
        System.out.println(concurrentLinkedQueue.isEmpty());
        System.out.println(concurrentLinkedQueue.size());
    }
}
