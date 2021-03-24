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
public class Time {
    int hour,minute;

    public Time(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }
    public String Check(){
        if(hour > 23 || hour < 0 || minute > 59 || minute < 0){
            return " Invalid time input";
        }
        else
           return " ";
    }
    public String Display(){
        String time = "";
        if(hour > 23 || hour < 0 || minute > 59 || minute < 0){
            
        }
        else{
            if(hour >= 12){
                if(hour > 12){
                    hour = hour - 12;
                    time = time + hour + ":" + minute + " PM";
                }
                else{
                    time = time + hour + ":" + minute + " PM";
                }
            }
            else{
                time = time + hour + ":" + minute + " AM";
            }
        }
        return time;
    }
    public String toString(){
        return "Hour: " + hour + " Minute: " + minute + Check() + Display();
    }
}
