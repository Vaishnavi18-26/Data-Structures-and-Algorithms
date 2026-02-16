/*
Problem:
Find the maximum and minimum element in an array.

Example:
Input:  [7, 2, 9, 4]
Output: Max = 9, Min = 2

Approach:
Traverse the array and update max and min.

Time Complexity: O(n)
Space Complexity: O(1)
*/

public class MaxMinElement {

    static void findMaxMin(int[] arr) {

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
    }

    public static void main(String[] args) {

        int[] arr = {7, 2, 9, 4};
        findMaxMin(arr);
    }
}
