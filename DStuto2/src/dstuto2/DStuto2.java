
package dstuto2;

import java.util.Random;


public class DStuto2 {
    
    public static void main(String[] args) {
        
        //Question 1
        Integer a = 5,b = 6;
        double c = 2.0,d = 5.0;
        String e = "afiq",f = "irfan";
        char g = 'c',h = 'a';
        Util util = new Util();
        System.out.println("The parameters are : " + a + " and " + b);
        util.compare(a,b);
        System.out.println("The parameters are : " + c + " and " + d);
        util.compare(c,d);
        System.out.println("The Strings are : " + e + " and " + f);
        util.compare(e,f);
        System.out.println("The Strings are : " + e + " and " + e);
        util.compare(e,e);
        System.out.println("The parameters are : " + g + " and " + h);
        util.compare(g,h);
        
//        //Question 2
//        Integer[] num = {1,2,3,4,5};
//        Character[] letter = {'P','I','V','R','D'};
//        SpecialEncoding<Integer> a = new SpecialEncoding<>(num);
//        SpecialEncoding<Character> b = new SpecialEncoding<>(letter);
//        System.out.println(a.toString());
//        System.out.println(b.toString());
        
        //Question 3
//        Max p = new Max();
//        Random r = new Random();
//        int a = r.nextInt(101);
//        int b = r.nextInt(101);
//        int c = r.nextInt(101);
//        System.out.println("The maximum value of " + a + " " + b + " " 
//                            + c + " is " + p.getMax(a, b, c));
//        Double e = 12.45;
//        Double f = 41.28;
//        Double g = 19.82;
//        
//        System.out.println("The maximum value of " + e + " " + f + " " 
//                            + g + " is " + Max.getMax(e, f, g));
        
        //Question 4
//        int n = 5;
//        Integer[] arr = new Integer[n];
//        ArrayDice<Integer> a = new ArrayDice<>(arr,n);
//        System.out.println(a.toString());
//        LinkedListDice<Integer> b = new LinkedListDice<>(n);
//        System.out.println(b.toString());
    }
}
