/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dstuto2;

import dstuto2.Dice;
import java.util.LinkedList;
import java.util.Random;

/**
 *
 * @author Forge-15 i7
 */
public class LinkedListDice<T> implements Dice{
    private LinkedList list = new LinkedList<>();
    private int num;

    public LinkedListDice(int num) {
        this.num = num;
    }

    @Override
    public String Roll() {
        String str = "";
        Random rand = new Random();
        for(int i = 0 ; i< num ; i++){
            Integer value = rand.nextInt(6)+1;
            list.add(value);
        }
        for(int j = 0 ; j<list.size() ; j++){
            str = str + list.get(j) + " ";
        }
        return str;
    }
    public Integer getsum(){
        Integer sum = 0;
        for(int i = 0 ; i<list.size() ; i++){
            Integer c = (Integer) list.get(i);
            sum = sum + c;
        }
        return sum;
    }
    @Override
    public String toString(){
        String res = "Linked List Implementation: Roll " + num + " time(s)\n" + Roll() + "\n" + "Total is " + getsum();
        return res;
    }
}
