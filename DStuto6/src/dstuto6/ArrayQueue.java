/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dstuto6;

/**
 *
 * @author Forge-15 i7
 */
public class ArrayQueue<T> {

    int max;
    T[] arr;

    public ArrayQueue(int max) {
        this.max = max;
        arr = (T[]) new Comparable[max];
    }

    public boolean isEmpty() {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                return false;
            }
        }
        return true;
    }

    public boolean isFull() {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                return false;
            }
        }
        return true;
    }

    public int getSize() {
        int i = 0;
        while (i < max) {
            if (arr[i] != null) {
                i++;
            }
            else{
                break;
            }
        }
        return i;
    }

    public void enqueue(T elem) {
        if (!isFull()) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == null) {
                    arr[i] = elem;
                    break;
                }
            }
        } else {
            System.out.println("Queue is full");
        }
    }

    public T dequeue() {
        T data = arr[0];
        int i = 0;
        while (i < max-1) {
            if(arr[i] != null && arr[i + 1] != null) {
                arr[i] = arr[i + 1];
            }
            else if(arr[i + 1] == null) {
                arr[i] = null;
                break;
            }
            i++;
        }
        if(i == max-1){
            arr[i] =null;
        }
        return data;
    }

    public T peek() {
        return arr[0];
    }

    public void showQueue() {
        for (int i = 0; i < getSize(); i++) {
            System.out.print(arr[i] + " --> ");
        }
        System.out.println();
    }
}
