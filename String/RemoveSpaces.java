/*
Problem:
Remove all spaces from a string.

Example:
Input:  "hello world"
Output: "helloworld"

Time Complexity: O(n)
Space Complexity: O(n)
*/

public class RemoveSpaces {

    static String removeSpaces(String str) {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                result.append(str.charAt(i));
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {

        String str = "hello world";
        System.out.println(removeSpaces(str));
    }
}
