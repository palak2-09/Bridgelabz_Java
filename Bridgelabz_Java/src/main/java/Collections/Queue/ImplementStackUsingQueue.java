package Collections.Queue;
import java.util.*;
public class ImplementStackUsingQueue {

    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    void push(int x) {
        q2.add(x);

        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }

        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    int pop() {
        if (q1.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }

        return q1.remove();
    }

    int top() {
        if (q1.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }

        return q1.peek();
    }

    public static void main(String[] args) {

        ImplementStackUsingQueue obj = new ImplementStackUsingQueue();

        obj.push(1);
        obj.push(2);
        obj.push(3);

        System.out.println("Top: " + obj.top());

        System.out.println("Pop: " + obj.pop());

        System.out.println("Top after pop: " + obj.top());
    }
}


