/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dslab2;

import java.util.LinkedList;

/**
 *
 * @author Forge-15 i7
 */
public class TextFileLog<T extends Comparable> implements SimpleLog {

    int size = 0;
    int max;
    LinkedList log = new LinkedList<>();

    public TextFileLog(int max) {
        this.max = max;
    }

    @Override
    public void insert(Object t) {
        if (isFull()) {
            System.out.println("The log is full");
        } else {
            log.add(t);
        }
    }

    @Override
    public boolean isFull() {
        return log.size() == max;
    }

    @Override
    public int getSize() {
        return log.size();
    }

    
    public void contains(Object t) {
        boolean contain = false;
        T data = (T)t;
        for(int i = 0 ; i < log.size() ; i++){
            if(data.compareTo((T)log.get(i)) == 0){
                System.out.println("Text File Log contains " + t);
                contain = true;
            }
        }
        if(!contain){
            System.out.println(t + " is not found");
        }
    }

    @Override
    public void Delete() {
        log.removeAll(log);
    }

    @Override
    public void Display() {
        if(getSize() == 0){
            System.out.println("Text file is empty");
        }
        String str = "";
        for(int i = 0 ; i  < log.size() ; i++){
            str += log.get(i) + "\n";
        }
        System.out.println(str);
    }

    
}
