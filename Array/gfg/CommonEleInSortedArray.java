//Find common elements in three sorted arrays

import java.util.Arrays;

public class CommonEleInSortedArray {
    public static void main(String[] args) {
        int[] a = {1, 5, 10, 20, 40, 80};
        int[] b = {6, 7, 20, 80, 100};
        int[] c = {3, 4, 15, 20, 30, 70, 80, 120};
        int size = a.length+b.length+c.length;
        int[] add = new int[size];
        for(int i=0;i<a.length;i++){
            add[i] = a[i];
        }
        for(int i=0;i<(b.length);i++){
            add[a.length+i] = b[i];
        }
        for(int i=0;i<c.length;i++){
            add[a.length+b.length+i] = c[i];
        }
        System.out.println(Arrays.toString(add));//THREE ARRAYS COMPRISED IN SINGLE ARRAY
        int count = 0;
        int[] ok = new int[10];
        for(int i=0;i<size;i++){
            int x = size-1;
            while(i<x){
                if(add[i]==add[x]){
                    count++;
                    x--;
                    i++;
                }
                else{
                    x--;
                }
            }
        }
        if(count>=3){
            System.out.println("Yes!!");
        }
        else{
            System.out.println("NO!!");
        }
    }
}
// Input: 
// ar1[] = {1, 5, 10, 20, 40, 80} 
// ar2[] = {6, 7, 20, 80, 100} 
// ar3[] = {3, 4, 15, 20, 30, 70, 80, 120} 
// Output: 20, 80

// Input: 
// ar1[] = {1, 5, 5} 
// ar2[] = {3, 4, 5, 5, 10} 
// ar3[] = {5, 5, 10, 20} 
// Output: 5, 5
