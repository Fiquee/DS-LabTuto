package dslab6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class DSLab6 {

    public static void main(String[] args) {

        //Question 1
//        Queue q = new Queue();
//        int balance = 500;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter transactions : ");
//        String tran = sc.nextLine();
//        tran = tran.replaceAll(" \\| ", "\\|");
//        String[] arr = tran.split("\\|");
//
//        for (int i = 0; i < arr.length; i++) {
//            q.enqueue(arr[i] + " ");
//        }
//        q.showQueue();
//        System.out.println("Initial Balance : " + balance);
//        while (!q.isEmpty()) {
//            switch (q.peek().toString().charAt(0)) {
//                case 'd':
//                case 'D':
//                    String dep = q.dequeue().toString().substring(2);
//                    dep = dep.replaceAll(" ","");
//                    int deposit = Integer.parseInt(dep);
//                    balance += deposit;
//                    System.out.println("Deposit " + deposit + "                    New Balance " + balance);
//                    break;
//                case 'w':
//                case 'W':
//                    String with = q.dequeue().toString().substring(2);
//                    with = with.replaceAll(" ","");
//                    int withdraw = Integer.parseInt(with);
//                    if (withdraw > balance) {
//                        System.out.println("Withdraw " + withdraw + " Rejected           New Balance " + balance);
//                        break;
//                    } else {
//                        balance -= withdraw;
//                        System.out.println("Withdraw " + withdraw + "                    New Balance " + balance);
//                        break;
//                    }
//                default:
//                    System.out.println("Invalid key");
//                    break;
//            }
//        }

        //Question 2
//        Queue cd = new Queue();
//        Queue fruit = new Queue();
//        Queue sp = new Queue();
//        Queue stat = new Queue();
//        Queue attire = new Queue();
//        int code = 0;
//        String[] procode = {"P03", "P02", "P06", "P04"};
//        for (int i = 0; i < procode.length; i++) {
//            cd.enqueue(procode[i]);
//        }
//        System.out.print("Product Code in queue : ");
//        cd.showQueue();
//        try {
//            Scanner sc = new Scanner(new FileInputStream("lab6Q2.txt"));
//            while (sc.hasNext()) {
//                String str = sc.next();
//                switch (str) {
//                    case "P03":
//                    case "p03":
//                        fruit.enqueue(sc.next());
//                        break;
//                    case "P02":
//                    case "p02":
//                        sp.enqueue(sc.next());
//                        break;
//                    case "P06":
//                    case "p06":
//                        stat.enqueue(sc.next());
//                        break;
//                    case "P04":
//                    case "p04":
//                        attire.enqueue(sc.next());
//                        break;
//                }
//            }
//        } catch (FileNotFoundException e) {
//            System.out.println("File does not exist");
//        }
//        System.out.println("List of product by categories");
//        while (!cd.isEmpty()) {
//            System.out.println("Product : " + cd.peek());
//            switch ((String) cd.peek()) {
//                case "P03":
//                case "p03":
//                    cd.dequeue();
//                    fruit.showQueue();
//                    break;
//                case "P02":
//                case "p02":
//                    cd.dequeue();
//                    sp.showQueue();
//                    break;
//                case "P06":
//                case "p06":
//                    cd.dequeue();
//                    stat.showQueue();
//                    break;
//                case "P04":
//                case "p04":
//                    cd.dequeue();
//                    attire.showQueue();
//                    break;
//            }
//        }

        //Question 3
//        Queue<ColourCard> deck = new Queue();
//        Queue<ColourCard> p1 = new Queue();
//        Queue<ColourCard> p2 = new Queue();
//        int p1score = 0;
//        int p2score = 0;
//        for(int i = 0 ; i < 4 ; i++){
//            for(int j = 0 ; j < 10 ; j++){
//                ColourCard card = new ColourCard(i,j);
//                deck.enqueue(card);
//            }
//        }
//        deck.Shuffle();
//        
//        for(int i = 0 ; i < 5 ; i++){
//            p1.enqueue(deck.dequeue());
//            p2.enqueue(deck.dequeue());
//        }
//        p1.showQueue();
//        p2.showQueue();
//        while(!p1.isEmpty() && !p2.isEmpty()){
//            if(p1.dequeue().compareTo(p2.dequeue()) > 0){
//                p1score++;
//            }
//            else{
//                p2score++;
//            }
//        }
//        System.out.println("Player 1 Score: " + p1score);
//        System.out.println("Player 2 Score: " + p2score);
//        if(p1score > p2score){
//            System.out.println("Player 1 WINS!");
//        }
//        else if(p2score > p1score){
//            System.out.println("Player 2 WINS!");
//        }
//        else{
//            System.out.println("Draw!");
//        }

        //Question 4
//        Queue<Buy> q = new Queue();
//        int sellnum = 0;
//        int sellprice = 0;
//        int day = 1;
//        try {
//            Scanner sc = new Scanner(new FileInputStream("lab6Q4.txt"));
//            while (sc.hasNext()) {
//                String str = sc.next();
//                if (str.equalsIgnoreCase("buy")) {
//                    Buy buy = new Buy(str, Integer.valueOf(sc.next()), Integer.valueOf(sc.next()), day);
//                    q.enqueue(buy);
//                } else if (str.equalsIgnoreCase("sell")) {
//                    sellnum = Integer.valueOf(sc.next());
//                    sellprice = Integer.valueOf(sc.next());
//                    Buy sell = new Buy(str, sellnum, sellprice, day);
//                    q.enqueue(sell);
//                }
//                day++;
//            }
//            System.out.print("List of Transactions");
//            q.showQueue();
//            int gain = 0;
//            while (!q.isEmpty()) {
//                Buy list = q.dequeue();
//                if (sellnum < list.getNumber()) {
//                    gain += sellnum * (sellprice - list.getPrice());
//                    sellnum = sellnum - sellnum;
//                } else {
//                    sellnum = sellnum - list.getNumber();
//                    gain += list.getNumber()*(sellprice - list.getPrice());
//                }
//            }
//            if(gain >= 0){
//                System.out.println("Total Gain " + gain);
//            }
//            else{
//                System.out.println("Total Loss " + gain);
//            }
//
//        } catch (FileNotFoundException e) {
//
//        }

        //Question 5
//        Random r = new Random();
//        String[] type = {"Video","Voice","Data"};
//        PriorityQueue<Packet> q = new PriorityQueue();
//        int prior = 0;
//        System.out.println("10 packets arrived");
//        for(int i = 1 ; i <= 10 ; i++){
//            String rand = type[r.nextInt(3)];  //video
//            if(rand.equalsIgnoreCase("Video")){
//                prior = 1;
//            }
//            else if(rand.equalsIgnoreCase("Voice")){
//                prior = 2;
//            }
//            else if(rand.equalsIgnoreCase("Data")){
//                prior = 0;
//            }
//            Packet packet = new Packet(rand+" "+i, prior);  //type = video 1
//            q.enqueue(packet);
//            System.out.println(packet.toString());
//        }
//        System.out.println();
//        System.out.println("Processing 10 network packets");
//        while(!q.isEmpty()){
//            System.out.println(q.dequeue().toString());
//        }
    }

}
