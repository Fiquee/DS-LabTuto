/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dstuto9;

/**
 *
 * @author Forge-15 i7
 */
public class HashTable<K, V> {

    MapNode head;
    int size = 0;

    public HashTable() {
    }

    public V put(Comparable<K> key, V value) {
        if (isEmpty()) {
            MapNode newnode = new MapNode(key, value, null);
            head = newnode;
            size++;
        } else {
            MapNode newnode = new MapNode(key, value, null);
            MapNode curr = head;
            MapNode prev = null;
            while (curr != null) {
                if (key.compareTo((K) curr.key) == 0) {
                    V temp = (V) curr.value;
                    curr.value = value;
                    return temp;
                } else {
                    prev = curr;
                    curr = curr.next;
                }
            }
            prev.next = newnode;
            newnode.next = curr;
            size++;
        }
        return null;
    }

    public V remove(Comparable<K> key) {
        if (isEmpty()) {
            return null;
        } else if (key.compareTo((K)head.key) == 0) {
            V temp = (V) head.value;
            head = head.next;
            size--;
            return temp;
        } else {
            MapNode curr = head;
            while (curr.next.key != key && curr.next != null) {
                curr = curr.next;
            }
            if(curr.next == null){
                return null;
            }
            V temp = (V) curr.next.value;
            curr.next = curr.next.next;
            size--;
            return temp;
        }
    }

    public V get(Comparable<K> key) {
        if (isEmpty()) {
            return null;
        } else if (key.compareTo((K)head.key) == 0) {
            return (V) head.value;
        } else {
            MapNode curr = head;
            while (key.compareTo((K)curr.key) != 0 && curr != null) {
                curr = curr.next;
            }
            if (curr == null) {
                return null;
            }
            return (V)curr.value;
        }
    }
    
    public boolean containsKey(Comparable<K> key){
        if(!isEmpty()){
            MapNode curr = head;
            while(curr != null){
                if(key.compareTo((K)curr.key) == 0){
                    return true;
                }
                curr = curr.next;
            }
        }
        return false;
    }
    
    public boolean containsValue(Comparable<V> value){
        if(!isEmpty()){
            MapNode curr = head;
            while(curr != null){
                if(value.compareTo((V)curr.value) == 0){
                    return true;
                }
                curr = curr.next;
            }
        }
        return false;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
    }

    public void showHashTable() {
        MapNode current = head;
        while (current != null) {
            System.out.print(current.toString());
            current = current.next;
        }
        System.out.println();
    }
}
