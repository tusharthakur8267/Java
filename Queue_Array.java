package com.DSA;

public class Queue_Array {
    public static void main(String[] args) {
        Queue queue = new Queue(4);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
////        queue.enqueue(5);
//        queue.dequeue();
//        queue.dequeue();
//        queue.dequeue();
//        queue.dequeue();
//        queue.enqueue(5);
////        queue.isEmpty();
////        queue.isFull();
//        System.out.println(queue.peek());
        queue.delete_queue();
        queue.enqueue(1);
        queue.peek();
        queue.dequeue();
    }


}
