/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dslab2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Forge-15 i7
 */
public class Array implements UNO {

    Integer[] deck = new Integer[54];
    int draw;
    int[] p1;
    int[] p2;

    public Array(int draw) {
        this.draw = draw;
        for (int i = 0; i < 54; i++) {
            deck[i] = i;
        }
        List<Integer> a = Arrays.asList(deck);
        Collections.shuffle(a);
        a.toArray(deck);
        p1 = new int[draw];
        p2 = new int[draw];

    }

    @Override
    public void Draw() {
        for (int i = 0; i < draw; i++) {
            p1[i] = deck[i];
        }
        for (int j = 0; j < draw; j++) {
            p2[j] = deck[j + draw];
        }
    }

    @Override
    public String toString() {
        String str = "Array Implementation\nPlayer 1 draws " + draw + " times\n";
        for (int i = 0; i < p1.length; i++) {
            switch (p1[i] / 13) {
                case 0:
                    str = str + "Yellow ";
                    break;
                case 1:
                    str = str + "Green ";
                    break;
                case 2:
                    str = str + "Red ";
                    break;
                case 3:
                    str = str + "Blue ";
                    break;
                case 4:
                    if (p1[i] % 13 == 0) {
                        str = str + "Plus 4 Wild Card :: ";
                    } else {
                        str = str + "Pick Colour :: ";
                    }
                    break;
            }
            switch (p1[i] % 13) {
                
                case 0:
                    if(p1[i]/13 == 4){
                        break;
                    }
                    str = str + "Zero :: ";
                    break;
                case 1:
                    if(p1[i]/13 == 4){
                        break;
                    }
                    str = str + "One :: ";
                    break;
                case 2:
                    str = str + "Two :: ";
                    break;
                case 3:
                    str = str + "Three :: ";
                    break;
                case 4:
                    str = str + "Four :: ";
                    break;
                case 5:
                    str = str + "Five :: ";
                    break;
                case 6:
                    str = str + "Six :: ";
                    break;
                case 7:
                    str = str + "Seven :: ";
                    break;
                case 8:
                    str = str + "Eight :: ";
                    break;
                case 9:
                    str = str + "Nine :: ";
                    break;
                case 10:
                    str = str + "Plus 2 :: ";
                    break;
                case 11:
                    str = str + "Reverse :: ";
                    break;
                case 12:
                    str = str + "Skip :: ";
                    break;
            }
        }
        str = str + "\nArray Implementation\nPlayer 2 draws " + draw + " times\n";
        for(int j = 0 ; j < p2.length ; j++){
            switch (p2[j] / 13) {
                case 0:
                    str = str + "Yellow ";
                    break;
                case 1:
                    str = str + "Green ";
                    break;
                case 2:
                    str = str + "Red ";
                    break;
                case 3:
                    str = str + "Blue ";
                    break;
                case 4:
                    if (p1[j] % 13 == 0) {
                        str = str + "Plus 4 Wild Card :: ";
                    } else {
                        str = str + "Pick Colour :: ";
                    }
            }
            switch (p2[j] % 13) {
                case 0:
                    if(p2[j]/13 == 4){
                        break;
                    }
                    str = str + "Zero :: ";
                    break;
                case 1:
                    if(p2[j]/13 == 4){
                        break;
                    }
                    str = str + "One :: ";
                    break;
                case 2:
                    str = str + "Two :: ";
                    break;
                case 3:
                    str = str + "Three :: ";
                    break;
                case 4:
                    str = str + "Four :: ";
                    break;
                case 5:
                    str = str + "Five :: ";
                    break;
                case 6:
                    str = str + "Six :: ";
                    break;
                case 7:
                    str = str + "Seven :: ";
                    break;
                case 8:
                    str = str + "Eight :: ";
                    break;
                case 9:
                    str = str + "Nine :: ";
                    break;
                case 10:
                    str = str + "Plus 2 :: ";
                    break;
                case 11:
                    str = str + "Reverse :: ";
                    break;
                case 12:
                    str = str + "Skip :: ";
                    break;
            }
        }
        return str;
    }
}
