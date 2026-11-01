/*
Sliding Window Maximum
Problem: Given an array and a window size k, find the maximum element in each sliding window of size k.
Hint: Use a deque (double-ended queue) to maintain indices of useful elements in each window.
 */
package StackQueue;

import java.util.*;

public class SlidingWindowMaximum {

    void findMaximum(int arr[], int k) {

        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 0; i < arr.length; i++) {

            // Remove indices outside the current window
            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.removeFirst();
            }

            // Remove smaller elements from the back
            while (!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]) {
                dq.removeLast();
            }

            // Add current index
            dq.addLast(i);

            // Print maximum when the window is complete
            if (i >= k - 1) {
                System.out.print(arr[dq.peekFirst()] + " ");
            }
        }
    }

    public static void main(String[] args) {

        SlidingWindowMaximum obj = new SlidingWindowMaximum();

        int arr[] = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        obj.findMaximum(arr, k);
    }
}
