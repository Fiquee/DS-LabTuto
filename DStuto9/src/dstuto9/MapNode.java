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
public class MapNode <K,V>{
    K key;
    V value;
    MapNode next;

    public MapNode(K key, V value, MapNode next) {
        this.key = key;
        this.value = value;
        this.next = next;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public void setNext(MapNode next) {
        this.next = next;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public MapNode getNext() {
        return next;
    }

    @Override
    public String toString() {
        return key + " : " + value + " --> ";
    }
    
    
}
