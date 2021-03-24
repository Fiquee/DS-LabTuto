/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dslab7;

/**
 *
 * @author Forge-15 i7
 */
public class BST<T extends Comparable<T>> {

    int size = 0;
    BSTNode root;
    Queue q;

    public BST() {
        root = null;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
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

    public void add(T elem) {
        root = add(root, elem);
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

    public void remove(T elem) {
        if (!isEmpty()) {
            root = remove(root, elem);
        }
    }

    public BSTNode remove(BSTNode node, T elem) {
        if (node == null) {

        } else if (elem.compareTo((T) node.data) < 0) {
            node.left = remove(node.left, elem);
        } else if (elem.compareTo((T) node.data) > 0) {
            node.right = remove(node.right, elem);
        } else {
            node = removeNode(node);
        }
        return node;
    }

    public BSTNode removeNode(BSTNode node) {
        if (node.left == null) {
            size--;
            return node.right;
        } else if (node.right == null) {
            size--;
            return node.left;
        } else {
            T data = getPrio(node.left);
            node.data = data;
            node.left = remove(node.left, data);
            return node;
        }
    }

    public T getPrio(BSTNode node) {
        while (node.right != null) {
            node = node.right;
        }
        return (T) node.data;
    }

    public void setOrder(int order) { //1 inorder 2 preorder 3 postorder
        q = new Queue();
        if (order == 1) {
            inOrder(root, q);
        } else if (order == 2) {
            preOrder(root, q);
        } else if (order == 3) {
            postOrder(root, q);
        } else {
            System.out.println("invalid order");
        }
    }

    public void inOrder(BSTNode node, Queue q) {
        if (node != null) {
            inOrder(node.left, q);
            q.enqueue((T) node.data);
            inOrder(node.right, q);
        }
    }

    public void preOrder(BSTNode node, Queue q) {
        if (node != null) {
            q.enqueue((T) node.data);
            preOrder(node.left, q);
            preOrder(node.right, q);
        }
    }

    public void postOrder(BSTNode node, Queue q) {
        if (node != null) {
            postOrder(node.left, q);
            postOrder(node.right, q);
            q.enqueue((T) node.data);
        }
    }

    public void showTree() {
        q.showQueue();
    }

    public T getMin() {
        BSTNode node = root;
        while (node.left != null) {
            node = node.left;
        }
        return (T) node.data;
    }

    public T getMax() {
        BSTNode node = root;
        while (node.right != null) {
            node = node.right;
        }
        return (T) node.data;
    }

    public int getTotal() {
        int max = getTotal(root, 0);
        return max;
    }

    public int getTotal(BSTNode node, int max) {
        if (node != null) {
            max = getTotal(node.left, max);
            max = max + (int) node.data;
            max = getTotal(node.right, max);
        }
        return max;
    }

    public int getOccurrence(T elem) {
        int occ = 0;
        occ = findElement(root, elem, occ);
        return occ;
    }

    public int findElement(BSTNode node, T elem, int occ) {
        if (node == null) {

        } else if (elem.compareTo((T) node.data) < 0) {
            occ = findElement(node.left, elem, occ);
        } else if (elem.compareTo((T) node.data) > 0) {
            occ = findElement(node.right, elem, occ);
        } else {
            occ++;
            if (node.left != null) {
                occ = findElement(node.left, elem, occ);
            }
        }
        return occ;
    }
}
