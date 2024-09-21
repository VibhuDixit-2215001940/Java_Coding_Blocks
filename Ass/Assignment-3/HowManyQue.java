import java.util.Scanner;

public class HowManyQue {
     public static void main(String args[]) {
        int n, condition1, condition2, condition3, count = 0;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for(int i = 0; i < n; i++) {
            condition1 = scanner.nextInt();
            condition2 = scanner.nextInt();
            condition3 = scanner.nextInt();
            if((condition1 == 1 && condition2 == 1) || 
               (condition1 == 1 && condition3 == 1) || 
               (condition2 == 1 && condition3 == 1)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
