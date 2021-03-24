/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dslab8;

import java.util.LinkedList;

/**
 *
 * @author Forge-15 i7
 */
public class SortPerformance<T extends Comparable<T>> {

    LinkedList<String> sortType = new LinkedList();
    LinkedList<Integer> timetaken = new LinkedList();

    int time;
    long before, after;

    public SortPerformance() {
        sortType.add("Selection Sort");
        sortType.add("Bubble Sort");
        sortType.add("Insertion Sort");
        sortType.add("Merge Sort");
        sortType.add("Quick Sort");

        for (int i = 0; i < sortType.size(); i++) {
            timetaken.add(0);
        }
    }

    public void perform(T[] arr) {
        for (int i = 0; i < sortType.size(); i++) {
            time = timetaken.get(i);
            before = System.currentTimeMillis();
            Sort a = new Sort(arr);
            a.sort(i);
            after = System.currentTimeMillis();
            timetaken.set(i, time+(int)(after - before));
        }
    }

    public void showPerformance() {
        int fastest = timetaken.get(0);
        int fastindex = 0;
        for (int i = 0; i < sortType.size(); i++) {
            System.out.println(sortType.get(i) + " : " + timetaken.get(i));
        }

        for (int i = 0; i < timetaken.size(); i++) {
            if (timetaken.get(i) < fastest) {
                fastindex = i;
            }
        }
        switch (fastindex) {
            case 0:
                System.out.println("The fast sorting algo is Selection Sort");
                break;
            case 1:
                System.out.println("The fast sorting algo is Bubble Sort");
                break;
            case 2:
                System.out.println("The fast sorting algo is Insertion Sort");
                break;
            case 3:
                System.out.println("The fast sorting algo is Merge Sort");
                break;
            case 4:
                System.out.println("The fast sorting algo is Quick Sort");
                break;
        }
    }

}
