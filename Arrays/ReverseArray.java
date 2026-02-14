/*
Problem:
Reverse a given array.

Example:
Input:  [1, 2, 3, 4, 5]
Output: [5, 4, 3, 2, 1]

Approach:
- Use two pointers
- One at start, one at end
- Swap elements while start < end

Time Complexity: O(n)
Space Complexity: O(1)
*/

public class ReverseArray {

    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // swap elements
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        reverse(arr);

        System.out.print("Reversed array: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
