/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.main;

import problem5.circularqueue.MyCircularQueue;
import problem5.student.Student;

//executable class
public class MyMain {
    public static void main(String[] args) {
        MyCircularQueue queue=new MyCircularQueue(5);
        queue.enqueue(new Student("alpha",4,'C',"GLA",1,2));
        queue.enqueue(new Student("beta",2,'C',"GLA",0,2));
        queue.enqueue(new Student("gama",5,'C',"GLA",2,2));
        queue.enqueue(new Student("delta",6,'C',"GLA",1,1));
        System.out.println(queue.process());
        queue.dequeue();
        System.out.println(queue.process());
        queue.dequeue();
        queue.enqueue(new Student("alpha",4,'C',"GLA",1,2));
        queue.enqueue(new Student("alpha",4,'C',"GLA",1,2));
        queue.enqueue(new Student("alpha",4,'C',"GLA",1,2));
        queue.enqueue(new Student("alpha",4,'C',"GLA",1,2));
    }
}
