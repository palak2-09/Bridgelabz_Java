/*
Implement a Queue Using Stacks
Problem: Design a queue using two stacks such that enqueue and dequeue operations are performed efficiently.
Hint: Use one stack for enqueue and another stack for dequeue. Transfer elements between stacks as needed.

 */
package StackQueue;
import java.util.Stack;
import java.util.Scanner;
public class QueueUsingStacks {
    Stack<Integer>stack1=new Stack<>();
    Stack<Integer>stack2=new Stack<>();

    //Enqueue: add an element to the queue
    void enqueue(int data){
        stack1.push(data);
        System.out.println(data + " inserted into queue");
    }
    //Dequeue: remove the front element
    int dequeue(){
        if(stack1.isEmpty() && stack2.isEmpty()){
            System.out.println("Queue is empty");
            return-1;
        }
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
    //display the front element
    void peek(){
        if(stack1.isEmpty() && stack2.isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        if(!stack2.isEmpty()){
            System.out.println("Front element: " + stack2.peek());
        }
        else{
            System.out.println("Front element: " + stack1.firstElement());
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        QueueUsingStacks q=new QueueUsingStacks();

        while(true){
            System.out.println("\n1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element: ");
                    int data = sc.nextInt();
                    q.enqueue(data);
                    break;

                case 2:
                    int removed = q.dequeue();
                    if (removed != -1) {
                        System.out.println("Removed element: " + removed);
                    }
                    break;

                case 3:
                    q.peek();
                    break;

                case 4:
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
