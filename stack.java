package com.DSA;

public class stack {
    int [] arr;
    int topOfStack;
    stack(int size){
        this.arr= new int[size];
        this.topOfStack=-1;
        System.out.println("Stack created successfully");
    }
    public boolean isEmpty(){
        if (topOfStack==-1){
            return true;
        }
        return false;
    }
    public boolean isFull(){
        if (topOfStack==arr.length-1){
            return true;
        }
        return false;
    }
    public void push(int data){
        if (isFull()){
            System.out.println("The stack is already Full");
            return;
        }
        arr[topOfStack+1]=data;
        topOfStack++;
        System.out.println(" value : "+data+" is successfully added to the stack");
    }
    public void peek(){
        if (isEmpty()){
            System.out.println("Stack has no elements Stack is Empty");
            return;
        }
        System.out.println(arr[topOfStack]);
    }
    public void pop(){
        if (isEmpty()){
            System.out.println("The stack is Empty! Can't Pop");
            return;
        }
        int topstack= arr[topOfStack];
        topOfStack--;
        System.out.println("The element "+topstack+" is successfully deleted from the stack");
    }
    public void delete_stack(){
        if (isEmpty()){
            System.out.println("The stack is already Empty");
            return;
        }
        arr=null;
        System.out.println("Deleted");
    }
}
