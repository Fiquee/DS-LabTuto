/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dslab1;

/**
 *
 * @author Forge-15 i7
 */
public class Polynomial {

    int degree;
    double[] co;
    double total = 0.0;

    public Polynomial(int degree, double[] co) {
        this.degree = degree;
        this.co = co;
    }

    public String getPoly() {
        String poly = "";
        for (int i = co.length - 1; i >= 0; i--) {
            if (i == 0) {
                poly = poly + co[i];
            } else {
                if (co[i - 1] > 0) {
                    if(i == 1){
                        poly = poly + co[i] + "x" + " +";
                    }
                    else
                        poly = poly + co[i] + "x^" + i + " +";
                } else if (co[i - 1] < 0) {
                    if(i == 1){
                        poly = poly + co[i] + "x" + " ";
                    }
                    else
                        poly = poly + co[i] + "x^" + i + " ";
                }
            }
        }
        return poly;
    }
    
    public void getValue(double x){
        for(int i = co.length-1 ; i>=0 ; i--){
            total += (co[i]*(Math.pow(x,i)));
        }
    }

    public double getTotal() {
        return total;
    }
    
    public String toString(){
        return getPoly() + " = " + getTotal();
    }
}
