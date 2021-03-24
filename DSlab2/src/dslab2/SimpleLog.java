/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dslab2;

/**
 *
 * @author Forge-15 i7
 */
public interface SimpleLog<T> {
    public void insert(T t);
    public boolean isFull();
    public int getSize();
    public void contains(T t);
    public void Delete();
    public void Display();
}
