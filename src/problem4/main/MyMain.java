/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:08 PM
 */
package problem4.main;

import problem1.mybst.MyBinarySearchTree;
import problem4.myqueue.MyQueue;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    public static void main(String[] args) {
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
        MyQueue queue=new MyQueue(tree.preOrderTraversal());
        int temp1=queue.dequeue();
        int temp2=queue.dequeue();
        while(temp2!=-1) {
            System.out.println("preOrderSuccessor of "+temp1+" is : "+temp2);
            temp1=temp2;
            temp2=queue.dequeue();
        }
    }
}
