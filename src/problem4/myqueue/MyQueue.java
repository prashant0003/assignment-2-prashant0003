/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:11 PM
 */
package problem4.myqueue;
// to create queue to store pre - order successor

public class MyQueue {
    private int []arr;
    private int front;

    public MyQueue(int[] arr){
        this.arr=arr;
        this.front=0;
    }

    public int dequeue() {
        if(front<arr.length){
            return arr[front++];
        }
        return -1;
    }
}
