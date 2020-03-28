/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.mybst;
// to implement BinarySearchTree

import problem1.node.TreeNode;

public class MyBinarySearchTree {
   private TreeNode root;
    private int length;
    private int [] arr;
    private int index;

    public TreeNode getRoot() {
        return root;
    }
    public boolean insert(int data) {
        if(root==null) {root=new TreeNode(data); length++; return true;}
        TreeNode currentNode=root;
        while (true) {
            if(currentNode.getData()==data){return false;}
            if(currentNode.getData()<data && currentNode.getRight()==null) {currentNode.setRight(new TreeNode(data)); length++; return true;}
            if(currentNode.getData()>data && currentNode.getLeft()==null) {currentNode.setLeft(new TreeNode(data)); length++; return true;}
            if(currentNode.getData()<data && currentNode.getRight()!=null)  {currentNode = currentNode.getRight();}
            if(currentNode.getData()>data && currentNode.getLeft()!=null) {currentNode = currentNode.getLeft(); }
        }
    }
    public int [] preOrderTraversal() {
        arr=new int[length];
        index=0;
        return preOrderTraversal(root);
    }

    public int [] postOrderTraversal() {
        arr=new int[length];
        index=0;
        return postOrderTraversal(root);
    }

    public int countNodeNotHavingLeftChild() { return countNodeNotHavingLeftChild(root);}

    public void printAllLeftChild() { printAllLeftChild(root);}

    private int[] preOrderTraversal(TreeNode currentNode) {
        if(length==0){ return null; }
        arr[index++]= currentNode.getData();
        if(currentNode.getLeft()!=null){ preOrderTraversal(currentNode.getLeft()); }
        if(currentNode.getRight()!=null) { preOrderTraversal(currentNode.getRight()); }
        return arr;
   }

    private int[] postOrderTraversal(TreeNode currentNode) {
        if(length==0){ return null; }
        if(currentNode.getLeft()!=null){ postOrderTraversal(currentNode.getLeft()); }
        if(currentNode.getRight()!=null) { postOrderTraversal(currentNode.getRight()); }
        arr[index++]= currentNode.getData();
        return arr;
    }

    private int countNodeNotHavingLeftChild(TreeNode node) {
        if (length!=0) {
            int temp = 0;
            if (node.getLeft() != null && node.getRight() != null) {
                temp += countNodeNotHavingLeftChild(node.getLeft());
                temp += countNodeNotHavingLeftChild(node.getRight());
            } else if (node.getLeft() != null && node.getRight() == null) {
                temp += countNodeNotHavingLeftChild(node.getLeft());
            } else if (node.getLeft() == null && node.getRight() != null) {
                temp = 1;
                temp += countNodeNotHavingLeftChild(node.getRight());
            } else {
                temp = 1;
            }

            return temp;
        }
        else{
            return 0;
        }
    }

    private void printAllLeftChild(TreeNode node) {
        if(length!=0) {
            if(node.getLeft()!=null) {
                System.out.println(node.getLeft().getData());
                printAllLeftChild(node.getLeft());
            }
            if(node.getRight()!=null) {
                printAllLeftChild(node.getRight());
            }
        }
    }
}
