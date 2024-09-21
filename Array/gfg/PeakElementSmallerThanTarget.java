//Find a peak element which is not smaller than its neighbours
import java.util.Scanner;

public class PeakElementSmallerThanTarget{
    static int findPeak(int arr[], int n) {         
        if (n == 1) // First or last element is peak element 
            return 0; 
        if (arr[0] >= arr[1]) 
            return 0; 
        if (arr[n - 1] >= arr[n - 2]) 
            return n - 1; 
        for (int i = 1; i < n - 1; i++) { // Check for every other element
            if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1]) // Check if the neighbors are smaller
                return i; 
        } 
        return 0; 
    } 
    public static void main(String[] args) { 
        int arr[] = { 1, 3, 20, 4, 1, 0 }; 
        int n = arr.length; 
        System.out.print("Index of a peak point is " + findPeak(arr, n)); 
    } 
}