package dstuto1;

import java.util.Scanner;

public class DStuto1 {

    public static void main(String[] args) {

        //Question 1
//        Scanner s = new Scanner(System.in);
//        System.out.println("Enter day , month and year : ");
//        int d = s.nextInt();
//        int m = s.nextInt();
//        int y = s.nextInt();
//        Tarikh a = new Tarikh(d,m,y);
//        System.out.println(a.toString());
        //Question 2
//        Sentence b = new Sentence("how are you?");
//        System.out.println(b.toString());
        //Question 3
//        double mpbs=5;
//        double gb=50;
//        MPlan a = new MPlan("Mplan",mpbs,gb);
//        DPlan b = new DPlan("Dplan",mpbs,gb);
//        System.out.println(mpbs + "Mpbs Subscription and " + gb + "GB");
//        a.Display();
//        b.Display();
//        if(a.getCost() < b.getCost()){
//            System.out.println("MPlan is cheaper than DPlan");
//        }
//        else{
//            System.out.println("DPlan is cheaper than MPlan");
//        }
        //Question 4
        SmartPhone[] a = new SmartPhone[4];
        
        a[0] = new SmartPhone("iphone", 2400);
        a[1] = new SmartPhone("Nokia", 1400);
        a[2] = new SmartPhone("Samsung", 2200);
        a[3] = new SmartPhone("LG", 1800);
        System.out.println("List of Smartphones : ");

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i].toString() + " ");
        }
        System.out.println();
        for (int j = 0; j < a.length; j++) {
            for (int i = 0; i < a.length - 1; i++) {
                SmartPhone temp = new SmartPhone("", 0);
                if (a[i].compareTo(a[i + 1]) > 0) {
                    temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                }
            }
        }

        System.out.println("List of Smartphones in ascending order of the price : ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i].toString() + " ");
        }
        System.out.println();
        for (int j = 0; j < a.length; j++) {
            for (int i = 0; i < a.length - 1; i++) {
                SmartPhone temp = new SmartPhone("", 0);
                if (a[i].compareTo(a[i + 1]) < 0) {
                    temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                }
            }
        }
        System.out.println("List of Smartphones in descending order of the price : ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i].toString() + " ");
        }
        System.out.println();
    }
}
