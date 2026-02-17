/*
Problem:
Rotate array left by one position.

Example:
Input:  [1, 2, 3, 4]
Output: [2, 3, 4, 1]

Approach:
Store first element, shift left, place first at end.

Time Complexity: O(n)
Space Complexity: O(1)
*/

public class RotateArray {

    static void rotateLeftByOne(int[] arr) {
        int first = arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = first;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        rotateLeftByOne(arr);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
