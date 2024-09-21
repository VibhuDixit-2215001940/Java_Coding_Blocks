import java.util.Scanner;

public class SumOfFirst_LastElementAndSoOnInArray {
    public static void main(String[] args) {
        // int[] array = {1, 3, 6, 4, 1, 8};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:- ");
        int n = sc.nextInt();
        int array[] = new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        for(int i = 0; i < array.length / 2; i++) {  
            int firstNumber = array[i];
            int secondNumber = array[array.length - 1 - i]; 
            int sum = firstNumber + secondNumber;
            System.out.println(firstNumber + " + " + secondNumber + " = " + sum);
        }    
    }
}
