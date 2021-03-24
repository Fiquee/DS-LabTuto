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
public class DoubleListNode<T> {
    T data;
    DoubleListNode next,prev;

    public DoubleListNode(T data, DoubleListNode next, DoubleListNode prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    public T getData() {
        return data;
    }

    public DoubleListNode getNext() {
        return next;
    }

    public DoubleListNode getPrev() {
        return prev;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setNext(DoubleListNode next) {
        this.next = next;
    }

    public void setPrev(DoubleListNode prev) {
        this.prev = prev;
    }
    
}
