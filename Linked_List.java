package com.DSA;
import java.util.HashSet;

public class Linked_List {
 static class Node{
        int data;
        Node next;
        Node(int data){
            this.data= data;
            this.next=null;
        }
    }
    public static Node head = null;
    private static int size =0;

    static void addFirst(int data){
        Node node = new Node(data);
        size++;
        if (head==null){
            head=node;
            return;
        }
        node.next=head;
        head=node;
    }
    static void addLast(int data){
        Node node = new Node(data);
        size++;
        if (head==null){
            head=node;
            return;
        }
        Node last = head;
        while(last.next!=null){
            last=last.next;
        }
        last.next =node;
    }
    static void printlist(){
        if (head== null){
            System.out.println("The Given List Is Empty");
        }
        Node node = head;
        while(node!=null){
            System.out.println(node.data);
            node=node.next;
        }
    }
    static void delete_First(){
        if (head==null){
            System.out.println("Empty");
            return;
        }
        head=head.next;
        size--;
    }
    static void delete_Last(){
        if (head== null){
            System.out.println("Empty");
            return;
        }
        Node prev=head;
        Node node = head.next;

        while (node.next!=null){
            node=node.next;
            prev=prev.next;
        }
        prev.next=null;
        size--;

    }
    static void Insert_Index(int index,int data){
        Node node = new Node(data);
        size++;
        if (head ==null){
            System.out.println("Empty");
        }
        Node a = head;
        Node Nnext = head.next;
        int count =1;
        while (count+1!=index){
            a=a.next;
            Nnext=Nnext.next;
            count++;
        }
        a.next=node;
        node.next=Nnext;
    }
    static void delete_Index(int index){
        if (head==null){
            System.out.println("Empyt");
        }
        Node a=head;
        Node b = head.next;
        int count =1;
        while (count+1 != index){
            a= a. next;
            b = b.next;
            count++;
        }
        a. next=b.next;
        size--;
    }
    static void entire_List(){
        if (head==null){
            System.out.println("Empty");
            return;
        }
        head=null;
        size=0;
        System.out.println("The list is successfully Deleted");
    }

    public static int getSize() {
        return size;
    }
    public static void size(){
        System.out.println("The size of the List is :- "+getSize());
    }

    static void del_duplicate() {

        if (head == null) {
            System.out.println("the list is empty");
        }
        HashSet<Integer> hs = new HashSet<>();
        Node current=head;
        Node prev=null;
        while (current!=null){
            int curval= current.data;
            if (hs.contains(curval)){
                prev.next=current.next;
                size--;

            }
            else {
                hs.add(curval);
                prev=current;
            }
            current=current.next;
        }
    }

    public static void main(String[] args) {
//        addFirst(1);
//        addFirst(2);
//        addFirst(3);
//        addFirst(4);
//        addFirst(5);
        addLast(1);
        addLast(2);
        addLast(5);
        addLast(4);
        addLast(5);
//        delete_First();
//        delete_Last();
//        Insert_Index(3,3);
//        delete_Index(3);
//        delete_Index(3);
        //entire_List();
//        size();
        del_duplicate();
        System.out.println("The size of the new list is :"+ getSize());
        printlist();


    }
}
