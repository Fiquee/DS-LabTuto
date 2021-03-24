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
public class Edge <V,E>{
    GraphNode Edgevertice;
    E weight;
    Edge nextEdge; //list of edges for one vertice

    public Edge(GraphNode Edgevertice, E weight, Edge nextEdge) {
        this.Edgevertice = Edgevertice;
        this.weight = weight;
        this.nextEdge = nextEdge;
    }

    public GraphNode getEdgevertice() {
        return Edgevertice;
    }

    public void setEdgevertice(GraphNode Edgevertice) {
        this.Edgevertice = Edgevertice;
    }

    public E getWeight() {
        return weight;
    }

    public void setWeight(E weight) {
        this.weight = weight;
    }

    public Edge getNextEdge() {
        return nextEdge;
    }

    public void setNextEdge(Edge nextEdge) {
        this.nextEdge = nextEdge;
    }

    @Override
    public String toString() {
        return " -> " + Edgevertice.data + " : " + weight;
    }
    
}
