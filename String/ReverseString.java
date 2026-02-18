/*
Problem:
Reverse a given string.

Example:
Input:  "hello"
Output: "olleh"

Approach:
Convert string to char array and swap characters.

Time Complexity: O(n)
Space Complexity: O(n)
*/

public class ReverseString {

    static String reverse(String str) {
        char[] arr = str.toCharArray();
        int start = 0, end = arr.length - 1;

        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        String str = "hello";
        System.out.println(reverse(str));
    }
}
