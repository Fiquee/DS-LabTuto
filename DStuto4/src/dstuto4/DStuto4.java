

package dstuto4;

import java.util.Scanner;

public class DStuto4 {
    
    public static void main(String[] args) {
        
        //Question 1
        LinkedList a = new LinkedList();
        
//        a.add(23.1);
//        a.add(36.5);
//        a.add(12.8);
//        a.add(42.6);
//        a.add(32.8);
//        a.showlist();
//        System.out.println();
        
        //Question 2
//        a.more();
        
        
        //Question 3
//        LinkedList b = new LinkedList();
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the total amount : ");
//        int total = sc.nextInt();
//        int num;
//        a.add(100);
//        a.add(50);
//        a.add(20);
//        a.add(10);
//        a.add(5);
//        a.add(1);
//        
//        System.out.println("Total amount: " + total);
//        for(int i = 0 ; i < a.size() ; i++){
//            num = total/(int)a.get(i);
//            b.add(num);
//            total = total % (int)a.get(i);
//            System.out.println("MYR " + a.get(i) + " : " + b.get(i));
//        }
        
        //Question 4
//        a.add(23);
//        a.add(15);
//        a.add(17);
//        a.add(28);
//        a.add(12);
//        a.add(40);
//        a.showlist();
//        System.out.println("Linked List has " + a.size() + " node(s)");
//        System.out.println("Total is " + a.sum());
//        System.out.println("Total even number is " + a.even());
        
        
        //Question 5
        
        a.random(15,0,10);
        System.out.println("Linked List has " + a.size() + " node(s)");
        a.showlist();
        System.out.println();
        System.out.println("Delete the number 4 from the list.");
        a.removeAll(4); // or a.removeVal(4)
        System.out.println();
        System.out.println("Linked List has " + a.size() + " node(s)");
        a.showlist();
        
        
        //Question 6
        
//        int[] arr = {78,45,34,23,17,10,8};
//        for(int i = 0 ; i < arr.length ; i++){
//            a.addfirst(arr[i]);
//        }
//        a.showlist();
//        a.getMiddle();
                
        
    }
}
