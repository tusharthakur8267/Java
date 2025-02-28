//package com.DSA;
//
//public class circular_doubly_list {
//    static class Node{
//        int data;
//        Node next;
//        Node prev;
//        Node(int data){
//            this.data=data;
//            this.next=null;
//            this.prev=null;
//        }
//    }
//    public static Node head=null;
//    public static Node tail=null;
//    public static int size = 0;
//
//    static void insert_begin(int data){
//        Node node = new Node(data);
//        size++;
//        if (head==null){
//            head=node;
//            head.next=tail;
//            tail=node;
//            tail.next=head;
//            tail.prev=head;
//            head.prev=tail;
//
//            return;
//        }
//        head.prev=node;
//        node.next=head;
//        head=node;
//        head.prev=tail;
//        tail.next=head;
//
//
//    }
//    static void insert_last(int data){
//        Node node = new Node(data);
//        size++;
//        if (head==null){
//            head=node;
//            head.next=tail;
//            tail=node;
//            tail.next=head;
//            tail.prev=head;
//            head.prev=tail;
//
//            return;
//        }
//        node.next=head;
//        node.prev=tail;
//        tail.next=node;
//        tail=node;
//        head.prev=tail;
//
//
//    }
//
//
//
//    static void print_list(){
//        if (head==null){
//            System.out.println("Empty"+"And Size is :"+getSize());
//            return;
//        }
//        Node temp= head;
//        System.out.println("The size of the list is :"+ getSize());
//       do {
//            System.out.println(temp.data);
//            temp=temp.next;
//        }while (temp!=head);
//
//        }
//    static void print_rev(){
//        if (head==null){
//            System.out.println("Empty and size of the list is : "+getSize());
//            return;
//        }
//        Node temp= tail;
//        System.out.println("The size of the list is :"+getSize());
//        do {
//            System.out.println(temp.data);
//            temp=temp.prev;
//        }while (temp!=tail);
//
//    }
//    static void insert_index(int data, int index){
//        Node node = new Node(data);
//        size=size+1;
//        if (head == null){
//            head=node;
//            head.next=tail;
//            tail=node;
//            tail.next=head;
//            tail.prev=head;
//            head.prev=tail;
//            return;
//        }
//        int count =1;
//        Node temp = head;
//        Node Next=head.next;
//        while (count!=index-1){
//            temp=temp.next;
//            Next=Next.next;
//            count++;
//        }
//        node.next=Next;
//        node.prev=temp;
//
//        Next.prev=node;
//        temp.next=node;
//
//    }
//
//    static void delete_begin(){
//        if (head==null){
//            System.out.println("Empty");
//            return;
//        }
//        head=head.next;
//        head.prev=tail;
//        tail.next=head;
//        size--;
//    }
//
//    static void delete_last(){
//        if(head==null){
//            System.out.println("Empty");
//            return;
//        }
//        tail=tail.prev;
//        head.prev=tail;
//        tail.next=head;
//        size--;
//    }
//    static void delete_index(int index){
//        if (head==null){
//            System.out.println("Empty");
//            return;
//        }
//        int count=1;
//        Node temp = head;
//        while (count!=index-1){
//            count++;
//            temp=temp.next;
//        }
//        Node Next=temp.next.next;
//        temp.next=Next;
//        Next.prev=temp;
//        size--;
//    }
//
//    static void delete_list(){
//        if (head==null){
//            System.out.println("Already Empty");
//            return;
//        }
//        head=null;
//        tail=null;
//        size=0;
//        System.out.println("Successfully deleted");
//    }
//    public static int getSize() {
//        return size;
//    }
//
//    public static void main(String[] args) {
////        insert_begin(1);
////        insert_begin(2);
////        insert_begin(4);
////        insert_begin(5);
////        insert_index(3,3);
//        insert_last(1);
//        insert_last(2);
//        insert_last(3);
//        insert_last(4);
//        insert_last(5);
////        print_rev();
//        print_list();
////        delete_begin();
////        delete_last();
////        delete_index(3);
////        delete_list();
////        print_rev();
////        insert_last(1);
////        insert_index(1,1);
////        System.out.println(getSize());
//
//    }
//}
