

package dslab8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class DSLab8 {
    
    public static final int ASCENDING = 1;
    public static final int DESCENDING = 2;
    
    public static void main(String[] args) {
        
        //Question 1
//        Random r = new Random();
//        int N;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter N Special Random Number within 0-100: ");
//        N = sc.nextInt();
//        Integer[] arr = new Integer[N];
//        System.out.print("The special Number are : ");
//        for(int i = 0 ; i < N ; i++){
//            arr[i] = r.nextInt(101);
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//        Sort a = new Sort(arr);
//        a.specialmergeSort();
//        System.out.print("After Merge Sort : ");
//        a.showArray();
        
        //Question 2
//        LinkedList list = new LinkedList();
//        
//        try{
//            System.out.println("Reading data from product text file");
//            Scanner sc = new Scanner(new FileInputStream("lab8Q2.txt"));
//            while(sc.hasNextLine()){
//                String line = sc.nextLine();
//                line = line.replaceAll(", ", " : ");
//                System.out.println(line);
//                list.add(line);
//            }
//            String[] lines = new String[list.size()];
//            String[] product =(String[]) list.toArray(lines);
//            System.out.println("After Quick Sort (Price, PID) : ");
//            Sort a = new Sort(product);
//            a.quickSort();
//            a.showArraybyLine();
//            
//        }catch(FileNotFoundException e){
//            
//        }
        
        //Question 3
//        Integer[] arr = new Integer[100];
//        SortPerformance sort = new SortPerformance();
//        Random r = new Random();
//        
//        System.out.println("Performance Comparison of Sorting Algorithms");
//        System.out.println("Running on 20000 sets of 100 random numbers");
//        
//        for(int i = 0 ; i < 20000 ; i++){
//            for(int j = 0 ; j < 100 ; j++){
//                arr[j] = r.nextInt(101);
//            }
//            sort.perform(arr);
//        }
//        sort.showPerformance();
        
        //Question 4 (heap sort)
        
    }
    
    
}
