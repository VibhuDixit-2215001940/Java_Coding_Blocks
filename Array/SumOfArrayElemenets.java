import java.util.Scanner;

public class SumOfArrayElemenets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of array:- ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
        System.out.print("Enter the value of index ");
        arr[i]=sc.nextInt();
    }
    int sum = 0;
    for(int j:arr){
        sum +=j;
    }
    System.out.print("The sum of given array elemnet is: "+sum);
    }
}
