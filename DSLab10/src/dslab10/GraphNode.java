/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dslab10;

/**
 *
 * @author Forge-15 i7
 */
public class GraphNode <V,E>{
    V data;
    GraphNode nextVertice;
    E edge; //edgelist
    boolean mark;

    public GraphNode(V data, GraphNode nextVertice) {
        this.data = data;
        this.nextVertice = nextVertice;
        this.edge = null;
        this.mark = false;
    }

    public V getData() {
        return data;
    }

    public void setData(V data) {
        this.data = data;
    }

    public GraphNode getNextVertice() {
        return nextVertice;
    }

    public void setNextVertice(GraphNode nextVertice) {
        this.nextVertice = nextVertice;
    }

    public E getEdge() {
        return edge;
    }

    public void setEdge(E edge) {
        this.edge = edge;
    }

    public boolean isMark() {
        return mark;
    }

    public void setMark(boolean mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return data + " --> ";
    }
    
    
    
    
    
}
