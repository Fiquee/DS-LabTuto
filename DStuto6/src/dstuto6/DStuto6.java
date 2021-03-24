package dstuto6;

import java.util.Random;
import java.util.Scanner;

public class DStuto6 {

    public static void main(String[] args) {

        //Question 1
//        Queue q = new Queue();
//        System.out.println("Queue Implementation using Linked List");
//        System.out.println("Enqueue three nodes");
//        q.enqueue('B');
//        q.enqueue('M');
//        q.enqueue('W');
//        q.showQueue();
//        System.out.println("Dequeue one node");
//        q.dequeue();
//        q.showQueue();
//        System.out.println("The front node of the queue is " + q.peek());
//        System.out.println("The queue size is " + q.size());
        //Question 2
//        ArrayQueue q = new ArrayQueue(10);
//        Random r = new Random();
//        System.out.println("Queue Implementation using Linked List");
//        System.out.println("Enqueue three nodes");
////        for(int i = 0 ; i < 10 ; i++){
////            q.enqueue(i);
////        }
//        q.enqueue('B');
//        q.enqueue('M');
//        q.enqueue('W');
//        q.showQueue();
//        System.out.println("Dequeue one node");
//        q.dequeue();
//        q.showQueue();
//        System.out.println("The front node of the queue is " + q.peek());
//        System.out.println("The queue size is " + q.getSize());
        //Question 3
//        int buy;
//        int customer = 0;
//        Random r = new Random();
//        Queue<String> q = new Queue();
//        System.out.println("Simulating a Queue to purchase MY phone");
//        int total = 30;
//        while(total > 0){
//            buy = r.nextInt(3)+1;
//            while(buy > total){  //if the total alr less or equal than 3
//                buy = r.nextInt(3)+1;
//            }
//            q.enqueue(buy + " set(s) -->");
//            total = total - buy;
//            customer++;
//        }
//        for(int i = 1 ; !q.isEmpty() ; i++){
//            System.out.println("Customer " + i + " : " + q.dequeue());
//        }
//        System.out.println("Number of Customer : " + customer);
        //Question 4
//        String[] str = {"kayak","Welcome","Was it a car or a cat I saw?","civic","Race car","Nurses run","Madam"};
//        for(int i = 0 ; i < str.length ; i++){
//            if(isPalindrome(str[i])){
//                System.out.println(str[i] + " is a palindrome");
//            }
//            else{
//                System.out.println(str[i] + " is not a palindrome");
//            }
//        }
        //Question 5
//        String[] str = {"kayak", "Welcome", "Was it a car or a cat I saw?", "civic", "Race car", "Nurses run", "Madam", "?civic#", "redrawer", "put           it up"};
//        for (int i = 0; i < str.length; i++) {
//            if (isPalindromeRealOne(str[i])) {
//                System.out.println(str[i] + " is a palindrome");
//            } else {
//                System.out.println(str[i] + " is not a palindrome");
//            }
//        }

//final ds 2021
//char top = 'a';
//        char bottom = 'a';
//        Queue a = new Queue();x
//        Queue b = new Queue();
//        int k;
//        for (int j = 0; j < str.length; j++) {
//            ArrayStack stack = new ArrayStack(20);
//            String word = str[j];
//            for (k = 0; k < word.length(); k++) {
//                stack.push(word.charAt(k));
//            }
//            stack.showStack();
//            while (!stack.isEmpty()) {
//                if (!stack.isEmpty()) {
//                    top = (Character) stack.pop();
//                    System.out.println("this is top" + top);
//                    a.enqueue(top);
//                }
//                if(!stack.isEmpty()){
//                    bottom = (Character) stack.poplast();
//                    System.out.println("this is bottom" + bottom);
//                    b.enqueue(bottom);
//                }
//            }
//            System.out.println(str[j]);
//            a.showQueue();
//            b.showQueue();
//        }
        //Question 6
//        Queue q = new Queue();
//        Queue tempq = new Queue();
//        Queue revq = new Queue();
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a sentence : ");
//        String str = sc.nextLine();
//        String[] arr = str.split(" ");
//        for (int i = 0; i < arr.length; i++) {
//            q.enqueue(arr[i]);
//        }
//        System.out.print("The original queue : ");
//        q.showQueue();
//        System.out.print("Reverse all the elements in the queue : ");
//        while (!q.isEmpty()) {
//            if (q.head.next == null) {
//                revq.enqueue(q.dequeue());
//                while (!tempq.isEmpty()) {
//                    q.enqueue(tempq.dequeue());
//                }
//            } else {
//                tempq.enqueue(q.dequeue());
//            }
//        }
//        revq.showQueue();
//        String reverse = "";
//        while(!revq.isEmpty()){
//            reverse += revq.dequeue() + " ";
//        }
//        System.out.println("The reverse sentence : " + reverse);
    }

    public static boolean isPalindromeRealOne(String str) {
        Queue q = new Queue();
        int i;
        Stack stack = new Stack<>();
        str = str.toLowerCase();
        str = str.replace(" ", "");
        String newstring = "";
        String oddstring = "";
        for (i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                newstring = newstring + str.charAt(i);
            }
        }
        if (newstring.length() % 2 != 0) {
            int middle = newstring.length() / 2;
            for (i = 0; i < newstring.length(); i++) {
                if (i == middle) {
                    continue;
                }
                oddstring = oddstring + newstring.charAt(i);
            }
            while (!q.isEmpty()) {
                if (q.dequeue() != stack.pop()) {
                    return false;
                }
            }

            return true;
        } else {
            for (i = 0; i < newstring.length(); i++) {
                if (Character.isLetter(str.charAt(i))) {
                    q.enqueue(str.charAt(i));
                    stack.push(str.charAt(i));
                }
            }
            while (!q.isEmpty()) {
                if (q.dequeue() != stack.pop()) {
                    return false;
                }
            }
            return true;
        }
    }

    public static boolean isPalindrome(String str) {
        Queue q = new Queue();
        Stack stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            q.enqueue(str.charAt(i));
            stack.push(str.charAt(i));
        }
        while (!q.isEmpty()) {
            if (q.dequeue() != stack.pop()) {
                return false;
            }
        }
        return true;
    }

}
