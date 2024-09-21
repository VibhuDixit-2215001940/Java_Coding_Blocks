import java.util.Scanner;

public class CountFrequencyOfElementInAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:- ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count = 0;
        System.out.println("Enter the element to search:- ");
        int x = sc.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i] == x){
                count++;
            }
        }
        if(count>0){
            System.out.println("Present!!"+count);
        }
        else{System.out.println("Not Present!!");}
    }
}
