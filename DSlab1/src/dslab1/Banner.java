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
public abstract class Banner {
    protected String[] line = new String[5];
    protected char character;
    public String getLineAt(int index) {
        return line[index];
    }
}
