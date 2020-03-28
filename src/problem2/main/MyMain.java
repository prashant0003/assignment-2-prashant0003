/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem2.main;
// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
  public static void main(String []args) {
        MyBinarySearchTree tree=new MyBinarySearchTree();
        tree.insert(10);
        tree.insert(30);
        tree.insert(20);
        tree.insert(50);
        tree.insert(40);
        tree.insert(0);
        tree.insert(25);
        tree.insert(5);
        tree.insert(4);
        //tree.insert(8);
        int [] postOrderTraversal=tree.postOrderTraversal();
        int [] preOrderTraversal=tree.preOrderTraversal();
        if(postOrderTraversal[postOrderTraversal.length-1]==preOrderTraversal[0] && preOrderTraversal[0]==tree.getRoot().getData()) {
            System.out.println("yes in pre order traversal root element is the first element and in post order traversal root element is the last element.");
        }
        else {
            System.out.println("no in pre order traversal root element is the first element and in post order traversal root element is the last element.");
        }
        if(postOrderTraversal.length%2!=0) {
            if(postOrderTraversal[postOrderTraversal.length/2]==preOrderTraversal[preOrderTraversal.length/2]) {
                System.out.println("preOrderTraversal and postOrderTraversal have same mid point");
            }
            else {
                System.out.println("preOrderTraversal and postOrderTraversal do not have same mid point");
            }
        }
        else{
            System.out.println("elements in a tree is even.");
        }
    }
}
