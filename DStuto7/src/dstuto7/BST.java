/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dstuto7;


/**
 *
 * @author Forge-15 i7
 */
public class BST<T extends Comparable<T>> {

    int size = 0;
    BSTNode root;
    Queue q = new Queue();

    public BST() {
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void add(T t) {
        root = add(root, t);
    }

    public BSTNode add(BSTNode node, T elem) {
        if (node == null) {
            node = new BSTNode(elem, null, null);
            size++;
        } else if (elem.compareTo((T) node.data) <= 0) {
            node.left = add(node.left, elem);
        } else if (elem.compareTo((T) node.data) > 0) {
            node.right = add(node.right, elem);
        }
        return node;
    }

    public boolean contains(T elem) {
        return find(root, elem);
    }

    public boolean find(BSTNode node, T elem) {
        if (node == null) {
            return false;
        } else if (elem.compareTo((T) node.data) < 0) {
            return find(node.left, elem);
        } else if (elem.compareTo((T) node.data) > 0) {
            return find(node.right, elem);
        } else {
            return true;
        }
    }

    public void remove(T elem) {
        root = remove(root, elem);
    }

    public BSTNode remove(BSTNode node, T elem) {
        if (node == null) {
            System.out.println(elem + " is not exist in tree");
        } else if (elem.compareTo((T) node.data) < 0) {
            node.left = remove(node.left, elem);
        } else if (elem.compareTo((T) node.data) > 0) {
            node.right = remove(node.right, elem);
        } else {
            node = removenode(node);
        }
        return node;
    }

    public BSTNode removenode(BSTNode node) {
        if (node.left == null) {
            size--;
            return node.right;
        } else if (node.right == null) {
            size--;
            return node.left;
        } else {
            T setdata = getPredecessor(node.left, (T) node.data);
            node.data = setdata;
            node.left = remove(node.left, setdata);
            return node;
        }
    }

    public T getPredecessor(BSTNode node, T data) {
        while (node.right != null) {
            node = node.right;
        }
        return (T) node.data;
    }
    
    public void setOrder(int order){
        if(!q.isEmpty()){
            while(!q.isEmpty()){
                q.dequeue();
            }
        }
        if(order == 1){ //inOrder
            inOrder(root);
        }
        else if(order == 2){ //preOrder
            preOrder(root);
        }
        else if(order == 3){  //postOrder
            postOrder(root);
        }
        else{
            System.out.println("Order is invalid");
        }
    }
    
    public void inOrder(BSTNode node){
        if(node != null){
            inOrder(node.left);
            q.enqueue((T)node.data);
            inOrder(node.right);
        }
    }
    public void preOrder(BSTNode node){
        if(node != null){
            q.enqueue((T)node.data);
            preOrder(node.left);
            preOrder(node.right);
        }
    }
    public void postOrder(BSTNode node){
        if(node != null){
            postOrder(node.left);
            postOrder(node.right);
            q.enqueue((T)node.data);
            
        }
    }
    
    public void showTree(){
        q.showQueue();
    }
}
