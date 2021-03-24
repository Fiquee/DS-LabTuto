/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dslab10;

import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * @author Forge-15 i7
 */
public class Graph<V extends Comparable<V>, E> {

    GraphNode head;

    public Graph() {
        head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        int count = 0;
        if (!isEmpty()) {
            GraphNode curr = head;
            while (curr != null) {
                count++;
                curr = curr.nextVertice;
            }
        }
        return count;
    }

    public void clear() {
        head = null;
    }

    public void showGraph() {
        if (!isEmpty()) {
            GraphNode curr = head;
            while (curr != null) {
                System.out.println(curr.toString());
                Edge edgeNode = (Edge) curr.edge;
                while (edgeNode != null) {
                    System.out.print(edgeNode.toString());
                    edgeNode = edgeNode.nextEdge;
                }
                System.out.println();
                curr = curr.nextVertice;
            }
        } else {
            System.out.println("Graph is Empty");
        }
    }

    public GraphNode getVertice(V vertice) {
        if (isEmpty()) {
            return null;
        } else {
            GraphNode curr = head;
            while (curr != null) {
                if (vertice.compareTo((V) curr.data) == 0) {
                    return curr;
                }
                curr = curr.nextVertice;
            }
            return null;
        }
    }

    public void mark(V vertice) {
        if (getVertice(vertice) == null) {
            System.out.println(vertice + " is not exist in the graph");
        } else {
            GraphNode node = getVertice(vertice);
            node.mark = true;
        }
    }

    public boolean isMarked(V vertice) {
        if (getVertice(vertice) == null) {
            return false;
        } else {
            return getVertice(vertice).mark;
        }
    }

    public void addVertice(V elem) {
        GraphNode newnode = new GraphNode(elem, null);
        if (isEmpty()) {
            head = newnode;
        } else {
            GraphNode curr = head;
            while (curr.nextVertice != null) {
                curr = curr.nextVertice;
            }
            curr.nextVertice = newnode;
        }
    }

    public boolean addEdge(V from, V to, E weight) {
        if (getVertice(from) == null || getVertice(to) == null) {
            return false;
        } else {
            GraphNode node = getVertice(from);
            GraphNode edgeNode = getVertice(to);
            Edge edge = (Edge) node.edge;
            if (edge == null) {
                node.edge = new Edge(edgeNode, weight, null);
                return true;
            } else {
                while (edge.nextEdge != null) {
                    edge = edge.nextEdge;
                }
                edge.nextEdge = new Edge(edgeNode, weight, null);
                return true;
            }
        }
    }

    public boolean isEdge(V from, V to) {
        if (getVertice(from) == null || getVertice(to) == null) {
            return false;
        } else {
            GraphNode target = getVertice(to);
            Edge edgeNode = (Edge) getVertice(from).edge;
            while (edgeNode != null) {
                if (edgeNode.Edgevertice == target) {
                    return true;
                }
                edgeNode = edgeNode.nextEdge;
            }
            return false;
        }
    }

    public boolean removeEdge(V from, V to) {
        if (!isEdge(from, to)) {
            return false;
        } else {
            GraphNode target = getVertice(to);
            Edge edgeNode = (Edge) getVertice(from).edge;
            if (edgeNode.Edgevertice == target) {
                getVertice(from).edge = edgeNode.nextEdge;
                return true;
            } else {
                while (edgeNode != null && edgeNode.nextEdge != null) {
                    if (edgeNode.nextEdge.Edgevertice == target) {
                        edgeNode.nextEdge = edgeNode.nextEdge.nextEdge;
                        return true;
                    }
                    edgeNode = edgeNode.nextEdge;
                }
                return false;
            }
        }
    }

    public ArrayList getEdge(V vertice) {
        ArrayList edgelist = new ArrayList();
        Edge edgeNode = (Edge) getVertice(vertice).edge;
        while (edgeNode != null) {
            edgelist.add(edgeNode.Edgevertice.data);
            edgeNode = edgeNode.nextEdge;
        }
        return edgelist;
    }

    public E getWeight(V from, V to) {
        if (!isEdge(from, to)) {
            return null;
        } else {
            GraphNode target = getVertice(to);
            Edge edgeNode = (Edge) getVertice(from).edge;
            while (edgeNode != null) {
                if (edgeNode.Edgevertice == target) {
                    return (E) edgeNode.weight;
                }
                edgeNode = edgeNode.nextEdge;
            }
            return null;
        }
    }

    public boolean DFS(V start, V to) {
        Stack<V> nodeStack = new Stack();
        Stack<V> pathStack = new Stack();
        ArrayList<V> adjascent = new ArrayList();
        if (getVertice(start) == null || getVertice(to) == null) {
            return false;
        } else {
            nodeStack.push(start);
            while (true) {
                V current = nodeStack.peek();
                mark(current);
                if (current.compareTo(to) == 0) {
                    while (!nodeStack.isEmpty()) {
                        V pathnode = nodeStack.pop();
                        if (isMarked(pathnode)) {
                            if(!pathStack.contains(pathnode)){
                                pathStack.push(pathnode);
                            }
                        }
                    }
                    break;
                } else {
                    adjascent = getEdge(current);
                    for (int i = 0; i < adjascent.size(); i++) {
                        if(getVertice(adjascent.get(i)).mark == true){
                            adjascent.remove(i);
                        }
                    }
                }
                if (adjascent.size() == 0) {
                    while(true){
                        if(nodeStack.isEmpty()){
                            System.out.println("No solution");
                            return false;
                        }
                        nodeStack.pop();
                        if(nodeStack.isEmpty()){
                            System.out.println("No solution");
                            return false;
                        }
                        if(!isMarked(nodeStack.peek())){
                            break;
                        }
                    }
                } else {
                    for (int i = 0; i < adjascent.size(); i++) {
                        nodeStack.push(adjascent.get(i));
                    }
                }
            }
        }
        while(!pathStack.isEmpty()){
            System.out.print(pathStack.pop() + " --> ");
        }
        System.out.println();
        return true;
    }

}
