/*
Problem:
Search an element in an array using Linear Search.

Example:
Input:  [10, 20, 30, 40], key = 30
Output: Element found at index 2

Approach:
Traverse the array and compare each element with the key.

Time Complexity: O(n)
Space Complexity: O(1)
*/

public class LinearSearch {

    static int linearSearch(int[] arr, int key) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40};
        int key = 30;

        int index = linearSearch(arr, key);

        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}
