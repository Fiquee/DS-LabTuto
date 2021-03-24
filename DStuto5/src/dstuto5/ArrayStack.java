/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dstuto5;

/**
 *
 * @author Forge-15 i7
 */
public class ArrayStack<T> {

    T[] arr;
    int top = 0;
    int size = arr.length;
    int bottom = arr.length-1;
    int maxsize;
    ListNode head;

    public ArrayStack(int maxsize) {
        this.maxsize = maxsize;
    }
    
    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == maxsize;
    }

    public int getSize() {
        return size;
    }

    public void push(T elem) {
        if (isFull()) {
            System.out.println("The array stack is full");
        } else {
            arr[top] = elem;
            top++;
            bottom = arr.length -1;
            size++;
        }
    }
    
    public T pop(){
        if(isEmpty()){
            return null;
        }
        else{
            T popdata = arr[top];
            top--;
            size--;
            return popdata;
        }
    }
    
    public T poplast(){
        if(isEmpty()){
            return null;
        }
        else{
            T popdata = arr[bottom];
            bottom--;
            size--;
            return popdata;
        }
    }
    
    public T peek(){
        if(isEmpty()){
            return null;
        }
        else{
            return (T) head.data;
        }
    }
    
    public void showStack(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }
        else{
            ListNode curr = head;
            while(curr != null){
                System.out.print(" <-- " + curr.data);
                curr = curr.next;
            }
            System.out.println();
        }
    }
}
