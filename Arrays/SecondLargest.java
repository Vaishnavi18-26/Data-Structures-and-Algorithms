/*
Problem:
Find the second largest element in an array.

Example:
Input:  [10, 5, 20, 8]
Output: 10

Approach:
Track largest and second largest while traversing.

Time Complexity: O(n)
Space Complexity: O(1)
*/

public class SecondLargest {

    static int findSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int x : arr) {
            if (x > largest) {
                secondLargest = largest;
                largest = x;
            } else if (x > secondLargest && x != largest) {
                secondLargest = x;
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8};
        System.out.println(findSecondLargest(arr));
    }
}
