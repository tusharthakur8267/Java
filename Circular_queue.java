package com.DSA;

public class Circular_queue {
    int []arr;
    int topOfQueue;
    int beginning;
    int size;
    Circular_queue(int size){
        this.arr= new int[size];
        this.topOfQueue=-1;
        this.beginning=-1;
        this.size=size;
        System.out.println("The queue is successfully created");
    }
    public boolean isEmpty(){
        if (topOfQueue==-1){
            return true;
        }
        if (arr==null){
            return true;
        }
        return false;
    }
    public boolean isFull(){
        if (topOfQueue+1==size && beginning==0){
            return true;
        }
        else if (topOfQueue+1==beginning){
            return true;
        }
        return false;
    }
    public void enqueue(int value){
        if (isFull()){
            System.out.println("The queue is Full");
            return;
        }
        else if (isEmpty()){
            topOfQueue++;
            beginning=0;
            arr[topOfQueue]=value;
            System.out.println("value "+value+" Inserted in the queue");
        }
        else{
            if (topOfQueue+1==size){
                topOfQueue=0;
            }
            else
                topOfQueue++;
        }
        arr[topOfQueue]=value;
        System.out.println("value "+value+" Inserted in the queue");
    }
    public int dequeue(){
        if (isEmpty()){
            System.out.println("Can't DeQueue Because Queue is Empty");
            return -1;
        }
        else{
            int result = arr[beginning];
            arr[beginning]=0;
            if (beginning==topOfQueue){
                topOfQueue=beginning=-1;
            }
            else if(beginning+1==size){
                beginning=0;
            }
            else
            {
                beginning++;
            }
            System.out.println("The value "+result+" is successfully removed");
            return result;
        }


    }
    public int peek(){
        if (isEmpty()){
            System.out.println("The queue is Empty");
            return -1;
        }
        return arr[beginning];
    }
    public void delete(){
        if (isEmpty()){
            System.out.println("the queue is already Empty");
        }
        arr=null;
        System.out.println("Successfully deleted");
    }
    public static void main(String[] args) {
     Circular_queue queue = new Circular_queue(5);
     queue.enqueue(1);
     queue.enqueue(2);
     queue.enqueue(3);
     queue.enqueue(4);
     queue.enqueue(5);
     queue.dequeue();
     queue.dequeue();
     queue.dequeue();
        System.out.println(queue.peek());
     queue.dequeue();
     queue.delete();
     queue.dequeue();
//     System.out.println(queue.isEmpty());
//     System.out.println(queue.isFull());
    }
}
