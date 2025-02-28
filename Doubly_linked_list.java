//package com.DSA;
//
//public class Doubly_linked_list {
//    static class Node{
//        int data;
//        Node prev;
//        Node next;
//        Node(int data){
//            this.data=data;
//            this.next=null;
//            this.prev=null;
//        }
//    }
//    static Node head=null;
//    static Node tail = null;
//    static int size=0;
//    static void insert_begin(int data){
//        Node node= new Node(data);
//        size++;
//        Node temp = head;
//        if (head==null){
//            head=node;
//            tail=node;
//            return;
//        }
//        head.prev=node;
//        node.next=head;
//        head=node;
//    }
//    static void print_list(){
//        if (head==null){
//            System.out.println("The List is Empty"+"And The Size is :"+getSize());
//            return;
//        }
//        System.out.println("The size of the list is :"+getSize());
//        Node temp=head;
//        while(temp!=null){
//            System.out.println(temp.data);
//            temp=temp.next;
//        }
//
//    }
//    static void reverse_traversal(){
//        if (head==null){
//            System.out.println("Empty "+"And the size is : "  +getSize());
//            return;
//        }
//        System.out.println("The size of the list is : "+ getSize());
//        Node temp=tail;
//        while (temp!=null){
//            System.out.println(temp.data);
//            temp=temp.prev;
//        }
//    }
//    static void insert_end(int data){
//        Node node = new Node(data);
//        size++;
//        if (head==null){
//            head=node;
//            tail=node;
//            return;
//        }
//
//        tail.next=node;
//        node.prev=tail;
//        tail=node;
//    }
//    static void insert_index(int data, int index){
//        Node node = new Node(data);
//        size++;
//        if (head==null){
//            head=node;
//            tail=node;
//            return;
//        }
//        Node temp = head;
//        Node Next = head.next;
//        int count=1;
//        while(count!=index-1){
//            temp=temp.next;
//            Next=Next.next;
//            count++;
//        }
//        temp.next=node;
//        node.next=Next;
//        Next.prev=node;
//        node.prev=temp;
//    }
//    static void delete_begin(){
//        if (head==null){
//            System.out.println("Empty");
//            size=0;
//            return;
//
//        }
//        head=head.next;
//        head.prev=null;
//        size--;
//    }
//    static void delete_index(int index){
//        if (head==null){
//            System.out.println("Empty");
//            size=0;
//            return;
//        }
//        Node temp= head;
//        int count = 1;
//
//        while(count!=index-1){
//            temp=temp.next;
//            count++;
//        }
//        Node Next=temp.next.next;
//        temp.next=Next;
//        Next.prev=temp;
//        size--;
//
//    }
//    static void delete_last(){
//        if (head==null){
//            System.out.println("Empty");
//            size=0;
//            return;
//        }
//        tail=tail.prev;
//        tail.next=null;
//        size--;
//    }
//    static void delete_list(){
//        if (head==null){
//            System.out.println("Empty");
//            size=0;
//            return;
//        }
//        head=null;
//        tail=null;
//        size=0;
//    }
//    public static int getSize(){
//        return size;
//    }
//
//    public static void main(String[] args) {
////        insert_begin(5);
////        insert_begin(4);
////        insert_begin(3);
////        insert_begin(2);
////        insert_begin(1);
//////        print_list();
////        reverse_traversal();
//        insert_end(1);
//        insert_end(2);
//
//        insert_end(4);
//        insert_end(5);
//        insert_index(3,3);
////        delete_begin();
////        print_list();
////        delete_index(3);
//       delete_last();
////        delete_list();
//
//        print_list();
////        reverse_traversal();
//
//    }
//}
