//package com.DSA;
//
//public class LL {
//    Node head;
//    private int size;
//    static class Node{
//        String data;
//        Node next;
//
//        Node(String d){
//            this.data=d;
//            this.next=null;
//        }
//    }
//    public void deleteFirst(){
//        size--;
//        if (head==null){
//            System.out.println("Empty");
//
//        }
//        head=this.head.next;
//    }
//    public void addFirst(String data){
//        size++;
//        Node newnode =new Node(data);
//        if (head==null){
//            head=newnode;
//            return;
//        }
//        newnode.next=head;
//        head= newnode;
//    }
//    public void deleteLast(){
//        size--;
//        if(head==null){
//            System.out.println("Empty");
//        }
//        Node currentNode= head;
//        Node lastnode = head.next;
//        while(lastnode.next!= null){
//            currentNode=currentNode.next;
//            lastnode= lastnode.next;
//        }
//        currentNode.next=null;
//    }
//    public void addLast(String data){
//        size++;
//        Node newnode = new Node(data);
//        if (head== null){
//            head=newnode;
//            return;}
//
//        Node lastNode = head;
//
//        while(lastNode.next !=null){
//            lastNode=lastNode.next;
//        }
//        lastNode.next=newnode;
//
//    }
//    public void printlist(){
//        Node currentnode =head;
//        if (head==null){
//            System.out.println("List is Empty");
//            return;
//        }
//        while(currentnode !=null){
//            System.out.print(currentnode.data+"  ");
//            currentnode= currentnode.next;
//
//        }
//        System.out.println();
//    }
//
//    public int getSize() {
//        return size;
//    }
//
//    public static void main(String[] args) {
//        LL list = new LL();
//        list.addFirst("A");
//        list.addLast("B");
//        list.addLast("C");
//        list.addLast("D");
//        list.deleteFirst();
////        list.printlist();
//        list.deleteLast();
//        list.addFirst("A");
//        list.addLast("D");
//        list.printlist();
//        System.out.println("List size : "+list.getSize());
//
//
//    }
//
//}
