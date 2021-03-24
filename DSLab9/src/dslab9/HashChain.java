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
public class HashChain<K,V> {
    K[] key;
    V[] value;
    int max;
    int size = 0;
    LinkedList<Index> a = new LinkedList();
    
    

    public HashChain(int max) {
        this.max = max;
        key = (K[]) new Comparable[max];
        value = (V[]) new Comparable[max];
        for(int i = 0 ; i < max ; i++){
            Index index = new Index(i);
            a.add(index);
        }
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
            System.out.println(key[i] + " : " + value[i]);
        }
        System.out.println();
    }

    public boolean containsKey(Comparable<K> elem) {
        int index = Hash(elem);
        LinkedList item = a.get(index).list;
        for(int i = 0 ; i < item.size; i++){
            String object = (String) item.get(i);
            object = object.substring(0,object.indexOf(' '));
            if(elem.toString().equalsIgnoreCase(object)){
                return true;
            }
        }
        return false;
    }

    public boolean containsValue(Comparable<V> elem) {
        for(int i = 0 ; i < a.size ; i++){
            if(a.get(i).list.isEmpty()){
                continue;
            }
            LinkedList item = a.get(i).list;
            for(int j = 0 ; j < item.size ; j++){
                String object = (String)item.get(j);
                object = object.substring(object.indexOf(" : ") + 3,object.length());
                if(elem.toString().equalsIgnoreCase(object)){
                    return true;
                }
            }
        }
        return false;
    }

    public V get(Comparable<K> keyElem) {
        int index = Hash(keyElem);
        LinkedList item = a.get(index).list;
        for(int i = 0 ; i < item.size ; i++){
            String object = (String)item.get(i);
            String[] arr;
            arr = object.split(" : ");
            if(keyElem.toString().equalsIgnoreCase(arr[0])){
                return (V)arr[1];
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
                a.get(index).list.head.data = valueElem;
                return valueElem;
            } else if (key[index] == null) {
                key[index] = (K) keyElem;
                value[index] = valueElem;
                a.get(index).list.add(keyElem + " : " + valueElem);
                size++;
            } else {
                a.get(index).list.add(keyElem + " : " + valueElem);
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
    
    public void getList(Comparable<K> keyElem){
        int index = Hash(keyElem);
        a.get(index).list.showList();
    }
}
