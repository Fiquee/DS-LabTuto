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
public class Tarikh {
    protected int day,month,year;
    private String str;

    public Tarikh(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        String str = "Date is : ";
        if(day<10){
            str ="0" + day + "/" + month + "/" + year;
            if(month<10){
                str ="0" + day + "/0" + month + "/" + year;
            }
        }
        else if(day>31 || month >12 || year > 9999){ 
            str = str + "Not valid";
        }
        else{
            str = str + day + "/" + month + "/" + year;
        }
        return str;
    }
}
