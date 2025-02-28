package com.DSA;

public class stack_using_Array {
    public static void main(String[] args) {
        stack stack = new stack(5);
        System.out.println(stack.isEmpty());
        System.out.println(stack.isFull());
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.pop();

        stack.peek();
        stack.delete_stack();
    }
}
