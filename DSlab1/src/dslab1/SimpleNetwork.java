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
public class SimpleNetwork {

    String name, IPaddress, subnetmask, status;

    public SimpleNetwork(String name, String IPaddress, String subnetmask, String status) {
        this.name = name;
        this.IPaddress = IPaddress;
        this.subnetmask = subnetmask;
        this.status = status;
    }

    public void tryping(SimpleNetwork destination) {
        if (destination.status.equalsIgnoreCase("down")) {
            System.out.println(name + " cannot ping " + destination.name + " because the destination " + destination.name + " is down.");
        } else if (!sameNetwork(destination)) {
            System.out.println(name + " cannot ping " + destination.name + " because the destination " + destination.name + " is located in different network.");
        } else {
            System.out.println(name + " can ping " + destination.name);
        }
    }

    public boolean sameNetwork(SimpleNetwork destination) {
        String[] ip1 = IPaddress.split("\\.");
        String[] ip2 = destination.IPaddress.split("\\.");
        for (int i = 0; i < ip1.length; i++) {
            if (i == ip1.length - 1) {
                if (ip1[i].charAt(0) != ip2[i].charAt(0)) {
                    return false;
                }
            } else if (ip1[i].compareTo(ip2[i]) != 0) {
                return false;
            }
        }
        if (!subnetmask.equals(destination.subnetmask)) {
            return false;
        }
        return true;
    }
}
