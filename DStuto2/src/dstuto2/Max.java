/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dstuto2;

/**
 *
 * @author Forge-15 i7
 */
public class Max {

    public static <T extends Comparable> T getMax(T a, T b, T c) {
        T max = null;
        if (a instanceof Integer) {
            if (a.compareTo(b) > 0 && a.compareTo(c) > 0) {
                max = a;
            } else if (b.compareTo(a) > 0 && b.compareTo(c) > 0) {
                max = b;
            } else {
                max = c;
            }
        }
        else if(a instanceof Double){
            if (a.compareTo(b) > 0 && a.compareTo(c) > 0) {
                max = a;
            } else if (b.compareTo(a) > 0 && b.compareTo(c) > 0) {
                max = b;
            } else {
                max = c;
            }
        }
        return max;
    }
}
