/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.circularqueue;

import problem5.student.Student;

//to implement circular queue
public class MyCircularQueue {
    private Student [] arr;
    private int front;
    private int rare;

    public MyCircularQueue(int length) {
        this.arr = new Student[length];
        this.front=this.rare=-1;
    }

    public boolean enqueue(Student data) {
        if(data.getBackLog()==0) {
            return false;
        }
        else if(front==-1){
            front=rare=0;
            arr[rare]=data;
        }
        else {
            rare=(rare+1)%arr.length;
            if(rare==front){
                System.out.println("queue is full");
                return false;
            }
            arr[rare]=data;
        }
        return true;
    }

    public String dequeue() {
        if(front==-1) {
            return "queue is empty";
        }
        else if(front==rare) {
            String s=arr[front].toString();
            front=rare=-1;
            return s;
        }
        else {
            return arr[front++].toString();
        }
    }

    public String process() {
        String s = arr[front].toString() + "\nBackLog-Appearing is " +(arr[front].getBackLog()-arr[front].getAppearingCount() );
        return s;
    }
}
