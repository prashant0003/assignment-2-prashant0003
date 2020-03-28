/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem3.myqueue;

import problem3.node.Node;
import problem5.student.Student;

public class MyPriorityQueue {

    private Node front;
    private Node rare;

    //lower rollNumber get higher priority
    public void enqueue(Student data) {
        Node node=new Node(data);
        if(front==null) {
            front=rare=node;
        }
        else if(rare.getData().getRollNumber()<=data.getRollNumber()) {
            rare.setNext(node);
            rare=node;
        }
        else if(front.getData().getRollNumber()>data.getRollNumber()) {
            node.setNext(front);
            front=node;
        }
        else {
            Node temp=front;
            while(temp.getNext().getData().getRollNumber()<=data.getRollNumber()) {
                temp=temp.getNext();
            }
            node.setNext(temp.getNext());
            temp.setNext(node);
        }
    }

    public Student dequeue() {
        if(front==null) {
            return null;
        }
        else {
            Node temp = front;
            front = front.getNext();
            if(front==null) {
                rare=null;
            }
            return temp.getData();
        }
    }
}
