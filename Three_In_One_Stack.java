package com.DSA;

public class Three_In_One_Stack {
    public int [] values;
    public int [] sizes;
    public int NumberOfStack =3;
    public int stackCapacity;

    Three_In_One_Stack(int stackSize){
        this.stackCapacity=stackSize;
        this.values = new int[stackSize*NumberOfStack];
        this.sizes = new int[NumberOfStack];
    }
    public boolean isFull(int stackNum){
        if (sizes[stackNum]==stackCapacity){
            return true;
        }
        return false;
    }
    public boolean isEmpty(int stackNum){
        if (sizes[stackNum]==0){
            return true;
        }
        return false;
    }
    public int topOfIndex(int stackNum){
        int offset = stackNum * stackCapacity;
        int size = sizes[stackNum];
        return offset + size - 1;
    }
    public void push(int stackNum, int value){
        if (isFull(stackNum)){
            System.out.println("This stack is full :"+stackNum);
            return;
        }
        sizes[stackNum]++;
        int top_Index = topOfIndex(stackNum);
        values[top_Index]=value;
        System.out.println(value+" is inserted in stack : "+stackNum);
    }

    public void pop(int stackNum){
        if (isEmpty(stackNum)){
            System.out.println("Empty");
            return ;
        }
        int top = topOfIndex(stackNum);
        int value = values[top];
        values[top]=0;
        sizes[stackNum]--;
        System.out.println(value+" is poped from the stack :"+ stackNum);

    }
    public void peek(int stackNum){
        if (isEmpty(stackNum)){
            System.out.println("Empty");
            return;
        }
        System.out.println("Peek value in stack "+stackNum+" is "+values[topOfIndex(stackNum)] );

    }

    public static void main(String[] args) {
        Three_In_One_Stack stack = new Three_In_One_Stack(3);
        stack.push(0,1);
        stack.push(0,2);
        stack.push(0,3);
        stack.push(1,4);
        stack.push(1,5);
        stack.push(1,6);
        stack.push(2,7);
        stack.push(2,8);
        stack.push(2,9);
        stack.pop(0);
        stack.pop(1);
        stack.pop(2);
        stack.peek(0);
        stack.peek(1);
        stack.peek(2);



    }
}
