/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dslab8;

import java.lang.reflect.Array;

/**
 *
 * @author Forge-15 i7
 */
public class Sort<T extends Comparable<T>> {

    T[] arr;

    public Sort(T[] t) {
        arr = (T[]) new Comparable[t.length];
        for (int i = 0; i < t.length; i++) {
            arr[i] = t[i];
        }
    }

    public void selectionSort() {
        for (int i = 0; i < arr.length - 1; i++) {
            swap(i, getMinIndex(i));
        }
    }

    public int getMinIndex(int start) {
        T temp = arr[start];
        int index = start;
        for (int i = start + 1; i < arr.length; i++) {
            if (temp.compareTo(arr[i]) > 0) {
                index = i;
                temp = arr[i];
            }
        }
        return index;
    }

    public void bubbleSort() {
        for(int i = 0 ; i < arr.length-1 ; i++){
            for(int j = 0 ; j < arr.length-1-i ; j++){
                if(arr[j].compareTo(arr[j+1]) > 0){
                    swap(j,j+1);
                }
            }
        }
    }

    public void insertionSort() {
        int j;
        for (int i = 1; i < arr.length; i++) {
            for (j = 0; j < i; j++) {
                if (arr[i].compareTo(arr[j]) < 0) {
                    swap(i, j);
                    break;
                }
            }
            for (j = j + 1; j < i; j++) {
                swap(i, j);
            }
        }
    }

    public void mergeSort() {
        mergeSort(0, arr.length - 1);
    }

    public void mergeSort(int first, int last) {
        if (first < last) {
            int middle = (first + last) / 2;
            mergeSort(first, middle);
            mergeSort(middle + 1, last);
            merge(first, middle, middle + 1, last);
        }
    }

    public void merge(int firstleft, int lastleft, int firstright, int lastright) {
        T[] temp = (T[]) new Comparable[arr.length];
        int index = firstleft;
        int currentindex = firstleft;
        while (firstleft <= lastleft && firstright <= lastright) {
            if (arr[firstleft].compareTo(arr[firstright]) < 0) {
                temp[index] = arr[firstleft];
                firstleft++;
            } else {
                temp[index] = arr[firstright];
                firstright++;
            }
            index++;
        }
        while (firstleft <= lastleft) {
            temp[index] = arr[firstleft];
            firstleft++;
            index++;
        }
        while (firstright <= lastright) {
            temp[index] = arr[firstright];
            firstright++;
            index++;
        }
        for (int i = currentindex; i <= lastright; i++) {
            arr[i] = temp[i];
        }
    }

    public void specialmergeSort() {   //odd always less than even
        specialmergeSort(0, arr.length - 1);
    }

    public void specialmergeSort(int first, int last) {
        if (first < last) {
            int middle = (first + last) / 2;
            specialmergeSort(first, middle);
            specialmergeSort(middle + 1, last);
            specialmerge(first, middle, middle + 1, last);
        }
    }

    public void specialmerge(int firstleft, int lastleft, int firstright, int lastright) {
        T[] temp = (T[]) new Comparable[arr.length];
        int index = firstleft;
        int currentindex = firstleft;
        while (firstleft <= lastleft && firstright <= lastright) {
            if ((Integer) arr[firstleft] % 2 == 0 && (Integer) arr[firstright] % 2 != 0) {
                temp[index] = arr[firstright];
                firstright++;
            } else if ((Integer) arr[firstleft] % 2 != 0 && (Integer) arr[firstright] % 2 == 0) {
                temp[index] = arr[firstleft];
                firstleft++;
            } else {
                if (arr[firstleft].compareTo(arr[firstright]) < 0) {
                    temp[index] = arr[firstleft];
                    firstleft++;
                } else {
                    temp[index] = arr[firstright];
                    firstright++;
                }
            }
            index++;
        }
        while (firstleft <= lastleft) {
            temp[index] = arr[firstleft];
            firstleft++;
            index++;
        }
        while (firstright <= lastright) {
            temp[index] = arr[firstright];
            firstright++;
            index++;
        }
        for (int i = currentindex; i <= lastright; i++) {
            arr[i] = temp[i];
        }
    }

    public void quickSort() {
        quickSort(0, arr.length - 1);
    }

    public void quickSort(int first, int last) {
        if (first < last) {
            int split = getSplitIndex(first, last);
            quickSort(first, split - 1);
            quickSort(split + 1, last);
        }
    }

    public int getSplitIndex(int first, int last) {
        T pivot = arr[last];
        int index = first;

        for (int i = first; i < last; i++) {
            if (pivot instanceof String) {
                String[] elem1 = ((String) arr[i]).split(" : ");
                Integer PID1 = Integer.valueOf(elem1[0].replace("P", ""));
                Double price1 = Double.valueOf(elem1[2]);

                String[] elem2 = ((String) pivot).split(" : ");
                Integer PID2 = Integer.valueOf(elem2[0].replace("P", ""));
                Double price2 = Double.valueOf(elem2[2]);

                if (price1.compareTo(price2) < 0) {
                    swap(index, i);
                    index++;
                } else if (price1.compareTo(price2) == 0 && PID1.compareTo(PID2) < 0) {
                    swap(index, i);
                    index++;
                }
            } else {
                if (arr[i].compareTo(pivot) <= 0) {
                    swap(index, i);
                    index++;
                }
            }
        }
        swap(index, last);
        return index;
    }

    private void swap(int i, int j) {
        T temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

    public void showArray() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
    }

    public void showArraybyLine() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public void sort(int i) {
        if (i == 0) {
            selectionSort();
        } else if (i == 1) {
            bubbleSort();
        } else if (i == 2) {
            insertionSort();
        } else if (i == 3) {
            mergeSort();
        } else if (i == 4) {
            quickSort();
        }
    }
}
