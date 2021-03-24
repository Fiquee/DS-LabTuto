package dslab7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class DSLab7 {

    public static void main(String[] args) {

        //Question 1
//        BST tree = new BST();
//        Random r = new Random();
//        String str = "";
//        for (int i = 0; i < 10; i++) {
//            int rand = r.nextInt(21);
//            tree.add(rand);
//            str = str + rand + " ";
//        }
//        
//        System.out.println("The random numbers are " + str);
//        
//        System.out.println("The number of elements in the tree : " + tree.size());
//        
//        tree.setOrder(2);
//        System.out.print("The tree elements - PREORDER : ");
//        tree.showTree();
//        System.out.println();
//        
//        tree.setOrder(1);
//        System.out.print("The tree elements - INORDER : ");
//        tree.showTree();
//        System.out.println();
//        
//        tree.setOrder(3);
//        System.out.print("The tree elements - POSTORDER : ");
//        tree.showTree();
//        System.out.println();
//        
//        System.out.println("The minimum number is " + tree.getMin());
//        System.out.println("The maximum number is : " + tree.getMax());
//        System.out.println("The total is : " + tree.getTotal());
//        System.out.print("Enter a number to search : ");
//        Scanner sc = new Scanner(System.in);
//        int search = sc.nextInt();
//        System.out.println("The number of occurrence of " + search + " is " + tree.getOccurrence(search));
        
        //Question 2
//        BST tree = new BST();
//        Queue q = new Queue();
//        try{
//            System.out.println("Word Frequency Generator Program");
//            Scanner sc = new Scanner(new FileInputStream("lab7Q2.txt"));
//            while(sc.hasNextLine()){
//                String str = sc.nextLine();
//                String[] words = str.split(" ");
//                for(int i = 0 ; i < words.length ; i++){
//                    if(!tree.contains(words[i])){
//                        q.enqueue(words[i]);
//                    }
//                    tree.add(words[i]);
//                }
//            }
//            while(!q.isEmpty()){
//                String occurr = "";
//                Integer occ = tree.getOccurrence(q.peek());
//                if(occ > 0 && occ < 10){
//                   occurr = "000" + occ.toString();
//                }
//                else if(occ >= 10 && occ < 100){
//                    occurr = "00" + occ.toString();
//                }
//                else if(occ >= 100 && occ < 1000){
//                    occurr = "0" + occ.toString();
//                }
//                else{
//                    occurr = occ.toString();
//                }
//                System.out.println(occurr + " " + q.dequeue());
//            }
//        }catch(FileNotFoundException e){
//            
//        }
        
        //Question 3
//        System.out.print("Enter Infix Expression : " );
//        Scanner sc = new Scanner(System.in);
//        String expression = sc.nextLine();
//        
//        BSTExpression bste = new BSTExpression(expression);
        
    }

}
