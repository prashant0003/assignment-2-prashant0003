/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.main;
// executable class

import problem1.mybst.MyBinarySearchTree;

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
        tree.insert(8);
        System.out.println("number of node not having left child: "+tree.countNodeNotHavingLeftChild()+"\nAll nodes which is left child of tree");
        tree.printAllLeftChild();
    }
}
