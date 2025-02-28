package com.DSA;

public class Queue {
    int []arr;
    int top;
    int begin;
    Queue(int size){
        this.arr=new int[size];
        this.top=-1;
        this.begin=-1;
        System.out.println("The queue is created successfully");
    }
    void enqueue(int data){
        if (arr==null){
            System.out.println("This queue has been deleted please create queue again");
            return ;
        }
        if (isFull()){
            System.out.println("The queue is Full");
            return;
        }
        else if (isEmpty()){
            begin=0;
            top++;
            arr[top]=data;
            System.out.println("The value is successfully "+data);
            return;
        }
        top++;
        arr[top]=data;
        System.out.println("The value "+data+" is successfully inserted");
    }
    Boolean isEmpty(){
        if (top==-1){
            return true;
        }
        return false;
    }
    Boolean isFull(){
        if (top==arr.length-1){
            return true;
        }
        return false;
    }
    void dequeue(){
        if (arr==null){
            System.out.println("This queue has been deleted please create queue again");
            return ;
        }
        if (isEmpty()){
            System.out.println("The queue is empty");
            return;
        }
        else {
            begin++;
            System.out.println(arr[begin-1]+" is successfully removed from the queue");
        }

        if (begin>top){
            top=begin=-1;
        }


    }
    int peek(){
        if (isEmpty()){
            System.out.println("Empty");
            return -1;
        }
        else if (arr==null){
            System.out.println("This queue has been deleted please create queue again");
            return -1;
        }
        return arr[begin];
    }
    void delete_queue(){
        if (isEmpty()){
            System.out.println("Empty");
            return;
        }
        arr = null;
        System.out.println("The queue is successfully deleted");
    }
}
