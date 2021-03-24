/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dslab7;

import java.util.Stack;

/**
 *
 * @author Forge-15 i7
 */
public class BSTExpression {

    String expression;
    Stack<BSTNode> BSTstack = new Stack();
    Stack<String> operators = new Stack();

    public BSTExpression(String expression) {
        this.expression = expression;

        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '(') {
                operators.push(String.valueOf(expression.charAt(i)));
            } else if (expression.charAt(i) == ')') {
                while (!operators.peek().contentEquals("(")) {
                    String operator = operators.pop();
                    BSTNode left = BSTstack.pop();
                    BSTNode right = BSTstack.pop();
                    BSTNode node = new BSTNode(operator, right, left);
                    BSTstack.push(node);
                }
                operators.pop();
            } else if (Character.isDigit(expression.charAt(i))) {
                int start = i;
                int mov = i;
                while (i < expression.length() && Character.isDigit(expression.charAt(i))) {
                    if (Character.isDigit(expression.charAt(i))) {
                        mov++;
                        i++;
                    }
                }
                String num = expression.substring(start, mov);
                BSTNode node = new BSTNode(num, null, null);
                BSTstack.push(node);
                i--;
            } else if (expression.charAt(i) == ' ') {
                continue;
            } else {
                if (!operators.isEmpty()) {
                    if (operators.peek().contentEquals("(")) {
                        operators.push(String.valueOf(expression.charAt(i)));
                    } else {
                        while(getPrior(String.valueOf(expression.charAt(i))) <= getPrior(operators.peek())) {
                            String operator = operators.pop();
                            BSTNode left = BSTstack.pop();
                            BSTNode right = BSTstack.pop();
                            BSTNode node = new BSTNode(operator, right, left);
                            BSTstack.push(node);
                            if(!operators.isEmpty()){
                                if(operators.peek().equals("(")){
                                    break;
                                }
                            }
                            else{
                                break;
                            }
                        }
                        operators.push(String.valueOf(expression.charAt(i)));
                    }
                } else {
                    operators.push(String.valueOf(expression.charAt(i)));
                }
            }
        }
        while (!operators.isEmpty()) {
            String operator = operators.pop();
            BSTNode left = BSTstack.pop();
            BSTNode right = BSTstack.pop();
            BSTNode node = new BSTNode(operator, right, left);
            BSTstack.push(node);
        }
        BSTNode root = BSTstack.pop();
        System.out.println("The number of elements in the tree : " + getSize(root));

        System.out.print("The tree elements - INORDER : ");
        inOrder(root);
        System.out.println();

        System.out.print("The tree elements - PREORDER : ");
        preOrder(root);
        System.out.println();

        System.out.print("The tree elements - POSTORDER : ");
        postOrder(root);
        System.out.println();

    }

    public void inOrder(BSTNode node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print("<-- " + node.data + " ");
            inOrder(node.right);
        }
    }

    public void preOrder(BSTNode node) {
        if (node != null) {
            System.out.print("<-- " + node.data + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    public void postOrder(BSTNode node) {
        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.print("<-- " + node.data + " ");
        }
    }

    public int getPrior(String c) {
        if (c.contentEquals("*") || c.contentEquals("/") || c.contentEquals("%")) {
            return 1;
        }
        return 0;
    }

    public int getSize(BSTNode<String> a) {
        if (a == null) {
            return 0;
        }
        return getSize(a.left) + getSize(a.right) + 1;
    }

}
