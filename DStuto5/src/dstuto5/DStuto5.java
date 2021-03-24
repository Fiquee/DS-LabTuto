package dstuto5;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class DStuto5 {

    public static void main(String[] args) {
        
        //Question 1
//        System.out.println("Stack implementation using Linked List");
//        Stack<Character> stack = new Stack();
//        System.out.println("Insert three nodes into the stack");
//        stack.push('A');
//        stack.push('N');
//        stack.push('D');
//        stack.showStack();
//        System.out.println("Pop one node from the stack");
//        stack.pop();
//        stack.showStack();
//        System.out.println("The element on the top of the stack is " + stack.peek());
//        stack.showStack();
//        System.out.println("The number of elements in the stack is " + stack.size());
        //Question 2
//        ArrayStack<Character> arr = new ArrayStack(10);
//        System.out.println("Stack implementation using Array");
//        System.out.println("Insert three nodes into the stack");
//        arr.push('A');
//        arr.push('N');
//        arr.push('D');
//        arr.showStack();
//        System.out.println("Pop one node from the stack");
//        arr.pop();
//        arr.showStack();
//        System.out.println("The element on the top of the stack is " + arr.peek());
//        arr.showStack();
//        System.out.println("The number of elements in the stack is " + arr.getSize());
//        
////        for(int i = 1 ; i < 10 ; i++){
////            arr.push('c');
////            arr.showStack();
////        }
        //Question 3
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a sentence : ");
//        String sentence = sc.nextLine();
//        String[] word = sentence.split(" ");
//        System.out.println("Original Sentence : " + original(word));
//        System.out.println("The sentence in reverse order : " + revSentence(word));
//        System.out.println("The word in reverse order : " + revWord(word));
        //Question 4
//        Scanner sc = new Scanner (System.in);
//        LinkedList<Integer> list = new LinkedList<>();
//        list.add(1);
//        list.add(5);
//        list.add(8);
//        list.add(14);
//        
//        for(int i = 0 ; i < list.size() ; i++){
//            System.out.println("Fib(" + list.get(i) + "): " + Fibonacci(list.get(i)));
//        }
        //Question 5
//        LinkedList<String> list = new LinkedList();
//        list.add("(())");
//        list.add(")()(");
//        list.add("((())())()");
//        list.add("(())()))");
//        list.add("())");
//        list.add("((((");
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i) + " " + checkbalanced(list.get(i)));
//        }
        //Question 6
//        int[] arr = new int[10];
//        Random random = new Random();
//        System.out.print("The random numbers are : ");
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = random.nextInt(100) + 1;
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//        Stack<Integer> stack = new Stack<>();
//        boolean isOdd = true;
//        int currentIndex = 0;
//        boolean flag = true;
//        while (flag) {
//            int currentNumber = arr[currentIndex];
//            if (currentNumber != -1) {
//                if (isOdd && currentNumber % 2 != 0) {
//                    stack.push(currentNumber);
//                    arr[currentIndex] = -1; // Change value to -1 as done
//                    isOdd = false;
//                } else if (!isOdd && currentNumber % 2 == 0) {
//                    stack.push(currentNumber);
//                    arr[currentIndex] = -1;
//                    isOdd = true;
//                }
//            }
//            if (currentIndex == arr.length - 1) {
//                currentIndex = 0;
//                flag = canLoop(arr,(int)stack.peek());
//            } else {
//                currentIndex++;
//            }
//        }
//        System.out.print("The numbers in the stack : ");
//        stack.showStack();
//        System.out.println("The numbers remain in the array : " + stack.size());
    }
        
    public static boolean canLoop(int[] arr,int peek){
        int count = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] != -1 && arr[i]%2 != peek%2){
                count++;
            }
        }
        if(count == 0){
            return false;
        }
        else{
            return true;
        }
    }
    public static String checkbalanced(String a) {
        if (a.charAt(0) == ')') {
            return "is not balanced";
        } else {
            Stack s = new Stack();
            s.push(a.charAt(0));
            int i = 1;
            while (i < a.length()) {
                if (a.charAt(i) == '(') {
                    s.push(a.charAt(i));
                } else if (a.charAt(i) == ')') {
                    if (s.isEmpty()) {
                        return "is not balanced";
                    }
                    s.pop();
                }
                i++;
            }
            if (!s.isEmpty()) {
                return "is not balanced";
            } else {
                return "is balanced";
            }
        }
    }

    public static int Fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            Stack<Integer> stack = new Stack();
            int sum = 0;
            int index = 2;
            stack.push(1);
            stack.push(1);
            while (index != n) {
                int temp = stack.pop();
                sum = temp + stack.pop();
                stack.push(temp);
                stack.push(sum);
                index++;
            }
            return sum;
        }
    }

    public static String revSentence(String[] arr) {
        Stack a = new Stack();
        String str = "";
        for (int i = 0; i < arr.length; i++) {
            StringBuffer buff = new StringBuffer(arr[i]);
            buff = buff.reverse();
            a.push(buff);
        }
        while (!a.isEmpty()) {
            str += a.pop() + " ";
        }
        return str;
    }

    public static String revWord(String[] arr) {
        Stack<String> b = new Stack();
        String str = "";
        for (int i = 0; i < arr.length; i++) {
            b.push(arr[i]);
        }
        while (!b.isEmpty()) {
            str += b.pop() + " ";
        }
        return str;
    }

    public static String original(String[] arr) {
        String str = "";
        for (int i = 0; i < arr.length; i++) {
            str += arr[i] + " ";
        }
        return str;
    }

}
