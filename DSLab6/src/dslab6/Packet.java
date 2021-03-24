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
public class Packet implements Comparable<Packet>{
    String type;
    int priority;

    public Packet(String type, int priority) {
        this.type = type;
        this.priority = priority;
    }

    public String getType() {
        return type;
    }

    public int getPriority() {
        return priority;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "" + type + " (Priority=" + priority + ")";
    }

    @Override
    public int compareTo(Packet o) {
        return priority - o.priority;
    }
}
