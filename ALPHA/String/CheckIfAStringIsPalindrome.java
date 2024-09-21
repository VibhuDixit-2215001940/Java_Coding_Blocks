import java.util.Scanner;

public class CheckIfAStringIsPalindrome {
    public static void isPalindrome(String str){
        for(int i=0;i<str.length();i++){
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-i-1)){
                System.out.println("Not Palindrome!!");
                break;
            }
        }
        System.out.println("Palindrome!!");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        isPalindrome(str);
    }
}
