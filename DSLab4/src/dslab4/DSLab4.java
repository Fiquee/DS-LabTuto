package dslab4;

import java.nio.file.Paths;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import javafx.embed.swing.JFXPanel;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.Media;

public class DSLab4 {

    public static void main(String[] args) {

        //Question 1
//        LinkedList a = new LinkedList();
//        Random r = new Random();
//        int[] arr = new int[10];
//        String str = "The random numbers are : ";
//        for(int i = 0 ; i < arr.length ; i++){
//            arr[i] = r.nextInt(101);
//            str = str + arr[i] + " ";
//        }
//        System.out.println(str);
//        System.out.println();
//        System.out.println("Insert the random numbers at the back of the linked list");
//        for(int i = 0 ; i < arr.length ; i++){
//            a.add(arr[i]);
//        }
//        a.showList();
//        a.clear();
//        System.out.println();
//        System.out.println("Insert the random numbers in front of the linked list");
//        for(int i = 0 ; i < arr.length ; i++){
//            a.addFirst(arr[i]);
//        }
//        a.showList();
//        a.clear();
//        System.out.println();
//        System.out.println("Insert the random numbers in a sorted linked list");
//        for(int i = 0 ; i < arr.length ; i++){
//            a.add(arr[i]);
//        }
//        a.bubbleSort();  //Or a.sort();
//        a.showList();

        //Question 2
//        LinkedList a = new LinkedList();
//        LinkedList b = new LinkedList();
//        LinkedList c = new LinkedList();
//        LinkedList d = new LinkedList();
//        LinkedList e = new LinkedList();
//        
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a word : ");
//        String word = sc.next();
//        for(int i = 0 ; i < word.length() ; i++){
//            a.add(word.charAt(i));
//            c.add(word.charAt(i));
//        }
//        System.out.print("The originial list : ");
//        a.showList();
//        System.out.println("Split the list into two");
//        b = a.splitList();
//        System.out.print("First List : ");
//        a.showList();
//        System.out.print("Second List : ");
//        b.showList();
//        System.out.println("Split the list by alternating the nodes");
//        c.Alter();
//        c.showList();
//        d = c.splitList();
//        System.out.print("First List : ");
//        c.showList();
//        System.out.print("Second List : ");
//        d.showList();
//        System.out.println("Merge First List and Second List by alternating the nodes");
//        e.MergeAlterList(c,d);
//        e.showList();
//        System.out.println("Reverse the list. Recursive method in the LinkedList");
//        e.reverse(e.head);
//        e.showList();
//        System.out.println("Reverse the list. Recursive method in tester class");
//        reverse(e,e.head);

        //Question 3
//        Course Programming = new Course("WXX101","Programming",5,'B');
//        Course Networking = new Course("WXX201","Networking",4,'C');
//        Course OS = new Course("WXX301","Operating System",3,'A');
//        
//        LinkedList<Course> list = new LinkedList();
//        System.out.print("The list consist of");
//        list.add(Programming);
//        list.add(Networking);
//        list.add(OS);
//        list.showList();
//        int totalscore;
//        double totalcredit = 0.0;
//        double credit = 0.0;
//        totalscore = 0;
//        for(int i = 0 ; i < list.size() ; i++){
//            totalscore = totalscore + (list.get(i).getgradeVal()*list.get(i).getCd());
//            credit = credit + list.get(i).getCd();
//        }
//        
//        System.out.println("Total point is " + totalscore);
//        totalcredit = totalscore/credit;
//        System.out.printf("Grade point average is %.2f \n",totalcredit);

        //Question 4
//        LinkedList player1 = new LinkedList();
//        LinkedList player2 = new LinkedList();
//        Random r = new Random();
//        int start = r.nextInt(2);
//        if (start == 0) {
//            System.out.println("Player 1 start first");
//            while (player1.size() < 20 && player2.size() < 20) {
//                int rand = r.nextInt(5)+1;
////                System.out.println("Player one roll " + rand);
//                player1();
//                for(int i = 0 ; i < rand ; i++){
//                    player1.add('*');
//                }
//                player1.showList();
//                if(player1.size() >= 20){
//                    break;
//                }
//                int rand2 = r.nextInt(5)+1;
////                System.out.println("Player 2 roll " + rand2);
//                player2();
//                for(int i = 0 ; i < rand2 ; i++){
//                    player2.add('*');
//                }
//                player2.showList();
//                if(player2.size() >= 20){
//                    break;
//                }
//            }
//        }
//        else if(start == 1){
//            System.out.println("Player 2 start first");
//            while (player1.size() < 20 && player2.size() < 20) {
//                int rand = r.nextInt(5)+1;
////                System.out.println("Player 2 roll " + rand);
//                player2();
//                for(int i = 0 ; i < rand ; i++){
//                    player2.add('*');
//                }
//                player2.showList();
//                if(player2.size() >= 20){
//                    break;
//                }
//                int rand2 = r.nextInt(5)+1;
////                System.out.println("Player 1 roll " + rand2);
//                player1();
//                for(int i = 0 ; i < rand2 ; i++){
//                    player1.add('*');
//                }
//                player1.showList();
//                if(player1.size() >= 20){
//                    break;
//                }
//            }
//        }
//        if(player1.size()>= 20){
//            System.out.println("Player 1 wins");
//        }
//        else if(player2.size() >= 20){
//            System.out.println("Player 2 wins");
//        }

        //Question 5
//        LinkedList ll = new LinkedList();
//        ll.add("ARS");
//        ll.add("CHE");
//        ll.add("LEI");
//        ll.add("MAN");
//        ll.add("LIV");
//        ll.add("TOT");
//        System.out.print("The list consists of ");
//        ll.showList();
//        
//        Iterator b = ll.listIterator();
//        while(b.hasNext()){
//            String str =(String) b.next();
//            if(str.contains("A") || str.contains("a")){
//                b.remove();
//            }
//        }
//        System.out.println("Remove all the word that consists of the A character using iterator.");
//        System.out.print("The updated list consists of ");
//        ll.showList();

        //Question 6
//        DoubleLinkedList a = new DoubleLinkedList();
//        Random r = new Random();
//        System.out.print("The random numbers are : ");
//        for(int i = 0 ; i < 10 ; i++){
//            int rand = r.nextInt(101);
//            System.out.print(rand + " ");
//            a.add(rand);
//        }
//        System.out.println();
//        System.out.println("Insert the random numbers into the doubly linked list");
//        a.showList();
////        System.out.println("The size now is " + a.size());
//        System.out.println("Remove a number from the third position");
//        a.remove(2);
//        a.showList();
////        System.out.println("The size now is " + a.size());
//        System.out.println("Replace the number in seventh position with 999");
//        a.set(6,999);
//        a.showList();
////        System.out.println("The size now is " + a.size());
//        System.out.println("Remove all even number from the doubly linked list");
//        a.removeEven();
//        a.showList();
//        System.out.println("The size now is " + a.size());

        //Question 7
//        CircularLinkedList a = new CircularLinkedList();
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a sentence : ");
//        String sentence = sc.nextLine();
//        String[] word = sentence.split(" ");
//        for(int i = 0 ; i < word.length ; i++){
//            a.addCircularNode(word[i]);
//        }
//        System.out.println("The words in the circular linked list");
//        a.showCircularList();
//        System.out.println("After delete a word");
//        a.deleteCircularNode();
//        a.showCircularList();
//        System.out.println("The second item in the list is " + a.getCircularItem(1));

       //Question 8
//        Media hit;
//        String paths;
//        MediaPlayer mp = null;
//        Scanner sc = new Scanner(System.in);
//        CircularLinkedList<Music> a = new CircularLinkedList();
//
//        Music b = new Music("Kotak hati - Hujan", "Hujan Kotak Hati Lirik.mp3");
//        Music c = new Music("Pagi yang gelap - Hujan", "Hujan-pagi yang gelap.mp3");
//        Music d = new Music("Bahagia - Hujan", "BAHGIA - HUJAN ( Ost Kisah Cinta ).mp3");
//        Music e = new Music("Corona ","Coronavirus Workplace Safety (online-audio-converter.com).mp3");
//
//        a.addCircularNode(b);
//        a.addCircularNode(c);
//        a.addCircularNode(d);
//        a.addCircularNode(e);
//        System.out.println("My music Play List");
//        int i = 0;
//        while (true) {
//            a.showCircularList();
//            System.out.print("1 Play Music | 2 Forward | 3 Back | 4 Stop | -1 Exit : ");
//            int choose = sc.nextInt();
//            if (choose == 1) {
//                if (mp != null) {
//                    mp.stop();
//                }
//                System.out.println("Play " + a.getCircularItem(i));
//                JFXPanel panel = new JFXPanel();
//                String song = a.getCircularItem(i).filename;
//                paths = Paths.get(song).toUri().toString();
//                hit = new Media(paths);
//                mp = new MediaPlayer(hit);
//                mp.play();
//
//                //This to make a 10 seconds delay
////                try {
////                    Thread.sleep(10000);
////                } catch (Exception e) {
////                }
////                mp.stop();
//            } else if (choose == 2) {
//                i++;
//                if (i >= a.length()) {
//                    i = 0;
//                }
//                System.out.println("Forward One Position - Play " + a.getCircularItem(i));
//                if (mp != null) {
//                    mp.stop();
//                }
//                JFXPanel panel = new JFXPanel();
//                String song = a.getCircularItem(i).filename;
//                paths = Paths.get(song).toUri().toString();
//                hit = new Media(paths);
//                mp = new MediaPlayer(hit);
//                mp.play();
////                try {
////                    Thread.sleep(10000);
////                } catch (Exception e) {
////                }
////                mp.stop();
//            } else if (choose == 3) {
//                i--;
//                if (i < 0) {
//                    i = a.length() - 1;
//                }
//                System.out.println("Backward One Position - Play " + a.getCircularItem(i));
//                if (mp != null) {
//                    mp.stop();
//                }
//                JFXPanel panel = new JFXPanel();
//                String song = a.getCircularItem(i).filename;
//                paths = Paths.get(song).toUri().toString();
//                hit = new Media(paths);
//                mp = new MediaPlayer(hit);
//                mp.play();
////                try {
////                    Thread.sleep(10000);
////                } catch (Exception e) {
////                }
////                mp.stop();
//            } else if (choose == 4) {
//                System.out.println("Stop Playing");
//                mp.stop();
//            } else if (choose == -1) {
//                System.out.println("Exit Music Player");
//                System.exit(0);
//            }
//        }
    }

    public static void reverse(LinkedList list, ListNode node) {
        if (node != null) {
            reverse(list, node.next);
            System.out.print(node.data + " --> ");
        }
    }

    public static void player1() {
        System.out.print("Player 1: ");
    }

    public static void player2() {
        System.out.print("Player 2: ");
    }
}
