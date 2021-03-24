/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dstuto2;

import java.util.LinkedList;
import java.util.Random;

/**
 *
 * @author Forge-15 i7
 */
public class ArrayDice<T> implements Dice {

    private T[] t;
    private int times, sum;
    private Integer x[];

    public ArrayDice(T[] t, int times) {
        this.t = t;
        this.times = times;
    }

    @Override
    public String Roll() {
        String numbers = "";
        Random r = new Random();
        x = (Integer[]) t;
        for (int i = 0; i < times; i++) {
            x[i] = r.nextInt(6) + 1;
            numbers += x[i] + " ";
        }
        return numbers;
    }
    public Integer getsum(){
        Integer sum = 0;
        for(int i = 0 ; i<t.length ; i++){
            Integer c = (Integer) t[i];
            sum = sum + c;
        }
        return sum;
    }

    @Override
    public String toString() {
    
          String str = "Array Implementation: Roll " + times + " time(s)\n" + Roll() + "\n" + "Total is " + getsum();
        return str;
    }
}
