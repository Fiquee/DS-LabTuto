/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dslab6;

import java.util.Collections;
import java.util.LinkedList;

/**
 *
 * @author Forge-15 i7
 */
public class Queue<T> {

    ListNode<T> head;
    int size = 0;

    public Queue() {
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(T elem) {
        if (isEmpty()) {
            head = new ListNode(elem, null);
            size++;
        } else {
            ListNode curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = new ListNode(elem, null);
            size++;
        }
    }

    public T dequeue() {
        if (isEmpty()) {
            return null;
        } else {
            T data = head.data;
            head = head.next;
            size--;
            return data;
        }
    }

    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return (T) head.data;
    }

    public void showQueue() {
        if (isEmpty()) {
            System.out.println("The queue is empty");
        } else {
            ListNode curr = head;
            while (curr != null) {
                System.out.print(curr.data + " --> ");
                curr = curr.next;
            }
            System.out.println();
        }
    }
    
    public void Shuffle(){
        LinkedList list = new LinkedList();
        while(!isEmpty()){
            list.add(head.data);
            dequeue();
        }
        Collections.shuffle(list);
        for(int i = 0 ; i < list.size() ; i++){
            enqueue((T) list.get(i));
        }
    }
}
