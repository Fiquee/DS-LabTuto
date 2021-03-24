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
public class Edge<E> {
    GraphNode nextVertice;
    Edge nextEdge;
    E weight;

    public Edge(GraphNode nextVertice, Edge nextEdge, E weight) {
        this.nextVertice = nextVertice;
        this.nextEdge = nextEdge;
        this.weight = weight;
    }

    public GraphNode getNextVertice() {
        return nextVertice;
    }

    public void setNextVertice(GraphNode nextVertice) {
        this.nextVertice = nextVertice;
    }

    public Edge getNextEdge() {
        return nextEdge;
    }

    public void setNextEdge(Edge nextEdge) {
        this.nextEdge = nextEdge;
    }

    public E getWeight() {
        return weight;
    }

    public void setWeight(E weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return " -> " + nextVertice.data + " : " + weight;
    }
    
}
