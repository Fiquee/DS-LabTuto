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
public class Buy <T> {
    int number;
    int price;
    int day;
    String type;

    public Buy(String type,int number, int price,int day) {
        this.type = type;
        this.number = number;
        this.price = price;
        this.day = day;
    }

    public int getNumber() {
        return number;
    }

    public int getPrice() {
        return price;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        if(type.equalsIgnoreCase("buy")){
        return "\nDay " + day + " : Buy " + number + " shares at RM " + price;
        }
        else{
            return "\nDay " + day + " : Sell " + number + " shares at RM " + price;
        }
    }
    
}
