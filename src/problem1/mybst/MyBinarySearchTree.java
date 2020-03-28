/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.mybst;
// to implement BinarySearchTree
public class MyBinarySearchTree {
   private TreeNode root;
    private int length;
    private int [] arr;
    private int index;

    public TreeNode getRoot() {
        return root;
    
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
    }
}
