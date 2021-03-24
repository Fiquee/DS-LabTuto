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
public class Stack <T>{
    ListNode head;
    int size = 0;

    public Stack() {
    }
    
    public void push(T elem){
        head = new ListNode (elem,head);
        size++;
    }
    
    public T pop(){
        T popdata = (T) head.data;
        head = head.next;
        size--;
        return popdata;
    }
    
    public T peek(){
        if(head == null){
            return null;
        }
        else{
            return (T) head.data;
        }
    }
    public int size(){
        return size;
    }
    
    public boolean isEmpty(){
        return size == 0;
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
