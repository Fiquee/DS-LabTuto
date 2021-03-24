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
public class ISP {
    protected String planName;
    protected double mpbs,gb,cost;

    public ISP(String planName, double mpbs, double gb) {
        this.planName = planName;
        this.mpbs = mpbs;
        this.gb = gb;
        this.cost = cost;
    }

    public String getPlanName() {
        return planName;
    }

    public double getMpbs() {
        return mpbs;
    }

    public double getGb() {
        return gb;
    }

    public double getCost() {
        return cost;
    }
    public void Display(){
        System.out.println(planName);
    }
}

