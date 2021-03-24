package dstuto9;

import java.util.Scanner;

public class DStuto9 {

    public static void main(String[] args) {

        //Question 1
//        Scanner sc = new Scanner(System.in);
//        SearchTest a = new SearchTest('A', 10);
//        System.out.print("The Character data set are : ");
//        a.showArray();
//        System.out.println("Linear Search");
//        System.out.print("Enter a letter to search : ");
//        String letter = sc.next();
//        char c = letter.charAt(0);
//        if (a.LinearSearch(c)) {
//            System.out.println(c + " is found");
//            System.out.println("The number of " + c + " in the data set is " + a.LinearSearchCount(c));
//            System.out.println("The location of the " + c + " are : " + a.getIndex(c));
//        } else {
//            System.out.println(c + " is not found");
//        }
//        System.out.print("Enter two letters to search (begin end) : ");
//        String first = sc.next();
//        String second = sc.next();
//        char firstchar = first.charAt(0);
//        char secondchar = second.charAt(0);
//        if (a.LinearSearch(firstchar, secondchar)) {
//            System.out.println("The character can be found in between " + firstchar + " and " + secondchar);
//            System.out.println("The number of the element in between " + firstchar + " and " + secondchar + " in the data is " + a.LinearSearchCount(firstchar, secondchar));
//            System.out.println("The location of the elements in between " + firstchar + " and " + secondchar + " are : " + a.getIndex(firstchar,secondchar));
//        } else {
//            System.out.println("No character can be found in between " + firstchar + " and " + secondchar);
//        }
        
        //Question 2
        Scanner sc = new Scanner(System.in);
        SearchTest a = new SearchTest(1,10);
        System.out.print("The Integer data set are : " );
        a.bubbleSort();
        a.showArray();
        System.out.println("Binary search");
        System.out.print("Enter a number to search : ");
        int num = sc.nextInt();
        if(a.BinarySearch(num)){
            System.out.println(num + " is found");
            System.out.println("The number of " + num + " in the data set is " + a.BinarySearchCount(num));
            System.out.println("The location of " + num + " are : " + a.getIndexBinary(num));
        }
        else{
            System.out.println(num + " is not found");
        }
        System.out.print("Enter two numbers to search (begin end) : ");
        int first = sc.nextInt();
        int second = sc.nextInt();
        if(a.BinarySearch(first, second)){
            System.out.println("The integer can be found in between " + first + " and " + second);
            System.out.println("The number of the elements in between " + first + " and " + second + " in the data is " + a.BinarySearchCount(first, second));
            System.out.println("The location of the elements in between " + first + " and " + second + " are : " + a.getIndexBinary(first, second));
        }
        else{
            System.out.println("No integer can be found in between " + first + " and " + second );
        }
        
        //Question 3
//        Scanner sc = new Scanner(System.in);
//        HashTable a = new HashTable();
//        String[] key = {"100-101","200-101","200-120","210-260"};
//        String[] value = {"ICND 1","ICND 2","CCNA Rounting and Switching","CCNA Security"};
//        for(int i = 0 ; i < key.length ; i++){
//            a.put(key[i],value[i]);
//        }
//        System.out.println("Hash Table");
//        System.out.println("The number of elements in the Hash Table : " + a.size());
//        a.showHashTable();
//        System.out.print("Enter a code to search : ");
//        String code = sc.nextLine();
//        if(a.containsKey(code)){
//            System.out.println("Course " + code + " : " + a.get(code));
//        }
//        else{
//            System.out.println("The course " + code + " cannot be found");
//        }
        
    }

}
