package com.DSA;

public class stack_using_Linked_list {
    public static class Node{
        Node next;
        int data;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head=null;
    static void push(int data){
        Node node = new Node(data);
        if (head==null){
            head=node;
            return;
        }
        node.next=head;
        head=node;
    }
    static void pop(){
        if (head==null){
            System.out.println("Empty");
            return;
        }
        head=head.next;
    }
    static void peek(){
        if (head==null){
            System.out.println("Empty");
            return;
        }
        System.out.println(head.data);
    }
    static void delete_stack(){
        if (head==null){
            System.out.println("Empty");
            return;
        }
        head=null;
        System.out.println("The stack is successfully deleted");
    }
    static void traversal(){
        if (head==null){
            System.out.println("Empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;

        }

    }
    public static void main(String[] args) {
        push(1);
        push(2);
        push(3);
        push(4);
        push(5);
        traversal();
        pop();
        traversal();
        peek();
        delete_stack();
    }
}
