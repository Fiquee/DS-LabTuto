/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dstuto10;

import java.util.LinkedList;

/**
 *
 * @author Forge-15 i7
 */
public class Graph<V extends Comparable<V>, E> {

    GraphNode head;

    public Graph() {

    }

    public int size() {
        GraphNode curr = head;
        int count = 0;
        while (curr != null) {
            count++;
            curr = curr.nextVertice;
        }
        return count;
    }

    public void clear() {
        head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void showGraph() {
        GraphNode curr = head;
        while (curr != null) {
            System.out.println(curr.toString());
            Edge edgenode = (Edge) curr.edge;
            while (edgenode != null) {
                System.out.print(edgenode.toString());
                edgenode = edgenode.nextEdge;
            }
            System.out.println();
            curr = curr.nextVertice;
        }
    }

    public GraphNode hasVertice(V elem) {
        GraphNode curr = head;
        if (isEmpty()) {
            return null;
        } else {
            while (curr != null) {
                if (elem.compareTo((V) curr.data) == 0) {
                    return curr;
                }
                curr = curr.nextVertice;
            }
        }
        return null;
    }

    public void addVertice(V elem) {
        if (isEmpty()) {
            head = new GraphNode(elem, null);
        } else {
            GraphNode curr = head;
            while (curr.nextVertice != null) {
                curr = curr.nextVertice;
            }
            curr.nextVertice = new GraphNode(elem, null);
        }
    }

    public boolean addEdge(V from, V to, E weight) {
        if (hasVertice(from) == null || hasVertice(to) == null) {
            return false;
        } else {
            GraphNode curr = head;
            while (curr != null) {
                if (from.compareTo((V) curr.data) == 0) {
                    GraphNode temp = hasVertice(to);
                    Edge edgenode = new Edge(temp, null, weight);
                    if (curr.edge == null) {
                        curr.edge = edgenode;
                        return true;
                    } else {
                        Edge currentEdge = (Edge) curr.edge;
                        while (currentEdge.nextEdge != null) {
                            currentEdge = currentEdge.nextEdge;
                        }
                        currentEdge.nextEdge = edgenode;
                        return true;
                    }
                } else {
                    curr = curr.nextVertice;
                }
            }
        }
        return false;
    }

    public void markVertice(V elem) {
        if (hasVertice(elem) != null) {
            GraphNode curr = head;
            while (curr != null) {
                if (elem.compareTo((V) curr.data) == 0) {
                    curr.marked = true;
                    break;
                }
                curr = curr.nextVertice;
            }
        } else {
            System.out.println(elem + " does not exist in the Graph");
        }
    }

    public boolean isMarked(V elem) {
        if (hasVertice(elem) != null) {
            GraphNode curr = head;
            while (curr != null) {
                if (elem.compareTo((V) curr.data) == 0) {
                    return curr.marked;
                }
                curr = curr.nextVertice;
            }
        }
        return false;
    }

    public boolean isEdge(V from, V to) {
        if (hasVertice(from) == null || hasVertice(to) == null) {
            return false;
        } else {
            GraphNode curr = hasVertice(from);
            while (curr != null) {
                if (from.compareTo((V) curr.data) == 0) {
                    Edge currentEdge = (Edge) curr.edge;
                    if (currentEdge == null) {
                        return false;
                    }
                    while (currentEdge != null) {
                        if (to.compareTo((V) currentEdge.nextVertice.data) == 0) {
                            return true;
                        }
                        currentEdge = currentEdge.nextEdge;
                    }
                } else {
                    curr = curr.nextVertice;
                }
            }
        }
        return false;
    }

    public E getWeight(V from, V to) {
        if (!isEdge(from, to)) {
            return null;
        } else {
            if (hasVertice(from) == null || hasVertice(to) == null) {
                return null;
            }
            GraphNode curr = hasVertice(from);
            Edge currentEdge = (Edge) curr.edge;
            while (currentEdge != null) {
                if (to.compareTo((V) currentEdge.nextVertice.data) == 0) {
                    return (E) currentEdge.weight;
                }
                currentEdge = currentEdge.nextEdge;
            }
            return null;
        }
    }

    public LinkedList getAdjacent(V vertice) {
        LinkedList<V> adjacent = new LinkedList();
        if (hasVertice(vertice) != null) {
            GraphNode curr = hasVertice(vertice);
            Edge currentEdge = (Edge) curr.edge;
            if (currentEdge != null) {
                while (currentEdge != null) {
                    adjacent.add((V) currentEdge.nextVertice.data);
                    currentEdge = currentEdge.nextEdge;
                }
            }
        }
        return adjacent;
    }

    public boolean removeEdge(V from, V to) {
        if (!isEdge(from, to)) {
            return false;
        } else {
            if (hasVertice(from) == null || hasVertice(to) == null) {
                return false;
            }
            GraphNode curr = hasVertice(from);
            Edge currEdge = (Edge) curr.edge;
            if (to.compareTo((V) currEdge.nextVertice.data) == 0) {
                curr.edge = currEdge.nextEdge;
                return true;
            } else {
                while (currEdge != null && currEdge.nextEdge != null) {
                    if (to.compareTo((V) currEdge.nextEdge.nextVertice.data) == 0) {
                        currEdge.nextEdge = currEdge.nextEdge.nextEdge;
                        return true;
                    }
                    currEdge = currEdge.nextEdge;
                }
            }
        }
        return false;
    }

}
