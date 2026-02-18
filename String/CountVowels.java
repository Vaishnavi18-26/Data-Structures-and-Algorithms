/*
Problem:
Count number of vowels in a string.

Example:
Input:  "education"
Output: 5

Approach:
Traverse string and check for vowels.

Time Complexity: O(n)
Space Complexity: O(1)
*/

public class CountVowels {

    static int countVowels(String str) {
        int count = 0;
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "education";
        System.out.println(countVowels(str));
    }
}
