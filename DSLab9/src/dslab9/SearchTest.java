/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dslab9;

import java.util.Random;

/**
 *
 * @author Forge-15 i7
 */
public class SearchTest <T extends Comparable<T>>{
    T elem;
    int N;
    T[][] arr;
    Random r = new Random();

    public SearchTest(T elem, int N) {
        this.elem = elem;
        this.N = N;
        arr = (T[][])new Comparable[N][N];
        if(elem instanceof Integer){
            for(int i = 0 ; i < N ; i++){
                for(int j = 0 ; j < N ; j++){
                    arr[i][j] = (T) ((Integer) (r.nextInt(20)+10));
                }
            }
        }
    }
    
    public boolean LinearSearch(T elem){
        for(int i = 0 ; i < N ; i++){
            for(int j = 0 ; j < N ; j++){
                if(elem.compareTo((T)arr[i][j]) == 0){
                    return true;
                }
            }
        }
        return false;
    }
    
    public int LinearSearchCount(T elem){
        int count = 0;
        for(int i = 0 ; i < N ; i++){
            for(int j = 0 ; j < N ; j++){
                if(elem.compareTo((T)arr[i][j]) == 0){
                    count++;
                }
            }
        }
        return count;
    }
    
    public String getMatrixLocation(T elem){
        String str = "";
        for(int i = 0 ; i < N ; i++){
            for(int j = 0 ; j < N ; j++){
                if(elem.compareTo((T)arr[i][j]) == 0){
                    str = str + "[" + i + "," + j + "]";
                }
            }
        }
        return str;
    }
    
    public void showMatrix(){
        for(int i = 0 ; i < N ; i++){
            for(int j = 0 ; j < N ; j++){
                System.out.print(arr[i][j] + " ");
                if(j == N-1){
                    System.out.println();
                }
            }
        }
    }
}
