package com.DSA;

public class Queue_linked_list {
  public static class Node{
      Node next;
      int data;
      Node(int data){
          this.data = data;
          this.next=null;
      }
   }
    public  Node head=null;
    public  Node tail= null;

    public boolean isEmpty(){
        if (head==null){
            return true;
        }
        return false;
    }

    public void enqueue(int data){
        Node node = new Node(data);
        if (isEmpty()){
            head=node;
            System.out.println("The value is inserted : "+data);
            return;
        }
        if (tail==null){
            tail=node;
            head.next=tail;
            System.out.println("The value is inserted : "+data);
            return;
        }
        tail.next=node;
        tail=node;
        System.out.println("The value is inserted : "+data);
    }
    public void dequeue(){
        if (isEmpty()){
            System.out.println("Empty");
            return;
        }
        System.out.println("The value is dequeued :- "+head.data);
        head=head.next;

    }
    public void print_list(){
        if (isEmpty()){
            System.out.println("Empty");
            return;
        }
        Node temp =  head;
        while (temp!=null){
            System.out.println(temp.data);
            temp= temp.next;
        }
    }
    public int peek(){
        if (isEmpty()){
            System.out.println("Empty");
            return -1;
        }
        System.out.println("peek value is :- "+head.data);
        return 0;
    }
    public void delete(){
        if (isEmpty()){
            System.out.println("Already deleted");
            return;
        }
        head=null;
        System.out.println("The list is successfully delted");
    }
    public static void main(String[] args) {
        Queue_linked_list queue = new Queue_linked_list();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.print_list();
        queue.dequeue();
        queue.dequeue();
        queue.peek();
        queue.delete();
        queue.delete();

    }
}
