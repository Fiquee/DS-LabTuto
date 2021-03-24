/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dslab9;

/**
 *
 * @author Forge-15 i7
 */
public class ArrayHashTable<K, V, T> {

    K[] key;
    V[] value;
    int max;
    int size = 0;

    public ArrayHashTable(int max) {
        this.max = max;
        key = (K[]) new Comparable[max];
        value = (V[]) new Comparable[max];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public int getSize() {
        return size;
    }

    public void clear() {
        for (int i = 0; i < max; i++) {
            if (key[i] != null) {
                key[i] = null;
                size--;
            }
            if (value[i] != null) {
                value[i] = null;
            }
        }
    }

    public void showHashTable() {
        for (int i = 0; i < max; i++) {
            if(key[i] == null){
                continue;
            }
            System.out.print(key[i] + " : " + value[i] + " | ");
        }
        System.out.println();
    }

    public boolean containsKey(Comparable<K> elem) {
        for (int i = 0; i < getSize(); i++) {
            if (elem.compareTo((K) key[i]) == 0) {
                return true;
            }
        }
        return false;
    }

    public boolean containsValue(Comparable<V> elem) {
        for (int i = 0; i < getSize(); i++) {
            if (elem.compareTo((V) value[i]) == 0) {
                return true;
            }
        }
        return false;
    }

    public V get(Comparable<K> keyElem) {
        for (int i = 0; i < getSize(); i++) {
            if(key[i] == null){
                continue;
            }
            if (keyElem.compareTo((K) key[i]) == 0) {
                return (V) value[i];
            }
        }
        return null;
    }

    public V put(Comparable<K> keyElem, V valueElem) {
        if (isEmpty()) {
            key[0] = (K) keyElem;
            value[0] = valueElem;
            size++;
        } else if (isFull()) {
            System.out.println("ArrayMap is full");
            return null;
        } else {
            int i;
            for (i = 0; i < getSize(); i++) {
                if (keyElem.compareTo((K) key[i]) == 0) {
                    V temp = value[i];
                    value[i] = valueElem;
                    return temp;
                }
            }
            key[i] = (K) keyElem;
            value[i] = valueElem;
            size++;
        }
        return null;
    }

    public void remove(Comparable<K> keyElem) {
        if (isEmpty()) {
            System.out.println("ArrayMap is emtpy");
        } else {
            int i;
            for (i = 0; i < getSize(); i++) {
                if (keyElem.compareTo((K) key[i]) == 0) {
                    key[i] = null;
                    value[i] = null;
                    size--;
                    break;
                }
            }
//            for (int j = i; j < getSize() - 1; j++) {
//                key[j] = key[j + 1];
//                value[j] = value[j + 1];
//            }
//            key[getSize() - 1] = null;
//            value[getSize() - 1] = null;
//            size--;
        }
    }
}
