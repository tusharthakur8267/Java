//package com.DSA;
//
//import java.awt.*;
//
//public class Circular_Linked_list {
//
//    public static class Node{
//        Node next;
//        Node head;
//        int data;
//        Node(int data){
//            this.data=data;
//            this.next=null;
//        }
//    }
//    public static Node head = null;
//    static Node tail = null;
//    public static int size=0;
//
//    static void addFirst(int data){
//        Node node = new Node(data);
//        size++;
//        if (head== null){
//            head = node;
//            tail=node;
//            node.next=head;
//            return;
//        }
//        node.next=head;
//        head=node;
//        tail.next=head;
//    }
//
//    static void InsertATEnd(int data){
//        Node node = new Node(data);
//        size++;
//        if (head==null){
//            head=node;
//            tail=node;
//            node.next=head;
//            return;
//        }
//        tail.next=node;
//        tail=node;
//        node.next=head;
//
//    }
//    static void insert_index(int index, int data){
//        Node node = new Node(data);
//        size++;
//        if (head==null){
//            head=node;
//            tail=node;
//            node.next=head;
//            return;
//        }
//        Node temp=head;
//        Node Next=head.next;
//        int count =0;
//        do {
//            temp=temp.next;
//            Next=Next.next;
//            count++;
//        }
//        while (count!=index);
//        temp.next=node;
//        node.next=Next;
//    }
//
//    static void delete_begin(){
//        if (head==null){
//            System.out.println("Empty");
//            return;
//        }
//        head=head.next;
//        tail.next=head;
//        size--;
//    }
//
//    static void delete_last(){
//        if (head==null){
//            System.out.println("Empty");
//            return;
//        }
//        Node temp=head;
//        do {
//            temp=temp.next;
//        }
//        while(temp.next!=tail);
//        tail=temp;
//        temp.next=head;
//        size--;
//    }
//
//    static void delete_index(int index){
//        if (head==null){
//            System.out.println("Empty");
//            return;
//        }
//        int count=0;
//        Node temp=head;
//        Node Next=head.next;
//        do {
//            temp=temp.next;
//            Next=Next.next;
//            count++;
//        }
//        while (count!=index);
//        temp.next=Next.next;
//        size--;
//
//    }
//
//    public static int getSize() {
//        return size;
//    }
//    static void delete_list(){
//        if (head==null){
//            System.out.println("The list is already Empty");
//        }
//        head=null;
//        tail=null;
//    }
//
//    static void print_list(){
//        Node node = head;
//        if (node == null){
//            size=0;
//            System.out.println("Empty "+"And size is : "+getSize());
//            return;
//        }
//        System.out.println("Size of the List is : "+getSize());
//        do {
//            System.out.println(node.data);
//            node=node.next;
//
//        }
//        while (node!=head);
//    }
//
//
//    public static void main(String[] args) {
////        addFirst(1);
////        addFirst(2);
////        addFirst(3);
////        addFirst(4);
////        addFirst(5);
////        addFirst(6);
//        InsertATEnd(1);
//        InsertATEnd(2);
////        InsertATEnd(3);
//        InsertATEnd(4);
//        InsertATEnd(5);
//        insert_index(3,3);
////        delete_begin();
////        delete_last();
////        delete_index(3);
//        delete_list();
//        print_list();
//
//
//    }
//}
