/*
ARRAY BASICS IN JAVA

This file covers:
1. What is an array
2. Declaration & Initialization
3. Accessing elements
4. Updating elements
5. Traversing an array
6. Array length
7. Reverse an array
8. Find max & min
9. Check if array is sorted
*/

public class ArrayBasics {

    public static void main(String[] args) {

        // --------------------------------------------------
        // 1️⃣ DECLARING AN ARRAY
        // --------------------------------------------------
        // Syntax: dataType[] arrayName;
        int[] arr;

        // --------------------------------------------------
        // 2️⃣ INITIALIZING AN ARRAY
        // --------------------------------------------------
        // Method 1: Direct initialization
        arr = new int[]{10, 20, 30, 40, 50};

        // Method 2: Declaration + initialization together
        int[] arr2 = {5, 15, 25, 35};

        // --------------------------------------------------
        // 3️⃣ ACCESSING ARRAY ELEMENTS
        // --------------------------------------------------
        System.out.println("First element: " + arr[0]);
        System.out.println("Last element: " + arr[arr.length - 1]);

        // --------------------------------------------------
        // 4️⃣ UPDATING ARRAY ELEMENT
        // --------------------------------------------------
        arr[1] = 99; // changing value at index 1
        System.out.println("Updated second element: " + arr[1]);

        // --------------------------------------------------
        // 5️⃣ ARRAY LENGTH
        // --------------------------------------------------
        System.out.println("Length of array: " + arr.length);

        // --------------------------------------------------
        // 6️⃣ TRAVERSING ARRAY (Using for loop)
        // --------------------------------------------------
        System.out.print("Array elements: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // --------------------------------------------------
        // 7️⃣ REVERSING AN ARRAY
        // --------------------------------------------------
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        System.out.print("Reversed array: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();

        // --------------------------------------------------
        // 8️⃣ FIND MAXIMUM AND MINIMUM
        // --------------------------------------------------
        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);

        // --------------------------------------------------
        // 9️⃣ CHECK IF ARRAY IS SORTED (ASCENDING)
        // --------------------------------------------------
        boolean isSorted = true;

        for (int i = 1; i < arr2.length; i++) {
            if (arr2[i] < arr2[i - 1]) {
                isSorted = false;
                break;
            }
        }

        System.out.println("Is arr2 sorted? " + isSorted);
    }
}
