import java.util.Scanner;

public class RotateArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:- ");
        int m = sc.nextInt();
        int arr[] = new int[m];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        } 
        System.out.print("Enter the times to rotate: ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){  
            int j, last;  
            last = arr[arr.length-1];  //Stores the last element of array 
            for(j = arr.length-1; j > 0; j--){  
                arr[j] = arr[j-1]; //Shift element of array by one  
            }  
            arr[0] = last; //Last element of array will be added to the start of array.  
        }  
        System.out.print("Array after right rotation: "); //Displays resulting array after rotation  
        for(int i = 0; i< arr.length; i++){  
            System.out.print(arr[i] + " ");  
        }  
    }
}
