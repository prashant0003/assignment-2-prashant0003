/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;

import problem3.myqueue.MyPriorityQueue;
import problem5.student.Student;

// executable class
// use problem5.student.Student class to create object of student
public class MyMain {
    public static void main(String [] args) {
        MyPriorityQueue queue=new MyPriorityQueue();
        queue.enqueue(new Student("Shashank",4,'C',"GLA"));
        queue.enqueue(new Student("Achal",2,'C',"GLA"));
        queue.enqueue(new Student("Mridul",5,'C',"GLA"));
        queue.enqueue(new Student("Rahul",6,'C',"GLA"));
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        queue.enqueue(new Student("Ram",1,'C',"GLA"));
        queue.enqueue(new Student("Rohan",2,'C',"GLA"));
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}
