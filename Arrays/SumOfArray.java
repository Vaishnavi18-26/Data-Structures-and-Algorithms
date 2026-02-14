/*
Problem:
Find the sum of all elements in an array.

Example:
Input:  [2, 4, 6, 8]
Output: 20

Approach:
Traverse the array and add each element to sum.

Time Complexity: O(n)
Space Complexity: O(1)
*/

public class SumOfArray {

    static int findSum(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8};
        System.out.println("Sum = " + findSum(arr));
    }
}
