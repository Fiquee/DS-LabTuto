package dstuto7;

public class DStuto7 {

    public static void main(String[] args) {
        //1 for inOrder, 2 for preOrder, 3 for postOrder

        //Question 1
//        BST tree = new BST();
//        int[] arr = {50,30,25,71,80,99,40,1,7,5};
//        for(int i = 0 ; i < arr.length ; i++){
//            tree.add(arr[i]);
//        }
//        System.out.println("inOrder :");
//        tree.setOrder(1);
//        tree.showTree();
//        System.out.println("preOrder :");
//        tree.setOrder(2);
//        tree.showTree();
//        System.out.println("postOrder :");
//        tree.setOrder(3);
//        tree.showTree();

        //Question 2
//        BST tree = new BST();
//        char[] arr = {'F','A','C','U','L','T','Y'};
//        for(int i = 0 ; i < arr.length ; i++){
//            tree.add(arr[i]);
//        }
//        System.out.println("The number of elements in the tree " + tree.size());
//        tree.setOrder(2);
//        System.out.print("The tree elements - PREORDER : ");
//        tree.showTree();
//        tree.setOrder(1);
//        System.out.print("The tree elements - INORDER : ");
//        tree.showTree();
//        tree.setOrder(3);
//        System.out.print("The tree elements - POSTORDER : ");
//        tree.showTree();
//        
//        System.out.println("Remove 1 Character L");
//        tree.remove('L');
//        tree.setOrder(2);
//        System.out.print("The tree elements - PREORDER : ");
//        tree.showTree();
//        tree.setOrder(1);
//        System.out.print("The tree elements - INORDER : ");
//        tree.showTree();
//        tree.setOrder(3);
//        System.out.print("The tree elements - POSTORDER : ");
//        tree.showTree();

        //Question 3
        ArrayBST tree = new ArrayBST();
        System.out.println("BST Implementation Using Array");
//        char[] arr = {'F', 'A', 'C', 'U', 'L', 'T', 'Y'};
//        for (int i = 0; i < arr.length; i++) {
//            tree.addNode(arr[i]);
//        }
        int[] arr = {15,20,13,14,17,18,30};
        for(int i = 0 ; i < arr.length ;i++){
            tree.addNode(arr[i]);
        }
        
        System.out.println("The number of elements in the tree " + tree.getSize());
        System.out.println("height : " + tree.getHeight());
        System.out.print("The tree elements - PREORDER : ");
        tree.preOrder(0);
        System.out.println();
        System.out.print("The tree elements - INORDER : ");
        tree.inOrder(0);
        System.out.println();
        System.out.print("The tree elements - POSTORDER : ");
        tree.postOrder(0);
        System.out.println();
        System.out.println("Remove 1 Character 17");
        tree.remove(17);
        System.out.println("Tree height " + tree.getHeight());
        System.out.println("The number of elements in the tree " + tree.getSize());
        System.out.print("The tree elements - PREORDER : ");
        tree.preOrder(0);
        System.out.println();
        System.out.print("The tree elements - INORDER : ");
        tree.inOrder(0);
        System.out.println();
        System.out.print("The tree elements - POSTORDER : ");
        tree.postOrder(0);
        System.out.println();
    }
}
