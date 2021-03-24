package dstuto4;

import java.util.Random;

public class LinkedList<T extends Comparable<T>> {

    private int size = 0;
    private ListNode head;
    private ListNode tail;

    
    public void getMiddle(){
        if(isEmpty()){
            showlist();
        }
        else if(size()%2 == 0){
            System.out.println("There is no middle element");   
        }
        else{
            int index = size()/2;
            T data = get(index);
            System.out.println("The median is " + data);
        }
    }
    
    public void addfirst(T elem) {
        if (isEmpty()) {
            add(elem);
        } else {
            ListNode newhead = new ListNode(elem, head);
            head = newhead;
            size++;
        }
    }

    public void removenode(ListNode<T> node) {
        ListNode curr = head;
        while (curr.next != node) {
            curr = curr.next;
        }
        curr.next = curr.next.next;
        size--;
    }
    
    public void removeAll(T t){
        for(int i = 0 ; i < size() ; i++){
            if(t.compareTo(get(i))==0){
                remove(i);
                i--;
            }
        }
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            System.out.println("There is nothing to remove");
        }
        if (!isEmpty()) {
            if (index == 0) {
                removefirst();
            } else {
                ListNode curr = head;
                for (int i = 1; i <= index; i++) {
                    curr = curr.next;
                }
                removenode(curr);
            }
        } else {
            System.out.println("LinkedList is empty");
        }
    }

    public void removeVal(T t) {
        while (head != null && t.compareTo((T) head.getData()) == 0) {
            head = head.next;
            size--;
        }
        ListNode curr = head;
        while (curr != null && curr.getNext() != null) {
            if (t.compareTo((T) curr.next.getData()) == 0) {
                curr.setNext(curr.getNext().getNext());
                size--;
            } else {
                curr = curr.getNext();
            }
        }
//        while(curr != null && curr.next != null){
//            if(t.compareTo((T)curr.next.data) == 0){
//                curr.next = curr.next.next;
//                size--;
//            }
//            else{
//                curr = curr.next;
//            }
//        }
    }

    public void removefirst() {
        if (isEmpty()) {
            System.out.println("Linkedlist is empty");
        }
        head = head.getNext();
        size--;
        if (isEmpty()) {
            head = tail = null;
        }
    }

    public void random(int num,int min,int max) {
        for(int i = 0 ; i < num ; i++){
            Random r = new Random();
            Integer rand = r.nextInt(max+1-min)+min;
            add((T)rand);
        }
    }

    public int even() {
        int even = 0;
        if (!isEmpty()) {
            ListNode current = head;
            while (current != null) {
                int c = (int) current.getData();
                if (c % 2 == 0) {
                    even++;
                }
                current = current.getNext();
            }
        }
        return even;
    }

    public int sum() {
        int sum = 0;
        ListNode current = head;
        if (isEmpty()) {
            return sum;
        } else {
            while (current != null) {
                int c = (int) current.getData();
                sum = sum + c;
                current = current.getNext();
            }
            return sum;
        }
    }

    public T get(int index) {
        if (index >= size()) {
            return null;
        } else if (index == 0) {
            return (T) head.getData();
        } else if (index == size() - 1) {
            return (T) tail.getData();
        } else {
            ListNode node = head;
            for (int i = 1; i <= index; i++) {
                node = node.getNext();
            }
            return (T) node.getData();
        }
    }

    public int size() {
        return size;
    }

    public void more() {
        
        ListNode currentnode = head;
        while (currentnode != null) {
//            double data = (double) currentnode.getData();
            if ((double)currentnode.getData() >= 20.0) {
                currentnode.setData((double)currentnode.getData() + 10.5);
            }
            System.out.print(currentnode.getData() + " --> ");
            currentnode = currentnode.getNext();
        }
    }

    public void add(T a) {

        if (isEmpty()) {
            ListNode newnode = new ListNode(a, null);
            head = tail = newnode;
        } else {
            tail.next = new ListNode(a, null);
            tail = tail.next;
        }
        size++;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void showlist() {
        if (isEmpty()) {
            System.out.println("The linked list is empty");
        } else {
            ListNode currentnode = head;
            System.out.println("The number in the linked list");
            while (currentnode != null) {
                System.out.print(currentnode.getData() + " --> ");
                currentnode = currentnode.getNext();
            }
        }
        System.out.println();
    }
}
