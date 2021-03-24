package dslab5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

public class DSLab5 {

    static Stack<Integer> stack = new Stack();
    static Stack<Character> a = new Stack();
    static Stack<Integer> index = new Stack();
    static Scanner sc = new Scanner(System.in);
    static int[][] board;
    static int N;
    static int count = 0;
    static int[][] maze;
    static int C, R;
    static Stack<Position> positionstack = new Stack();

    public static void main(String[] args) {

        //Question 1
//        Stack<String> stack = new Stack<>();
//        LinkedList list = new LinkedList<>();
//        String[] arr = {"Blue","Orange","Red","Yellow"};
//        Random r = new Random();
//        int max = r.nextInt(10)+1;
//        System.out.println("Ahmad took " + max + " candies");
//        for(int i = 0 ; i < max ; i++){
//            stack.push(arr[r.nextInt(4)]);
//        }
//        System.out.println("The candies in the container: ");
//        System.out.println(stack.toString());
//        while(!stack.isEmpty()){
//            String candy = stack.pop();
//            if(!candy.equals("Blue")){
//                list.addFirst(candy);
//            }
//        }
//        System.out.println("Ali takes all the candies one by one from the container and eats the blue ones.");
//        System.out.println("He puts back the rest of candies in the container.");
//        System.out.println("The candies in the container: ");
//        for(int i = 0 ; i < list.size() ; i++){
//            stack.push((String)list.get(i));
//        }
//        System.out.println(stack.toString());

//        Question 2
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter infix expression : ");
//        String exp = sc.nextLine();
//        String infix = getOperator(exp);
//        System.out.print("The infix expression is: " + infix);
//        System.out.println();
//        System.out.print("The postfix expression is: " + infixtopostfix(infix));
//        System.out.println();
//        System.out.print("The result is : " + postfixEvaluation(infixtopostfix(infix)));
//        System.out.println();

        //Question 3
//        System.out.print("Enter the value for N : ");
//        N = sc.nextInt();
//        board = new int[N][N];
//        int row = 0, column = 0;
//        while (true) {
//            column = isValid(row, column);
//            if (column != -1) {    //there's a valid position
//                stack.push(column);
//                board[row][column] = 1;
//                column = 0;
//                row++;
//            }
//            if (column == -1) {
//                if (stack.isEmpty()) {
//                    if (count == 0) {
//                        System.out.println("There is no solution");
//                        break;
//                    } else {
//                        System.out.println("The number of solutions are : " + count);
//                        break;
//                    }
//                } else {   //Backtracking
//                    row--;
//                    column = stack.pop();
//                    board[row][column] = 0; //Reset the specific position
//                    column++;  //find another position
//                }
//            }
//            if (stack.size() == N) {
//                for (int i = 0; i < N; i++) {
//                    int num = stack.pop();
//                    for(int m = 0 ; m < N ; m++){
//                        if(m == num){
//                            System.out.print("Q ");
//                        }
//                        else{
//                            System.out.print("* ");
//                        }
//                    }
//                    System.out.println();
//                    if (i == N - 1) {
//                        column = num;
//                    }
//                }
//                System.out.println();
//                reset();
//                row = 0;
//                column++;
//                count++;
//            }
//        }

        //Quesiton 4
//        System.out.print("Enter an expression : ");
//        String exp = sc.nextLine();
//        if (isBalanced(exp)) {
//            System.out.println(exp);
//            System.out.println("The expression is balanced");
//        } else {
//            if (isExtra()) {
//                char c = getExtra(exp);
//                System.out.println(exp);
//                int ind = index.pop();
//                for(int i = 0 ; i < exp.length() ; i++){
//                    if(i == ind){
//                        System.out.print("^ extra " + c);
//                        break;
//                    }
//                    else{
//                        System.out.print(" ");
//                    }
//                }
//                System.out.println();
//            } else {
//                char c = getClose(a.pop());
//                System.out.println(exp);
//                int ind = index.pop();
//                for (int i = 0; i < exp.length(); i++) {
//                    if (i == ind) {
//                        System.out.print("^ Missing " + c);
//                        break;
//                    }
//                    System.out.print(" ");
//                }
//                System.out.println();
//            }
//        }

        //Question 5
//        int mov;
//        String root = "", line = "";
//        int count = 0;
//        Stack element = new Stack();
//        Stack<String> error = new Stack();
//        LinkedList<String> list = new LinkedList<>();
//        try {
//            Scanner in = new Scanner(new FileInputStream("test1.xml")); //there are test 1,2,3,4,5
//            while (in.hasNextLine()) {
//                list.add(in.nextLine());
//                System.out.println(list.get(count++));
//            }
//            for (int i = 0; i < list.size(); i++) {
//                line = list.get(i);
//                for (int j = 0; j < line.length(); j++) {
//                    if (line.charAt(j) == '<') {
//                        String word = line.substring(j, line.indexOf(">")+1);
//                        j = line.indexOf(">");
//                        line = line.substring(line.indexOf(">") + 1);
//                        if (word.equals(root)) {
//                            error.push("Duplicate root element " + root);
//                            break;
//                        }
//                        if (word.contains("/")) {
//                            if (element.isEmpty()) {
//                                error.push("No begin element for " + word);
//                                break;
//                            }
//                            String c = (String) element.peek();
//                            if (isEquals(word, c)) {
//                                element.pop();
//                            } else {
//                                error.push("Begin Element : " + element.peek() + " Invalid ending element : " + word);
//                                break;
//                            }
//                        } else {
//                            if (element.isEmpty()) {
//                                root = word;
//                            }
//                            element.push(word);
//                        }
//                    }
//                }
//                if (!error.isEmpty()) {
//                    System.out.println(error.peek());
//                    break;
//                }
//            }
//            if (element.isEmpty() && error.isEmpty()) {
//                System.out.println("The xml document is valid");
//            }
//
//        } catch (FileNotFoundException e) {
//
//        }

        //Question 6 (Maze)
//        Position start = null;
//        int Startrow = 0, Startcolumn = 0;
//        C = 0;
//        R = 0;
//        try {
//            Scanner sc = new Scanner(new FileInputStream("Maze2.txt"));
//            while (sc.hasNextLine()) {
//                String line = sc.nextLine();
//                C = line.length();
//                R++;
//            }
//            sc.close();
//        } catch (FileNotFoundException e) {
//
//        }
//        try {
//            maze = new int[R][C];
//            int i = 0;
//            Scanner sc = new Scanner(new FileInputStream("Maze2.txt"));
//            while (sc.hasNextLine()) {
//                String line = sc.nextLine();
//                for (int l = 0; l < line.length(); l++) {
//                    char c = line.charAt(l);
//                    switch (c) {
//                        case '#':
//                            maze[i][l] = -2;  //wall
//                            break;
//                        case 'S':
//                            maze[i][l] = 0; //starting point [1,1]
//                            start = new Position(i, l);
//                            break;
//                        case 'F':
//                            maze[i][l] = 9; //destination
//                            break;
//                        default:
//                            maze[i][l] = -1; //unvisited path  1 = Solution pathway with '.'
//                            break;
//                    }
//                }
//                i++;
//            }
//            sc.close();
//        } catch (FileNotFoundException e) {
//
//        }
//        System.out.println("The original maze is");
//        showBoard(maze);
//        while (true) {
//            Position position = validposition(start);
//            if (position != start) {
//                if (maze[position.getRow()][position.getColumn()] == 9) {
//                    break;
//                }
//                positionstack.push(position);
//                int i = position.getRow();
//                int j = position.getColumn();
//                maze[i][j] = 1;
//                start = position;
//            } else if (position == start) {
//                if (positionstack.isEmpty()) {
//                    System.out.println("There is no solution");
//                    break;
//                } else {
//                    positionstack.pop();
//                    if (positionstack.isEmpty()) {
//                        System.out.println("There is no solution");
//                        break;
//                    }
//                    maze[position.getRow()][position.getColumn()] = 3;  //Visited but no dot '.'
//                    position = positionstack.peek();
//                    start = position;
//                }
//            }
//        }
//        if (!positionstack.isEmpty()) {
//            System.out.println();
//            System.out.println("The Solution is");
//            showBoard(maze);
//        }
    }


public static boolean canplaceposition(Position pos) {
        int i = pos.getRow();
        int j = pos.getColumn();
        if (maze[i][j] == 1 || maze[i][j] == -2 || maze[i][j] == 0 || maze[i][j] == 3) {
            return false;
        }
        return true;
    }

    public static Position validposition(Position start) {
        Position north = new Position(start.getRow() - 1, start.getColumn());
        Position south = new Position(start.getRow() + 1, start.getColumn());
        Position east = new Position(start.getRow(), start.getColumn() + 1);
        Position west = new Position(start.getRow(), start.getColumn() - 1);
        Position invalid = null;
        if (canplaceposition(north)) {
            return north;
        } else if (canplaceposition(south)) {
            return south;
        } else if (canplaceposition(east)) {
            return east;
        } else if (canplaceposition(west)) {
            return west;
        } else {
            return start;
        }
    }

    public static void showBoard(int[][] maze) {
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[0].length; j++) {
                switch (maze[i][j]) {
                    case -2:
                        System.out.print('#');
                        break;
                    case 0:
                        System.out.print('S');
                        break;
                    case 9:
                        System.out.print('F');
                        break;
                    case -1:
                    case  3:
                        System.out.print(' ');
                        break;
                    case 1:
                        System.out.print('.');
                        break;
                    default:
                        System.out.print("");
                }
            }
            System.out.println();
        }
    }

    public static boolean isEquals(String word, String c) {
        word = word.replace("/", "");
        if (word.equals(c)) {
            return true;
        }
        return false;
    }

    public static char getExtra(String exp) {
        int i;
        for (i = 0; i < exp.length(); i++) {
            if (exp.charAt(i) == '(' || exp.charAt(i) == '[' || exp.charAt(i) == '{') {
                if (i > 0) {
                    if (exp.charAt(i - 1) == '\\') {
                        continue;
                    }
                }
                a.push(exp.charAt(i));
            } else if (exp.charAt(i) == ')' || exp.charAt(i) == ']' || exp.charAt(i) == '}') {
                if (a.isEmpty()) {
                    index.push(i);
                    return exp.charAt(i);
                }
                a.pop();
            }
        }
        index.push(i - 1);
        return exp.charAt(i - 1);
    }

    public static boolean isExtra() {
        if (a.isEmpty()) {
            return true;
        }
        return false;
    }

    public static boolean isBalanced(String exp) {
        int i;
        for (i = 0; i < exp.length(); i++) {
            if (exp.charAt(i) == '(' || exp.charAt(i) == '[' || exp.charAt(i) == '{') {
                if (i > 0) {
                    if (exp.charAt(i - 1) == '\\') {
                        continue;
                    }
                }
                a.push(exp.charAt(i));
            } else if (exp.charAt(i) == ')' || exp.charAt(i) == ']' || exp.charAt(i) == '}') {
                if (i > 0) {
                    if (exp.charAt(i - 1) == '\\') {
                        continue;
                    }
                }
                if (!a.isEmpty()) {
                    char c = a.peek();
                    if (c != getClose(exp.charAt(i))) {
                        index.push(i);
                        return false;
                    }
                    a.pop();
                } else {
                    return false;
                }
            }
        }
        if (a.isEmpty()) {
            return true;
        }
        index.push(i - 1);
        return false;
    }

    public static char getClose(char c) {
        switch (c) {
            case ')':
                return '(';
            case ']':
                return '[';
            case '}':
                return '{';
            case '(':
                return ')';
            case '[':
                return ']';
            case '{':
                return '}';
            default:
                return 0;
        }
    }

    public static boolean canPlace(int row, int column) {

        int i, j;
        //Check left
        for (i = 0; i < column; i++) {
            if (board[row][i] == 1) {
                return false;
            }
        }

        //Check above
        for (i = 0; i < row; i++) {
            if (board[i][column] == 1) {
                return false;
            }
        }

        // Check diagonally
        for (i = row, j = column; i >= 0 && j < board.length; i--, j++) { // top right
            if (board[i][j] == 1) {
                return false;
            }
        }
        for (i = row, j = column; i >= 0 && j >= 0; i--, j--) { // top left
            if (board[i][j] == 1) {
                return false;
            }
        }
        return true;
    }

    public static int isValid(int row, int column) {
        for (int i = column; i < N; i++) {
            if (canPlace(row, i)) {
                return i; //returns column index 
            }
        }
        return -1;
    }

    public static void reset() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                board[i][j] = 0;
            }
        }
    }

    public static int getResult(int a, int b, char c) {
        switch (c) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
            case '%':
                return a % b;
        }
        return 0;
    }

    public static int postfixEvaluation(String a) {
        Stack<String> stack = new Stack<>();
        String temp;
        int num1 = 0, num2 = 0, result = 0;
        for (int i = 0; i < a.length(); i++) {
            if (Character.isDigit(a.charAt(i))) {
                int start = i;
                int mov = i;
                while (Character.isDigit(a.charAt(i))) {
                    mov++;
                    i++;
                }
                temp = a.substring(start, mov);
                stack.push(temp);

            } else if (a.charAt(i) == ' ') {
                continue;
            } else {
                num2 = Integer.parseInt(stack.pop());
                num1 = Integer.parseInt(stack.pop());
                result = getResult(num1, num2, a.charAt(i));
                stack.push(result + "");
            }
        }
        result = Integer.parseInt(stack.pop());
        return result;
    }

    public static int getPriority(char a) {
        switch (a) {
            case '*':
            case '/':
            case '%':
                return 2;
            case '+':
            case '-':
                return 1;
            default:
                return 0;
        }
    }

    public static String getOperator(String a) {
        String[] arr = a.split(" ");
        String IS = "";
        for (int i = 0; i < arr.length; i++) {
            if (Character.isDigit(arr[i].charAt(0))) {
                IS += arr[i] + " ";
            } else if (arr[i].equals("add")) {
                IS += '+' + " ";
            } else if (arr[i].equals("sub")) {
                IS += '-' + " ";
            } else if (arr[i].equals("mul")) {
                IS += '*' + " ";
            } else if (arr[i].equals("div")) {
                IS += '/' + " ";
            } else if (arr[i].equals("mod")) {
                IS += '%' + " ";
            } else if (arr[i].equals("ob")) {
                IS += '(' + " ";
            } else if (arr[i].equals("cb")) {
                IS += ')' + " ";
            }
        }
        return IS;
    }

    public static String infixtopostfix(String a) {
        String str = "";
        char c = ' ';
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < a.length(); i++) {
            if (Character.isLetterOrDigit(a.charAt(i))) {
                while (Character.isLetterOrDigit(a.charAt(i))) {
                    str += a.charAt(i);
                    i++;
                }
            } else if (a.charAt(i) == '(') {
                stack.push(a.charAt(i));
            } else if (a.charAt(i) == ')') {
                c = stack.pop();
                while (c != '(') {
                    str += " " + c;
                    c = stack.pop();
                }
            } else if (a.charAt(i) == ' ') {
                str += " ";
            } else {
                if (!stack.isEmpty()) {
                    if (stack.peek() == '(') {
                        stack.push(a.charAt(i));
                    } else {
                        while (getPriority(a.charAt(i)) <= getPriority(stack.peek())) {
                            str += " " + stack.pop();
                            if (!stack.isEmpty()) {
                                c = stack.peek();
                                if (c == '(') {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        stack.push(a.charAt(i));
                    }
                } else {
                    stack.push(a.charAt(i));
                }
            }
        }
        while (!stack.isEmpty()) {
            str += " " + stack.pop();
        }
        return str;
    }
}
