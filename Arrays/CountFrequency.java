/*
Problem:
Count frequency of each element in an array.

Example:
Input:  [1, 2, 2, 3, 1]
Output:
1 -> 2
2 -> 2
3 -> 1

Approach:
Use a frequency array (for small range values).

Time Complexity: O(n)
Space Complexity: O(n)
*/

public class CountFrequency {

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1};
        boolean[] visited = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (visited[i]) continue;

            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " -> " + count);
        }
    }
}
