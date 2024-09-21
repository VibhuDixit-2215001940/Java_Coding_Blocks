//Given an integer array nums, find the subarray with the largest sum, and return its sum.

import java.util.Scanner;

public class MaximumSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int max1 = 0;  
        for(int i=0; i<n; i++){  
            int sum1=0;  
            for (int j=i; j<n;j++){  
                sum1 = sum1+arr[j];
                if(sum1>max1){  
                    max1 = sum1;  
                } 
            }    
        }
        System.out.println(max1);
    }
}