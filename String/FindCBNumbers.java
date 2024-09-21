import java.util.Scanner;

public class FindCBNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
        Iscbnumber(n);
        sc.close();
    }
    public static boolean Iscbnumber(long num){
        if(num == 0 || num == 1){
            return false;
        }
        int[] arr = {2,3,5,7,11,13,17,19,23,29};
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                return true;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(num%arr[i]==0){
                return false;
            }
        }
        
        return true;
    }
}
// Deepak and Gautam are having a discussion on a new type of number that they call Coding Blocks Number or CB Number. They use following criteria to define a CB Number.
// 1. 0 and 1 are not a CB number.
// 2. 2,3,5,7,11,13,17,19,23,29 are CB numbers.
// 3. Any number not divisible by the numbers in point 2( Given above) are also CB numbers.
// Deepak said he loved CB numbers.Hearing it, Gautam throws a challenge to him.
// Gautam will give Deepak a string of digits. Deepak's task is to find the number of CB numbers in the string.

// Input
// 5
// 81615
// Output
// 2
// Explanation
// 61 and 5 are two CB numbers.