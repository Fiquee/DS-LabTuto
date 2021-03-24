package dslab3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class DSLab3 {

    public static void main(String[] args) throws ParseException {

        //Question 1
        
//        int n=4;
//        System.out.println("Mesh Topology");
//        System.out.println("There are " + n + " switch(es) in the campus.");
//        System.out.println("The total number of connections required is " + MeshTop(n));
//        
//        int m=7;
//        System.out.println("Mesh Topology");
//        System.out.println("There are " + m + " switch(es) in the campus.");
//        System.out.println("The total number of connections required is " + MeshTop(m));

        //Question 2
        
//        String str = "Lab3.txt";
//        String str2 = "Lab3reverse.txt";
//        try {
//            Scanner sc = new Scanner(new FileInputStream(str));
//            PrintWriter out = new PrintWriter(new FileOutputStream(str2));
////            while(sc.hasNextLine()){
////               String a = sc.nextLine();
////               StringBuffer b = new StringBuffer(a);
////               out.println(b.reverse());
////               out.flush();
////            }
//            
//            reverse(sc.nextLine(), sc, out);
//            sc.close();
//            out.close();
//        } catch (IOException e) {
//
//        }

        //Question 3
        
//        Scanner input = new Scanner(System.in);
//        Random rndm = new Random();
//        System.out.print("Enter number of elements: ");
//        int user = input.nextInt();
//        char[] dNum = new char[user];
//        String word = "";
//        for (int i = 0; i < user; i++) {
//            int rndmNum = rndm.nextInt(10);
//            String eNum = Integer.toString(rndmNum);
//            char eNumC = eNum.charAt(0);
//            dNum[i] = eNumC;
//            word = word + eNumC;
//        }
//        System.out.println("The elements are : " + word);
//
//        findPermutations(dNum, 0, user);



        //Question 4
        
        /*SimpleDateFormat to make a format for the date*/
        /*SimpleDateFormat.format(Date date) is to format that date
          to be as what we formatted (and become a String)*/
        /*If to String --> date we use SimpleDateFormat.parse(String string)*/
        
        
//        Scanner sc = new Scanner(System.in);
//        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
//        System.out.print("Today Date (dd/mm/yyyy) : ");
//        String date = sc.nextLine();
//        Date today = df.parse(date);
////        System.out.println(df.format(today));
//        System.out.println("Today is on " + getDay(today.getDay()));
//        System.out.print("Search Date (dd/mm/yyyy) : ");
//        String search = sc.nextLine();
//        Date nd = df.parse(search);
//        int newdate = nd.getDay();
//        System.out.print("Search Date is on ");
//        SearchDate(today.getDay(),newdate);


        //Question 5
        
//        Scanner sc = new Scanner(System.in);
//        int[] integerArray = new int[5];
//        int i = 0;
//        while (true) {
//            try {
//                System.out.print("Enter an Integer: ");
//                integerArray[i] = sc.nextInt();
//                i++;
//            } catch (ArrayIndexOutOfBoundsException e) {
//                System.out.println("The array of integers is ");
//                for (int j = 0; j < integerArray.length; j++) {
//                    System.out.print(integerArray[j] + " ");
//                }
//                break;
//            } catch (InputMismatchException m) {
//                System.out.println("Invalid input type");
//                sc.nextLine();
//            }
//        }
    }

    public static void SearchDate(int curr, int newdate) {
        if (curr == newdate) {
            System.out.println(getDay(curr));
        } else {
            if(newdate > curr){
                SearchDate(curr+1,newdate);
            }
            else if(newdate < curr){
                SearchDate(curr-1,newdate);
            }
        }
    }

    public static String getDay(int day) {
        switch (day) {
            case 0:
                return "Sunday";
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            default:
                return "";
        }
    }

    public static int[] generate(int[] arr) {
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(10);
        }
        return arr;
    }

    public static int MeshTop(int a) {

        if (a == 1 || a == 0) {
            return 0;
        } else {
            return (a - 1) + MeshTop(a - 1);
        }
    }

    public static void reverse(String s, Scanner sc, PrintWriter out) {
        StringBuffer str = new StringBuffer(s);
        if (sc.hasNextLine()) {
            out.println(str.reverse());
            reverse(sc.nextLine(), sc, out);
//            out.flush();
        } else {
            out.println(str.reverse());
//            out.flush();
        }

    }

    static boolean shouldSwap(char[] str, int start, int curr) {
        for (int i = start; i < curr; i++) {
            if (str[i] == str[curr]) {
                return false;
            }
        }
        return true;
    }

    static void findPermutations(char[] str, int index, int n) {
        if (index >= n) {
            System.out.println(str);
            return;
        }
        for (int i = index; i < n; i++) {

            // Proceed further for str[i] only if it
            // doesn't match with any of the characters
            // after str[index]
            boolean check = shouldSwap(str, index, i);
            if (check) {
                swap(str, index, i);
                findPermutations(str, index + 1, n);
                swap(str, index, i);
            }
        }
    }

    static void swap(char[] str, int i, int j) {
        char c = str[i];
        str[i] = str[j];
        str[j] = c;
    }
}
