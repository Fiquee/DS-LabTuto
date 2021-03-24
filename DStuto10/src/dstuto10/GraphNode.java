/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dstuto10;

/**
 *
 * @author Forge-15 i7
 */
public class GraphNode <V,E>{
    V data;
    E edge;
    GraphNode nextVertice;
    boolean marked;

    public GraphNode(V data, GraphNode nextVertice) {
        this.data = data;
        this.nextVertice = nextVertice;
        edge = null;
        marked = false;
    }

    public V getVertice() {
        return data;
    }

    public E getEdge() {
        return edge;
    }

    public GraphNode getNextVertice() {
        return nextVertice;
    }

    public boolean isMarked() {
        return marked;
    }

    public void setVertice(V data) {
        this.data = data;
    }

    public void setEdge(E edge) {
        this.edge = edge;
    }

    public void setNextVertice(GraphNode nextVertice) {
        this.nextVertice = nextVertice;
    }

    public void setMarked(boolean marked) {
        this.marked = marked;
    }

    @Override
    public String toString() {
        return data + " --> ";
    }
    
    
}
