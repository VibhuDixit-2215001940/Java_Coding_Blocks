//Rearrange array in alternating positive & negative items with O(1) extra space 

import java.util.Arrays;

public class AlternatePositiveNegativeEle {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, -4, -1, 4};
        int[] neg = new int[arr.length];
        int[] pos = new int[arr.length];
        for(int i=0;i<arr.length;i++){          //SEPARATING POSTIVE NO. AND NEGATIVE NO.
            if(arr[i]<0){
                neg[i] = arr[i];
            }
            else{
                pos[i] = arr[i];
            }
        }
        int [] neg1 = Remove(neg);
        int [] pos1 = Remove(pos);
        // for(int i=0;i<(neg1.length+pos1.length);i++){
        //     if(i%2==0){
        //         System.out.print(pos1[i]+" ");
        //     }
        //     else{
        //     System.out.print(neg1[i]+" ");
        //     }
        // }
    }
    public static int[] Remove(int[] x){        //FUNCTION TO REMOVE ZEROS FROM NEW ARRAYS
        int len = 0;
        for (int i=0; i<x.length; i++){
            if (x[i] != 0)
                len++;
        }
        int [] newArray = new int[len];
        for (int i=0, j=0; i<x.length; i++){
            if (x[i] != 0) {
                newArray[j] = x[i];
                j++;
            }
        }
        return newArray;
    }
}
// Input:  arr[] = {1, 2, 3, -4, -1, 4}
// Output: arr[] = {-4, 1, -1, 2, 3, 4}

// Input:  arr[] = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8}
// Output: arr[] = {-5, 5, -2, 2, -8, 4, 7, 1, 8, 0}
