/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dslab6;

/**
 *
 * @author Forge-15 i7
 */
public class ColourCard<T> implements Comparable<ColourCard<T>> {

    T colour;
    int number;

    public ColourCard(T colour, int number) {
        this.colour = colour;
        this.number = number;
    }

    public String getColour() {
        switch ((int) colour) {
            case 0:
                return "Yellow";
            case 1:
                return "Red";
            case 2:
                return "Green";
            case 3:
                return "Blue";
            default:
                return "";
        }
    }

    public String getNumber() {
        switch (number) {
            case 0:
                return "One";
            case 1:
                return "Two";
            case 2:
                return "Three";
            case 3:
                return "Four";
            case 4:
                return "Five";
            case 5:
                return "Six";
            case 6:
                return "Seven";
            case 7:
                return "Eight";
            case 8:
                return "Nine";
            case 9:
                return "Ten";
            default:
                return "";
        }
    }

    public void setColour(T colour) {
        this.colour = colour;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String toString() {
        return getColour() + " " + getNumber();
    }

    @Override
    public int compareTo(ColourCard o) {
        if(number > o.number){
            return 1;
        }
        else if(number < o.number){
            return -1;
        }
        else if(number == o.number){
            if((int)colour > (int)o.colour){
                return 1;
            }
            else if((int)colour < (int)o.colour){
                return -1;
            }
        }
        return 0;
    }

}
