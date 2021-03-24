/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dstuto1;

/**
 *
 * @author Forge-15 i7
 */
public class SmartPhone implements Comparable<SmartPhone>{

    String name;
    int price;

    public SmartPhone(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int compareTo(SmartPhone o) {
        return price - o.price;
    }

    @Override
    public String toString() {
        return "" + getName() + " (" + getPrice() + ")";
    }

}
