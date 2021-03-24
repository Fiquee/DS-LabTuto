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
public class LinkedList <T extends Comparable<T>> {
    ListNode head;
    int size = 0;

    public LinkedList() {
        
    }
    
    public void add(T elem){
        if(isEmpty()){
            head = new ListNode(elem,null);
            size++;
        }
        else{
            ListNode curr = head;
            while(curr.next != null){
                curr = curr.next;
            }
            curr.next = new ListNode(elem,null);
            size++;
        }
    }
    
    public T get(int index){
        ListNode curr = new ListNode(null,head);
        for(int i = 0 ; i <= index ; i++){
            curr = curr.next;
        }
        return (T)curr.data;
    }
    
    public boolean isEmpty(){
        return size ==0;
    }
    
    public void clear(){
        head = null;
    }
    
    public void showList(){
        ListNode curr = head;
        while(curr != null){
            System.out.print(curr.data + " --> ");
            curr = curr.next;
        }
        System.out.println();
    }
   
    public boolean LinearSearch(T elem){
        ListNode curr = head;
        while(curr != null){
            if(elem.compareTo((T)curr.data) == 0){
                return true;
            }
            curr = curr.next;
        }
        return false;
    }
    
    public boolean LinearSearch(T elem1,T elem2){
        int arraysize = (int)((Integer)elem2 - (Integer)elem1);
        if(arraysize > 0){
            T[] num = (T[]) new Comparable[arraysize];
            int i,j;
            for(i = 0 , j = 1; i < arraysize ; i++,j++){
                num[i] = (T) (Integer)((Integer)elem1+j);
            }
            for(i = 0 ; i < arraysize ; i++){
                ListNode curr = head;
                while(curr != null){
                    if(num[i].compareTo((T)curr.data) == 0){
                        return true;
                    }
                    curr = curr.next;
                }
            }
        }
        return false;
    }
    
    public int LinearSearchCount(T elem){
        ListNode curr = head;
        int count = 0;
        while(curr != null){
            if(elem.compareTo((T)curr.data) == 0){
                count++;
            }
            curr = curr.next;
        }
        return count;
    }
    
    public int LinearSearchCount(T elem1,T elem2){
        int arraysize = (int)((Integer)elem2 - (Integer)elem1);
        int count = 0;
        if(arraysize > 0){
            T[] num = (T[]) new Comparable[arraysize];
            int i,j;
            for(i = 0,j =1 ; i < arraysize ; i++,j++){
                num[i] = (T) (Integer)((Integer)elem1+j);
            }
            for( i = 0 ; i < arraysize ; i++){
                ListNode curr = head;
                while(curr != null){
                    if(num[i].compareTo((T)curr.data) == 0){
                        count++;
                    }
                    curr = curr.next;
                }
            }
        }
        return count;
    }
    
    public boolean contains(T elem){
        ListNode curr = head;
        while(curr != null){
            if(elem.compareTo((T)curr.data) == 0){
                return true;
            }
            curr = curr.next;
        }
        return false;
    }
}
