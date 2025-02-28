package com.DSA;
public class length_linkedList {
    NODE head;
    static class NODE{
        int data;
        NODE next;
        NODE(int d){
            this.data=d;
            this.next=null;
        }
    }
    public void add_at_index(int data, int index){

        NODE newnode = new NODE(data);
        if (head==null){
            head=newnode;
        }
        NODE prevNode=head;
        NODE nextNode=head.next;

        int i=0;
        while((i+1)!=index){
            prevNode=prevNode.next;
            nextNode=nextNode.next;
            i++;
        }
        prevNode.next=newnode;
        newnode.next=nextNode;



    }
    public void delete_index(int index){
        if (head==null){
            System.out.println("Empty List");
            return;
        }
        if (head.next==null){
            head=null;
            return;
        }
        NODE prevNode=head;
        NODE nextNode=head.next;
        NODE upperNode= nextNode.next;

        int i=0;
        while(i+1!=index){
            prevNode=prevNode.next;
            nextNode=nextNode.next;
            upperNode=upperNode.next;
            i++;
        }
        prevNode.next=upperNode;

    }

    public void addfirst(int data){
        NODE newnode = new NODE(data);
        if(head==null){
            head=newnode;
            return;
        }

        newnode.next=head;
        head=newnode;
    }
    public void addlast(int data){
        NODE newNode = new NODE(data);
        if (head==null){
            head=newNode;
            return;
        }
        NODE currentNode;
        currentNode=head;
        while(currentNode.next!=null){
            currentNode=currentNode.next;

        }
        currentNode.next=newNode;

    }
    public void printlist(){
        if (head==null){
            System.out.println("Empty");
            return;
        }
        NODE currentNode;
        currentNode=head;
        while(currentNode!=null){
            System.out.print("  "+currentNode.data);

            currentNode=currentNode.next;

        }
        System.out.println();
    }
    public int getCount(NODE node ){

        if (node==null){
            return 0;

        }
        return 1+ getCount(node.next);
    }
    public int getcountn(){
        return getCount(head);
    }
    public int count_NOdes(){
        NODE Node=head;
        int i=0;
        if (Node==null){
            return 0;
        }
        while (Node!=null){
            Node=Node.next;
            i++;
        }
        return i;
    }
    public static void main(String[] args) {
        length_linkedList list= new length_linkedList();
        list.addfirst(1);
        list.addfirst(2);
        list.addfirst(3);
        list.addlast(4);
        list.addlast(5);
        list.printlist();
        list.add_at_index(15,3);
        list.printlist();
        list.delete_index(3);
        list.printlist();
        System.out.println("Count "+list.getcountn());
        System.out.println("Count Iterative : "+list.count_NOdes() );

    }
}