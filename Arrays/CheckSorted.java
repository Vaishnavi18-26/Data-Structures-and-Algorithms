/*
Problem:
Check whether an array is sorted in ascending order.

Example:
Input:  [1, 2, 3, 4]
Output: true

Approach:
Compare adjacent elements.

Time Complexity: O(n)
Space Complexity: O(1)
*/

public class CheckSorted {

    static boolean isSorted(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};
        System.out.println(isSorted(arr));
    }
}
