/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dstuto8;

import java.util.Iterator;

/**
 *
 * @author Forge-15 i7
 */
public class LinkedList<T extends Comparable<T>> {

    public static final int ASCENDING = 1;
    public static final int DESCENDING = 2;
    private int size = 0;
    protected ListNode head;
    private ListNode tail;

    public LinkedList() {

    }

    public LinkedListIterator listIterator() {
        return new LinkedListIterator();
    }

    public class LinkedListIterator<T> implements Iterator {

        ListNode<T> node = new ListNode(null, head);

        @Override
        public boolean hasNext() {
            return node.next != null;
        }

        @Override
        public Object next() {
            node = node.next;
            T data = node.data;
            return data;
        }

        @Override
        public void remove() {
            removenode(node);
        }
    }

    public void add(T elem) {
        addLast(elem);
    }

    public void addLast(T elem) {
        ListNode newnode = new ListNode(elem, null);
        if (isEmpty()) {
            head = tail = newnode;
            size++;
        } else {
            tail.next = newnode;
            tail = tail.next;
            size++;
        }
    }

    public void addFirst(T elem) {
        if (isEmpty()) {
            ListNode newnode = new ListNode(elem, null);
            head = tail = newnode;
            size++;
        } else {
            ListNode newnode = new ListNode(elem, head);
            head = newnode;
            size++;
        }
    }

    public void clear() {
        while (head != null) {
            removenode(head);
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public T get(int index) {
        if (index >= size() || index < 0 || head == null) {
            return null;
        } else {
            int count = 0;
            ListNode currentNode = head;
            while (currentNode.next != null && count != index) {
                currentNode = currentNode.next;
                count++;
            }
            return (T) currentNode.getData();
        }
    }

    public void remove(int index) {
        ListNode curr = new ListNode(null, head);
        for (int i = 0; i <= index; i++) {
            curr = curr.next;
        }
        removenode(curr);
    }

    public void removenode(ListNode node) {
        ListNode curr = head;
        if (node == head) {
            head = node.next;
            size--;
        } else {
            while (curr.next != node) {
                curr = curr.next;
            }
            curr.next = curr.next.next;
            size--;
        }
    }

    public void MergeAlterList(LinkedList one, LinkedList two) {
        LinkedList list = new LinkedList();
        ListNode sechead = two.head;
        ListNode firsthead = one.head;
        int i = 0;
        while (sechead != null || firsthead != null) {
            if (i % 2 == 0) {
                list.add((T) firsthead.data);
                firsthead = firsthead.next;
            } else if (i % 2 != 0) {
                list.add((T) sechead.data);
                sechead = sechead.next;
            }
            i++;
        }
        ListNode curr = list.head;
        while (curr != null) {
            add((T) curr.data);
            curr = curr.next;
        }
    }

    public void Alter() {
        LinkedList newlist = new LinkedList();
        if (!isEmpty()) {
            ListNode one = head;
            ListNode two = head;

            for (int i = 0; i < size(); i++) {
                if (i % 2 == 0) {
                    newlist.add((T) one.data);
                }
                one = one.next;
            }
            for (int j = 0; j < size(); j++) {
                if (j % 2 != 0) {
                    newlist.add((T) two.data);
                }
                two = two.next;
            }
            clear();
            ListNode curr = newlist.head;
            while (curr != null) {
                add((T) curr.data);
                curr = curr.next;
            }
        }
    }

    public LinkedList splitList() {
        LinkedList b = new LinkedList();
        if (!isEmpty()) {
            if (size() % 2 == 0) {
                int half = size() / 2;
                ListNode curr = head;
                ListNode sec = head;
                for (int i = 1; i < half; i++) {
                    curr = curr.next;
                    sec = curr.next;
                }
                curr.next = null;
//                firstList(head);
                b = secondList(sec);
            } else if (size() % 2 != 0) {
                int half = size() / 2;
                ListNode curr = head;
                ListNode sec = head;
                for (int i = 1; i <= half; i++) {
                    curr = curr.next;
                    sec = curr.next;
                }
                curr.next = null;
//                firstList(head);
                b = secondList(sec);
            }
        }
        return b;
    }

//    public void firstList(ListNode firsthead) {
//        ListNode curr = firsthead;
//        LinkedList a = new LinkedList();
//        while (curr != null) {
//            a.add((T) curr.data);
//            curr = curr.next;
//        }
//    }
    public LinkedList secondList(ListNode secondhead) {
        ListNode curr = secondhead;
        LinkedList b = new LinkedList();
        while (curr != null) {
            b.add((T) curr.data);
            curr = curr.next;
        }
        return b;
    }

    public void reverse(ListNode node) {
        //recursive way
        if (node != null) {
            reverse(node.next);
            add((T) node.data);
            removenode(node);
//            System.out.print(node.data + " --> ");
        }
        //// Below is non recursive way

//            ListNode curr = head;
//            while (curr != null) {
//                addFirst((T) curr.getData());
//                removenode(curr);
//                curr = curr.next;
//
//            }
//            ListNode revs = head;
//            while (revs != null) {
//                System.out.print(revs.getData() + "--> ");
//                revs = revs.next;
//            }
//            System.out.println();
    }

    public void showList() {
        if (isEmpty()) {
            System.out.println("The linked list is empty");
        } else {
            ListNode current = head;
            while (current != null) {
                System.out.print(current.data + " --> ");
                current = current.next;
            }
            System.out.println();
        }
    }

    public void sort() {
        LinkedList newlist = new LinkedList();
        if (head.data instanceof Integer) {
            int newdata = 0, i = 0;
            int numsize = size;
            while (i < numsize) {
                ListNode temp = head;
                ListNode one = head;
                newdata = (int) temp.data;
                while (one != null) {
                    if ((int) one.data < (int) temp.data) {
                        newdata = (int) one.data;
                        temp = one;
                    }
                    one = one.next;
                }
                newlist.add(newdata);
                removenode(temp);
                i++;
            }
            ListNode curr = newlist.head;
            while (curr != null) {
                add((T) curr.data);
                curr = curr.next;
            }
        } else if (head.data instanceof Character) {
            int i = 0;
            int numsize = size;
            char newdata = 'a';
            while (i < numsize) {
                ListNode temp = head;
                ListNode one = head;
                newdata = (char) temp.data;
                while (one != null) {
                    if ((char) one.data < (char) temp.data) {
                        newdata = (char) one.data;
                        temp = one;
                    }
                    one = one.next;
                }
                newlist.add(newdata);
                removenode(temp);
                i++;
                ListNode curr = newlist.head;
                while (curr != null) {
                    add((T) curr.data);
                    curr = curr.next;
                }
            }
        }
    }

    public int getIndex(ListNode node) {
        int count = 0;
        if (node != head) {
            ListNode curr = head;
            while (curr != node) {
                count++;
                curr = curr.next;
            }
        }
        return count;
    }

    public void selectionSort(int orderType) {
        ListNode curr = head;
        while (curr != null) {
            swap(getIndex(curr), getMinIndex(getIndex(curr), orderType));
            curr = curr.next;
        }
    }

    public int getMinIndex(int start, int orderType) {
        T temp = get(start);
        int index = start;

        for (int i = start + 1; i < size; i++) {
            if (get(i).compareTo(temp) < 0 && orderType == ASCENDING) {
                temp = get(i);
                index = i;
            } else if (get(i).compareTo(temp) > 0 && orderType == DESCENDING) {
                temp = get(i);
                index = i;
            }
        }
        return index;
    }

    public void swap(int index1, int index2) {
        ListNode curr = head;
        ListNode curr2 = head;
        for (int i = 0; i < index1; i++) {
            curr = curr.next;
        }
        for (int i = 0; i < index2; i++) {
            curr2 = curr2.next;
        }
        T temp = get(index2);
        curr2.data = get(index1);
        curr.data = temp;
    }
    
    public void bubbleSort(int orderType) {
        for (int iteration = 0; iteration < size() - 1; iteration++) {
            for (int i = 0; i < size() - 1 - iteration; i++) {
                if (get(i).compareTo(get(i+1)) > 0 && orderType == ASCENDING) {
                    swap(i, i + 1);
                } else if (get(i).compareTo(get(i+1)) < 0 && orderType == DESCENDING) {
                    swap(i, i + 1);
                }
            }
        }
    }
}
