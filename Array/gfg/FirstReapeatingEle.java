//Find the first repeating element in an array of integers

// import java.util.Arrays;
import java.util.Scanner;

public class FirstReapeatingEle {
    public static int firstRepeatingElement(int[] arr, int n) {
        for (int i = 0; i < n; i++) {// Nested loop to check for repeating elements
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {// If a repeating element is found, return its index
                    return i;
                }
            }
        }
        return -1;// If no repeating element is found, return -1
    }
    public static void main(String[] args) {
        int[] arr = { 10, 5, 3, 4, 3, 5, 6 };// Initializing an array and its size
        int n = arr.length;
        int index = firstRepeatingElement(arr, n);// Finding the index of first repeating element
        if (index == -1) {// Checking if any repeating element is found or not
            System.out.println("No repeating element found!");
        }
        else {// Printing the first repeating element and its index
            System.out.println("First repeating element is " + arr[index]);
        }
    }
}
// Input: arr[] = {10, 5, 3, 4, 3, 5, 6}
// Output: 5 
// Explanation: 5 is the first element that repeats

// Input: arr[] = {6, 10, 5, 4, 9, 120, 4, 6, 10}
// Output: 6 
// Explanation: 6 is the first element that repeats