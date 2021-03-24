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
public class ArrayBST<T extends Comparable<T>> {

    int height = 0;
    int size = 0;
    T[] arr;
    int max = 20;

    public ArrayBST() {
        arr = (T[]) new Comparable[max];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    public int getHeight() {
        int index = -1;
        for (int i = max - 1; i >= 0; i--) {
            if (arr[i] != null) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            return (int) (Math.log(index) / Math.log(2)) + 1;
        }
        return 0;
    }

    public void addNode(T elem) {
        if (size == max) {
            System.out.println("BST is full");
        } else {
            arr[0] = addNode(arr, arr[0], elem, 0);
        }
    }

    public T addNode(T[] arr, T node, T elem, int k) {
        try {
            if (node == null) {
                node = elem;
                size++;
            } else if (elem.compareTo((T) node) < 0) {
                arr[2 * k + 1] = addNode(arr, arr[2 * k + 1], elem, 2 * k + 1);
            } else if (elem.compareTo((T) node) > 0) {
                arr[2 * k + 2] = addNode(arr, arr[2 * k + 2], elem, 2 * k + 2);
            }
        } catch (ArrayIndexOutOfBoundsException e) {

        }
        return (T) node;
    }

    public T getNode(int index) {
        if (index >= max) {
            System.out.print("Index is out of bound : ");
            return null;
        } else {
            return arr[index];
        }
    }

    public void inOrder(int k) {
        if (k < max) {
            if (arr[k] != null) {
                inOrder(2 * k + 1);
                System.out.print(arr[k] + " --> ");
                inOrder(2 * k + 2);
            }
        }
    }

    public void preOrder(int k) {
        if (k < max) {
            if (arr[k] != null) {
                System.out.print(arr[k] + " --> ");
                preOrder(2 * k + 1);
                preOrder(2 * k + 2);
            }
        }
    }

    public void postOrder(int k) {
        if (k < max) {
            if (arr[k] != null) {
                postOrder(2 * k + 1);
                postOrder(2 * k + 2);
                System.out.print(arr[k] + " --> ");
            }
        }
    }

    public boolean remove(T elem) {
        boolean found = false;
        if (isEmpty()) {
            return found;
        } else {
            for (int i = 0; i < max; i++) {
                if(arr[i] == null){
                    continue;
                }
                if (arr[i].compareTo(elem) == 0) {
                    if (2 * i + 1 >= max || 2 * i + 2 >= max) {
                        arr[i] = null;
                        found = true;
                        break;
                    } else if (arr[2 * i + 1] == null && arr[2 * i + 2] == null) {
                        arr[i] = null;
                        found = true;
                        break;
                    } else if (arr[2 * i + 2] == null) {
                        replace(i, 2 * i + 1);
                        found = true;
                        break;
                    } else if (arr[2 * i + 1] == null) {
                        replace(i, 2 * 1 + 2);
                        found = true;
                        break;
                    } else {
                        replaceWithChildren(i);
                        found = true;
                        break;
                    }
                }
            }
        }
        size--;
        return found;
    }

    public void replaceWithChildren(int a) {
        int currentIndex = a * 2 + 2;
        while (currentIndex * 2 + 1 < max && arr[currentIndex * 2 + 1] != null) {
            currentIndex = currentIndex * 2 + 1;
        }
        arr[a] = arr[currentIndex];

        int currentRoot = currentIndex;
        if (arr[currentIndex * 2 + 2] != null) {
            replace(currentIndex, currentIndex * 2 + 2);
        } else {
            arr[currentIndex] = null;
        }
    }

    public void replace(int a, int b) {
        Queue<Integer> tempQ = new Queue<>();
        Queue<Integer> oldQ = new Queue<>();
        Queue<Integer> newQ = new Queue<>();
        int currentIndex, oldIndex, newIndex;

        tempQ.enqueue(b);
        while (!tempQ.isEmpty()) {
            currentIndex = tempQ.dequeue();
            newQ.enqueue(currentIndex);
            if ((currentIndex * 2 + 2) <= (Math.pow(2, getHeight()) - 2)) {
                tempQ.enqueue(currentIndex * 2 + 1);
                tempQ.enqueue(currentIndex * 2 + 2);
            }
        }
        tempQ.enqueue(a);
        while (!tempQ.isEmpty()) {
            currentIndex = tempQ.dequeue();
            oldQ.enqueue(currentIndex);
            if ((currentIndex * 2 + 2) <= (Math.pow(2, getHeight()) - 2)) {
                tempQ.enqueue(currentIndex * 2 + 1);
                tempQ.enqueue(currentIndex * 2 + 2);
            }
        }
        while (!newQ.isEmpty()) {
            oldIndex = oldQ.dequeue();
            newIndex = newQ.dequeue();
            arr[oldIndex] = arr[newIndex];
            arr[newIndex] = null;
        }
    }
}
