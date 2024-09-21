//Given an array of integers and an integer target, return indices of the two numbers such that they add up to target

import java.util.Scanner;

public class TwoSum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        for(int i=0;i<n;i++){
            int d = n-1;
            int index1=0,index2=0;
            while(i<d){
                int c = arr[i]+arr[d];
                if(c==target){
                    index1 = i;index2=d;
                    System.out.print("["+index1+","+index2+"]");
                    d--;i++;
                }
                else{
                    d--;
                }
            }
        }
    }
}