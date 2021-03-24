
package dslab9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class DSLab9 {
    
    public static void main(String[] args) {
        
        //Question 1
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter N : ");
//        int N = sc.nextInt();
//        SearchTest a = new SearchTest(1,N);
//        System.out.println("The matrix are : ");
//        a.showMatrix();
//        System.out.println();
//        System.out.println("Linear Search");
//        System.out.print("Enter a number to search : ");
//        int numb = sc.nextInt();
//        if(a.LinearSearch(numb)){
//            System.out.println(numb + " is found");
//            System.out.println("The number of " + numb + " in the matrix : " + a.LinearSearchCount(numb));
//            System.out.println("The location of " + numb + " : " + a.getMatrixLocation(numb));
//        }
//        else{
//            System.out.println(numb + " is not found");
//        }
        
        //Question 2
//        LinkedList list = new LinkedList();
//        Scanner sc = new Scanner(System.in);
//        Random r = new Random();
//        for(int i = 0 ; i < 10 ; i++){
//            list.add(r.nextInt(21));
//        }
//        System.out.print("The random integers are : ");
//        list.showList();
//        System.out.println("Linear search");
//        System.out.print("Enter a number to search : ");
//        int numb = sc.nextInt();
//        if(list.LinearSearch(numb)){
//            System.out.println(numb + " is found");
//            System.out.println("The number of " + numb + " in the data set : " + list.LinearSearchCount(numb));
//        }
//        else{
//            System.out.println(numb + " is not found");
//        }
//        System.out.print("Enter two numbers to search (begin end) : ");
//        int begin = sc.nextInt();
//        int end = sc.nextInt();
//        if(list.LinearSearch(begin,end)){
//            System.out.println("The integer can be found between " + begin + " and " + end);
//            System.out.println("The number of the elements in between " + begin + " and " + end + " in the data set : " + list.LinearSearchCount(begin,end));
//        }
//        else{
//            System.out.println("No integer can be found between " + begin  + " and " + end);
//        }
        
        //Question 3
//        ArrayHashTable a = new ArrayHashTable(20);
//        Scanner sc = new Scanner(System.in);
//        String[] code = {"100-101","200-101","200-120","210-260"};
//        String[] name = {"ICND 1","ICND 2","CCNA Routing and Switching","CCNA Security"};
//        for(int i = 0 ; i < code.length ; i++){
//            a.put(code[i], name[i]);
//        }
//        System.out.println("The number of course : " + a.getSize());
//        a.showHashTable();
//        System.out.println("Adding a new course");
//        a.put("300-101","ROUTE");
//        System.out.println("The number of course : " + a.getSize());
//        a.showHashTable();
//        System.out.println("Modifying 210-260");
//        a.put("210-260", "CCNA RS Security");
//        System.out.println("The number of course : " + a.getSize());
//        a.showHashTable();
//        System.out.println("Remove the course 200-101");
//        a.remove("200-101");
//        System.out.println("The number of course : " + a.getSize());
//        a.showHashTable();
//        System.out.print("Enter a course code to search : ");
//        String str = sc.nextLine();
//        System.out.println("Course " + str + " : " + a.get(str));
        
        //Question 4
//        LinearProbingHash a = new LinearProbingHash(20);
//        Scanner s = new Scanner(System.in);
//        try{
//            Scanner sc = new Scanner(new FileInputStream("lab9Q4.txt"));
//            System.out.println("The data set from the File");
//            while(sc.hasNextLine()){
//                String str = sc.nextLine();
//                String[] arr = str.split(" : ");
//                a.put(arr[0],arr[1]);
//                System.out.println(arr[0] + " : " + arr[1]);
//            }
//            System.out.println("The Hash Table size is " + a.getSize());
//            System.out.print("Enter a PID to search : ");
//            String PID = s.nextLine();
//            if(a.containsKey(PID)){
//                System.out.println("Product ID : " + PID + " " + a.get(PID));
//                System.out.println("Location : " + a.getLocation(PID));
//            }
//            else{
//                System.out.println("Product ID " + PID + " cannot be found");
//            }
//        }catch(FileNotFoundException e){
//            
//        }
        
        //Question 5
//        HashChain a = new HashChain(20);
//        Scanner s = new Scanner(System.in);
//        try{
//            Scanner sc = new Scanner(new FileInputStream("lab9Q4.txt"));
//            System.out.println("The data set from the File");
//            while(sc.hasNextLine()){
//                String str = sc.nextLine();
//                String[] arr = str.split(" : ");
//                a.put(arr[0],arr[1]);
//                System.out.println(arr[0] + " : " + arr[1]);
//            }
//            System.out.println("The Hash Table size is " + a.getSize());
//            System.out.print("Enter a PID to search : ");
//            String PID = s.nextLine();
//            if(a.containsKey(PID)){
//                System.out.println("Product ID : " + PID + " " + a.get(PID));
//                System.out.println("The elements in the same location are : ");
//                a.getList(PID);
//            }
//            else{
//                System.out.println("Product ID " + PID + " cannot be found");
//            }
//            
//        }catch(FileNotFoundException e){
//            
//        }
    } 
}
