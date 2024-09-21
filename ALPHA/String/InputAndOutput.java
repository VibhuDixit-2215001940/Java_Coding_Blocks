import java.util.Scanner;

public class InputAndOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();//Takes only one word
        String str1 = sc.nextLine();//Can take lines also 
        System.out.println(str);
        System.out.println(str1);
    }
}
