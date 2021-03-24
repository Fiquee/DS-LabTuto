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
public class DoubleLinkedList<T extends Comparable> {

    DoubleListNode head, tail;
    int size = 0;

    public DoubleLinkedList() {
    }

    public void removeEven() {
        while ((int) head.data % 2 == 0) {
            head = head.next;
            head.prev = null;
            size--;
        }
        DoubleListNode curr = head;
        while (curr != null && curr.next != null) {
            if ((int) curr.data % 2 == 0) {
                curr.next.prev = curr.prev;
                curr.prev.next = curr.next;
                size--;
            }
            curr = curr.next;
            if((int) curr.data % 2 == 0){
                curr.prev.next = curr.next;
                size--;
            }
        }
    }

    public void set(int index, T elem) {
        DoubleListNode curr = new DoubleListNode(null, head, null);
        for (int i = 0; i <= index; i++) {
            curr = curr.next;
        }
        curr.setData(elem);
    }

    public void remove(int index) {
        DoubleListNode curr = new DoubleListNode(null, head, null);
        for (int i = 0; i <= index; i++) {
            curr = curr.next;
        }
        removenode(curr);
    }

    public void removenode(DoubleListNode node) {
        if (node == head) {
            head = head.next;
            head.prev = null;
            size--;
        } else {
            DoubleListNode curr = head;
            while (curr != node) {
                curr = curr.next;
            }
            curr.next.prev = curr.prev;
            curr.prev.next = curr.next;
            size--;
        }
    }

    public void addLast(T elem) {
        if (isEmpty()) {
            DoubleListNode newnode = new DoubleListNode(elem, null, null);
            head = tail = newnode;
            size++;
        } else {
            DoubleListNode newnode = new DoubleListNode(elem, null, tail);
            tail.next = newnode;
            tail = tail.next;
            size++;
        }
    }

    public void addFirst(T elem) {
        if (isEmpty()) {
            DoubleListNode newnode = new DoubleListNode(elem, null, null);
            head = tail = newnode;
            size++;
        } else {
            DoubleListNode newnode = new DoubleListNode(elem, head, null);
            head.prev = newnode;
            head = head.prev;
            size++;
        }
    }

    public void add(T elem) {
        addLast(elem);
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void showList() {
        if (isEmpty()) {
            System.out.println("The Double LinkedList is empty");
        } else {
            DoubleListNode curr = head;
            while (curr != null) {
                System.out.print("<-- " + curr.data + " --> ");
                curr = curr.next;
            }
            System.out.println();
        }
    }
}
