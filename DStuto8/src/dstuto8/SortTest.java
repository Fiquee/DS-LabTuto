/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dstuto8;

import java.util.Random;

/**
 *
 * @author Forge-15 i7
 */
public class SortTest<T extends Comparable<T>> {

    public static final int ASCENDING = 1;
    public static final int DESCENDING = 2;
    private final int size = 10;
    private final int max = 100;
    private final int maxchar = 26;
    private Random r;
    private T[] arr;
    private int orderType;

    public SortTest(int orderType, T data) {
        this.orderType = orderType;
        arr = (T[]) new Comparable[size];
        r = new Random();
        for (int i = 0; i < size; i++) {
            if (data instanceof Integer) {
                arr[i] = (T) ((Integer) r.nextInt(max));
            } else if (data instanceof Double) {
                arr[i] = (T) ((Double) (0.01 * r.nextInt(max)));
            } else if (data instanceof Character) {
                char c = (char) (r.nextInt(maxchar) + 'A');
                arr[i] = (T) (Character) c;
            } else {
                String str = getrandomString(8);
                arr[i] = (T) (str);
            }
        }
    }
    public String getrandomString(int len){
        String str = "";
        for(int i = 0 ; i < len ; i++){
            char c = (char) (r.nextInt(maxchar) + 'a');
            str = str + c;
        }
        return str;
    }

    public boolean isSorted() {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].compareTo(arr[i + 1]) > 0 && orderType == ASCENDING) {
                return false;
            } else if (arr[i].compareTo(arr[i + 1]) < 0 && orderType == DESCENDING) {
                return false;
            }
        }
        return true;
    }

    public void swap(int index1, int index2) {
        T temp = arr[index2];
        arr[index2] = arr[index1];
        arr[index1] = temp;
    }

    public void showArray() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
    }

    public void selectionSort() {
        for (int i = 0; i < arr.length; i++) {
            swap(i, getMinIndex(i));
        }
    }

    public int getMinIndex(int start) {
        T temp = arr[start];
        int index = start;
        for (int i = start + 1; i < arr.length; i++) {
            if (arr[i].compareTo(temp) < 0 && orderType == ASCENDING) {
                temp = arr[i];
                index = i;
            } else if (arr[i].compareTo(temp) > 0 && orderType == DESCENDING) {
                temp = arr[i];
                index = i;
            }
        }
        return index;
    }

    public void bubbleSort() {
        for (int iteration = 0; iteration < arr.length - 1; iteration++) {
            for (int i = 0; i < arr.length - 1 - iteration; i++) {
                if (arr[i].compareTo(arr[i + 1]) > 0 && orderType == ASCENDING) {
                    swap(i, i + 1);
                } else if (arr[i].compareTo(arr[i + 1]) < 0 && orderType == DESCENDING) {
                    swap(i, i + 1);
                }
            }
        }
    }

    public void insertionSort() {
        int j;
        for (int i = 1; i < arr.length; i++) {
            for (j = 0; j < i; j++) {
                if (arr[i].compareTo(arr[j]) < 0 && orderType == ASCENDING) {
                    swap(i, j);
                    break;
                } else if (arr[i].compareTo(arr[j]) > 0 && orderType == DESCENDING) {
                    swap(i, j);
                    break;
                }
            }
            for (j = j + 1; j < i; j++) {
                swap(j, i);
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

    public void merge(int leftfirst, int leftlast, int rightfirst, int rightlast) {
        T[] temp = (T[]) new Comparable[size];
        int index = leftfirst;
        int currentindex = leftfirst;

        while (leftfirst <= leftlast && rightfirst <= rightlast) {
            if ((arr[leftfirst].compareTo(arr[rightfirst]) < 0 && orderType == ASCENDING) || (arr[leftfirst].compareTo(arr[rightfirst]) > 0 && orderType == DESCENDING)) {
                temp[index] = arr[leftfirst];
                leftfirst++;
            } else {
                temp[index] = arr[rightfirst];
                rightfirst++;
            }
            index++;
        }
        while (leftfirst <= leftlast) {
            temp[index] = arr[leftfirst];
            leftfirst++;
            index++;
        }
        while (rightfirst <= rightlast) {
            temp[index] = arr[rightfirst];
            rightfirst++;
            index++;

        }
        for (int i = currentindex; i <= rightlast; i++) {
            arr[i] = temp[i];
        }
    }

    public void quickSort() {
        quickSort(0, arr.length - 1);
    }

    public void quickSort(int first, int last) {
        if (first < last) {
            int splitIndex = split(first, last);
            quickSort(first, splitIndex - 1);
            quickSort(splitIndex + 1, last);
        }
    }

    public int split(int first, int last) {
        boolean correctside;
        T splitValue = arr[first];
        int index = first;
        first++;
        do {
            correctside = true;
            while (correctside) {
                if ((splitValue.compareTo(arr[first]) < 0 && orderType == ASCENDING) || (splitValue.compareTo(arr[first]) >= 0 && orderType == DESCENDING)) {
                    correctside = false;
                } else {
                    first++;
                    if (first <= last) {
                        correctside = true;
                    } else {
                        correctside = false;
                    }
                }
            }
            if (first <= last) {
                correctside = true;
            } else {
                correctside = false;
            }
            while (correctside) {
                if ((splitValue.compareTo(arr[last]) >= 0 && orderType == ASCENDING) || splitValue.compareTo(arr[last]) < 0 && orderType == DESCENDING) {
                    correctside = false;
                } else {
                    last--;
                    if (first <= last) {
                        correctside = true;
                    } else {
                        correctside = false;
                    }
                }
            }
            if (first < last) {
                swap(first, last);
                first++;
                last--;
            }
        } while (first <= last);
        swap(index, last);
        return last;
    }
}
