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
public class LinearProbingHash<K, V> {

    K[] key;
    V[] value;
    int max;
    int size = 0;

    public LinearProbingHash(int max) {
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
        for (int i = 0; i < max; i++) {
            if(key[i] == null){
                continue;
            }
            if (elem.compareTo((K) key[i]) == 0) {
                return true;
            }
        }
        return false;
    }

    public boolean containsValue(Comparable<V> elem) {
        for (int i = 0; i < max; i++) {
            if(value[i] == null){
                continue;
            }
            if (elem.compareTo((V) value[i]) == 0) {
                return true;
            }
        }
        return false;
    }

    public V get(Comparable<K> keyElem) {
        for (int i = 0; i < max; i++) {
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
        if (!isFull()) {
            int index = Hash(keyElem);
            if (key[index] != null && keyElem.compareTo((K) key[index]) == 0) {
                V temp = value[index];
                value[index] = valueElem;
                return valueElem;
            } else if (key[index] == null) {
                key[index] = (K) keyElem;
                value[index] = valueElem;
                size++;
            } else {
                while (key[index] != null) {
                    index++;
                    if (index == max) {
                        index = 0;
                    }
                }
                key[index] = (K)keyElem;
                value[index] = valueElem;
                size++;
            }
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
        }
    }

    public int Hash(Comparable<K> keyElem) {
        int keynum = Integer.parseInt(keyElem.toString());
        int hash = keynum % max;
        return hash;
    }
    
    public int getLocation(Comparable<K> keyElem){
        for(int i = 0 ; i < max ; i++){
            if(key[i] == null){
                continue;
            }
            if(keyElem.compareTo((K)key[i]) == 0){
                return i;
            }
        }
        return -1;
    }
}
