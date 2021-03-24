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
public class MPlan extends ISP {

    public MPlan(String planName, double mpbs, double gb) {
        super(planName, mpbs, gb);
    }

    public double getCost() {
        cost = (5*mpbs)+(0.8*gb);
        return cost;
    }
    public void Display(){
        System.out.println("Plan : MPlanwith price RM : " + getCost());
    }
}
