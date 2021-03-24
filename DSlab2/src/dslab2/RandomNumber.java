/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dslab2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

/**
 *
 * @author Forge-15 i7
 */
public class RandomNumber<T> {

    T t;
    int rand,q,limit;
    ArrayList list = new ArrayList<>();
    Random r = new Random();

    public RandomNumber(T t, int rand,int limit) {
        this.t = t;
        this.rand = rand;
        this.limit = limit;

    }

    public String getRandom() {
        String str = "";

        if (t instanceof Integer[]) {
            Integer[] arr = (Integer[]) t;
            int i = 0;
            while(!arrayisFull(arr,i)){
                int num = r.nextInt(limit+1);
                if(!arrayContains(arr,num)){
                    arr[i] = num;
                    i++;
                }
            }
            for(int j = 0 ; j < arr.length ; j++){
                str = str + arr[j] + " ";
            }
        }
        else if(t instanceof LinkedList){
            LinkedList a = (LinkedList)t;
            while(a.size()<rand){
                int m = r.nextInt(limit+1);
                if(!a.contains(m)){
                    a.add(m);
                }
            }
            Collections.sort(a);
            for(int i = 0 ; i < a.size() ; i++){
                str = str + a.get(i) + " ";
            }
        }
        return str;
    }
    public boolean arrayContains(Integer[] arr,int num){
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == null){
                continue;
            }
            if(arr[i] == num){
                return true;
            }
        }
        return false;
    }
    public boolean arrayisFull(Integer[] arr,int i){
        return i == arr.length;
    }
}
