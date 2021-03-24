/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dslab4;

/**
 *
 * @author Forge-15 i7
 */
public class CircularLinkedList<T extends Comparable> {

    ListNode head, tail;
    int size = 0;

    public CircularLinkedList() {
    }
    
    public void removenode(ListNode node){
        if(isEmpty()){
            System.out.println("The Circular Linkedlist is empty");
        }
        else{
            if(node == head){
                head = head.next;
                size--;
            }
            else{
                ListNode curr = head;
                while(curr.next != node){
                    curr = curr.next;
                }
                curr.next = curr.next.next;
                size--;
            }
        }
    }
    public T getCircularItem(int index) {
        if (isEmpty() || index < 0 || index >= length()) {
            return null;
        } else {
            ListNode curr = new ListNode(null, head);
            for (int i = 0; i <= index; i++) {
                curr = curr.next;
            }
            return (T) curr.data;
        }
    }

    public void addCircularNode(T elem) {
        //add at the back
        if (isEmpty()) {
            ListNode newnode = new ListNode(elem, null);
            head = tail = newnode;
            tail.next = head;
            size++;
        } else {
            ListNode newnode = new ListNode(elem, null);
            tail.next = newnode;
            tail = tail.next;
            tail.next = head;
            size++;
        }
    }

    public void deleteCircularNode() {
        //delete from the back
        if (isEmpty()) {
            System.out.println("Circular LinkedList is empty");
        } else {
            ListNode curr = head;
            while (curr.next != tail) {
                curr = curr.next;
            }
            tail = curr;
            tail.next = head;
            size--;
        }
    }

    public void showCircularList() {
        if (isEmpty()) {
            System.out.println("The Circular LinkedList is empty");
        } else {
            ListNode curr = head;
            while (curr != tail) {
                System.out.print(curr.data + " --> ");
                curr = curr.next;
            }
            System.out.println(curr.data + " --> " + curr.next.data);
        }
    }

    public int length() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
