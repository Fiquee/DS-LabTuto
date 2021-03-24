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
public class DPlan extends ISP {

    public DPlan(String planName, double mpbs, double gb) {
        super(planName, mpbs, gb);
        cost = 0;
    }

    public double getCost() {
        cost = (mpbs * 10) + (gb * 0.2);
        return cost;
    }
    public void Display(){
        System.out.println("Plan : DPlanwith price RM: " + getCost());
    }
}
