/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dstuto9;

import java.util.Random;

/**
 *
 * @author Forge-15 i7
 */
public class SearchTest<T extends Comparable<T>> {

    T elem;
    T[] arr;
    int size;

    public SearchTest(T elem, int size) {
        this.elem = elem;
        this.size = size;
        arr = (T[]) new Comparable[size];
        Random r = new Random();

        if (elem instanceof Integer) {
            for (int i = 0; i < size; i++) {
                arr[i] = (T) ((Integer) r.nextInt(11));
            }
        } else if (elem instanceof Character) {
            for (int i = 0; i < size; i++) {
                char c = (char) (r.nextInt(26) + 'A');
                arr[i] = (T) ((Character) c);
            }
        }
    }

    public void showArray() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public boolean LinearSearch(T elem) {
        try {
            for (int i = 0; i < size; i++) {
                if (elem.compareTo(arr[i]) == 0) {
                    return true;
                }
            }

        } catch (NullPointerException e) {

        }
        return false;
    }

    public int LinearSearchCount(T elem) {
        int count = 0;
        try {
            for (int i = 0; i < size; i++) {
                if (elem.compareTo(arr[i]) == 0) {
                    count++;
                }
            }
        } catch (NullPointerException e) {

        }
        return count;
    }

    public String getIndex(T elem) {
        String index = "";
        try {
            for (int i = 0; i < size; i++) {
                if (elem.compareTo(arr[i]) == 0) {
                    index = index + i + " ";
                }
            }
        } catch (NullPointerException e) {

        }
        return index;
    }

    public String getIndex(T start, T end) {
        String str = "";
        if (start instanceof Integer && end instanceof Integer) {
            if (start.compareTo(end) > 0) {
                System.out.println("Error : start from " + end + " end from " + start);
            } else {
                int i, j;
                int diff = (Integer) end - (Integer) start;
                T[] chararray = (T[]) new Comparable[diff];
                for (i = 0, j = 1; i < chararray.length; i++, j++) {
                    chararray[i] = (T) (Integer) ((Integer) start + j);
                }
                for (i = 0; i < chararray.length; i++) {
                    for (j = 0; j < size; j++) {
                        if (arr[j].compareTo(chararray[i]) == 0) {
                            str = str + j + " ";
                        }
                    }
                }
            }
        } else if (start instanceof Character && end instanceof Character) {
            if (start.compareTo(end) > 0) {
                System.out.println("Error : start from " + end + " end from " + start);
            } else {
                int i, j;
                int diff = (Character) end - (Character) start;
                T[] chararray = (T[]) new Comparable[diff];
                for (i = 0, j = 1; i < chararray.length; i++, j++) {
                    char c = (char) ((Character) start + j);
                    chararray[i] = (T) ((Character) c);
                }
                for (i = 0; i < chararray.length; i++) {
                    for (j = 0; j < size; j++) {
                        if (arr[j].compareTo(chararray[i]) == 0) {
                            str = str + j + " ";
                        }
                    }
                }
            }

        }
        return str;
    }

    public boolean LinearSearch(T start, T end) {
        if (start instanceof Integer && end instanceof Integer) {
            if (start.compareTo(end) > 0) {
                System.out.println("Error : start from " + end + " end from " + start);
                return false;
            } else {
                int i, j;
                int diff = (Integer) end - (Integer) start;
                T[] chararray = (T[]) new Comparable[diff];
                for (i = 0, j = 1; i < chararray.length; i++, j++) {
                    chararray[i] = (T) (Integer) ((Integer) start + j);
                }
                for (i = 0; i < chararray.length; i++) {
                    for (j = 0; j < size; j++) {
                        if (arr[j].compareTo(chararray[i]) == 0) {
                            return true;
                        }
                    }
                }
            }
        } else if (start instanceof Character && end instanceof Character) {
            if (start.compareTo(end) > 0) {
                System.out.println("Error : start from " + end + " end from " + start);
                return false;
            } else {
                int i, j;
                int diff = (Character) end - (Character) start;
                T[] chararray = (T[]) new Comparable[diff];
                for (i = 0, j = 1; i < chararray.length; i++, j++) {
                    char c = (char) ((Character) start + j);
                    chararray[i] = (T) ((Character) c);
                }
                for (i = 0; i < chararray.length; i++) {
                    for (j = 0; j < size; j++) {
                        if (arr[j].compareTo(chararray[i]) == 0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public int LinearSearchCount(T start, T end) {
        int count = 0;
        if (start instanceof Integer && end instanceof Integer) {
            if (start.compareTo(end) > 0) {
                System.out.println("Error : start from " + end + " end from " + start);
            } else {
                int i, j;
                int diff = (Integer) end - (Integer) start;
                T[] chararray = (T[]) new Comparable[diff];
                for (i = 0, j = 1; i < chararray.length; i++, j++) {
                    chararray[i] = (T) (Integer) ((Integer) start + j);
                }
                for (i = 0; i < chararray.length; i++) {
                    for (j = 0; j < size; j++) {
                        if (arr[j].compareTo(chararray[i]) == 0) {
                            count++;
                        }
                    }
                }
            }
        } else if (start instanceof Character && end instanceof Character) {
            if (start.compareTo(end) > 0) {
                System.out.println("Error : start from " + end + " end from " + start);
                return 0;
            } else {
                int i, j;
                int diff = (Character) end - (Character) start;
                T[] chararray = (T[]) new Comparable[diff];
                for (i = 0, j = 1; i < chararray.length; i++, j++) {
                    char c = (char) ((Character) start + j);
                    chararray[i] = (T) ((Character) c);
                }
                for (i = 0; i < chararray.length; i++) {
                    for (j = 0; j < size; j++) {
                        if (arr[j].compareTo(chararray[i]) == 0) {
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }

    public void bubbleSort() {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    swap(j, j + 1);
                }
            }
        }
    }

    public void swap(int first, int second) {
        T temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public boolean BinarySearch(T elem) {
        return BinarySearch(0, arr.length - 1, elem);
    }

    public boolean BinarySearch(T elem1, T elem2) {
        int num = (Integer) elem2 - (Integer) elem1;
        for (int i = 1; i <= num; i++) {
            T elem = (T) (Integer) ((Integer) elem1 + i);
            if (BinarySearch(0, arr.length - 1, elem)) {
                return true;
            }
        }
        return false;
    }

    public boolean BinarySearch(int first, int last, T elem) {
        int middle = (first + last) / 2;
        if (last < first) {
            return false;
        }
        if (elem.compareTo(arr[middle]) == 0) {
            return true;
        } else if (elem.compareTo(arr[middle]) < 0) {
            return BinarySearch(first, middle - 1, elem);
        } else {
            return BinarySearch(middle + 1, last, elem);
        }
    }

    public int BinarySearchCount(T elem) {
        int count = 0;
        int index = BinarySearchCount(0, arr.length - 1, elem);
        if (index != -1) {
            for (int i = index; i >= 0 && elem.compareTo(arr[i]) == 0; i--) {
                count++;
            }
            for (int i = index + 1; i < arr.length && elem.compareTo(arr[i]) == 0; i++) {
                count++;
            }
        }
        return count;
    }

    public int BinarySearchCount(T elem1, T elem2) {
        int count = 0;
        int num = (Integer) elem2 - (Integer) elem1;
        for (int i = 1; i <= num; i++) {
            T elem = (T) (Integer) ((Integer) elem1 + i);
            int index = BinarySearchCount(0, arr.length - 1, elem);
            if (index != -1) {
                for (int j = index; j >= 0 && elem.compareTo(arr[j]) == 0; j--) {
                    count++;
                }
                for (int j = index + 1; j < arr.length && elem.compareTo(arr[j]) == 0; j++) {
                    count++;
                }
            }
        }
        return count;
    }

    public int BinarySearchCount(int first, int last, T elem) {
        int middle = (first + last) / 2;
        if (last < first) {
            return -1;
        }
        if (elem.compareTo(arr[middle]) == 0) {
            return middle;
        } else if (elem.compareTo(arr[middle]) < 0) {
            return BinarySearchCount(first, middle - 1, elem);
        } else {
            return BinarySearchCount(middle + 1, last, elem);
        }
    }

    public String getIndexBinary(T elem) {
        String str = "";
        int index = getIndexBinary(0, arr.length - 1, elem);
        if (index != -1) {
            for (int i = index; i >= 0 && elem.compareTo(arr[i]) == 0; i--) {
                str = str + i + " ";
            }
            for (int i = index + 1; i < arr.length && elem.compareTo(arr[i]) == 0; i++) {
                str = str + i + " ";
            }
        }
        return str;
    }

    public String getIndexBinary(T elem1, T elem2) {
        String str = "";
        int num = (Integer) elem2 - (Integer) elem1;
        for (int i = 1; i <= num; i++) {
            T elem = (T) (Integer) ((Integer) elem1 + i);
            int index = getIndexBinary(0, arr.length - 1, elem);
            if (index != -1) {
                for (int j = index; j >= 0 && elem.compareTo(arr[j]) == 0; j--) {
                    str = str + j + " ";
                }
                for (int j = index + 1; j < arr.length && elem.compareTo(arr[j]) == 0; j++) {
                    str = str + j + " ";
                }
            }
        }
        return str;
    }

    public int getIndexBinary(int first, int last, T elem) {
        int middle = (first + last) / 2;
        if (last < first) {
            return -1;
        }
        if (elem.compareTo(arr[middle]) == 0) {
            return middle;
        } else if (elem.compareTo(arr[middle]) < 0) {
            return BinarySearchCount(first, middle - 1, elem);
        } else {
            return BinarySearchCount(middle + 1, last, elem);
        }
    }

}
