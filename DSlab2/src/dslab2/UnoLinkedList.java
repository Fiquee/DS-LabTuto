/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dslab2;

import java.util.Collections;
import java.util.LinkedList;

/**
 *
 * @author Forge-15 i7
 */
public class UnoLinkedList<T> implements UNO {
    LinkedList deck = new LinkedList();
    LinkedList p1 = new LinkedList();
    LinkedList p2 =  new LinkedList();
    int draw;

    public UnoLinkedList(int draw) {
        this.draw = draw;
        for(int i = 0 ; i < 54 ; i++){
            deck.add(i);
        }
        Collections.shuffle(deck);
    }
    
    @Override
    public void Draw() {
        for(int i = 0 ; i < draw ; i++){
            p1.add(deck.get(i));
        }
        for(int j = 0 ; j < draw ; j++){
            p2.add(deck.get(j+draw));
        }
    }
    
    @Override
    public String toString(){
        String str = "Linked List Implementation\nPlayer 1 draws " + draw + " times\n";
        for (int i = 0; i < p1.size(); i++) {
            switch ((Integer)p1.get(i) / 13) {
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
                    if ((Integer)p1.get(i) % 13 == 0) {
                        str = str + "Plus 4 Wild Card :: ";
                    } else {
                        str = str + "Pick Colour :: ";
                    }
                    break;
            }
            switch ((Integer)p1.get(i) % 13) {
                
                case 0:
                    if((Integer)p1.get(i)/13 == 4){
                        break;
                    }
                    str = str + "Zero :: ";
                    break;
                case 1:
                    if((Integer)p1.get(i)/13 == 4){
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
        str = str + "\nLinkedList Implementation\nPlayer 2 draws " + draw + " times\n";
        for(int j = 0 ; j < p2.size() ; j++){
            switch ((Integer)p2.get(j) / 13) {
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
                    if ((Integer)p2.get(j) % 13 == 0) {
                        str = str + "Plus 4 Wild Card :: ";
                    } else {
                        str = str + "Pick Colour :: ";
                    }
            }
            switch ((Integer)p2.get(j) % 13) {
                case 0:
                    if((Integer)p2.get(j) == 4){
                        break;
                    }
                    str = str + "Zero :: ";
                    break;
                case 1:
                    if((Integer)p2.get(j) == 4){
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
