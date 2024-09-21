import java.util.Scanner;

public class Equals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "Tony";
        String str1 = "Tony";
        String str2 = new String("Tony");
        if(str == str1){
            System.out.println("Equal!!");
        }
        else{
            System.out.println("Not equal!!");
        }
        if(str.equals(str2)){
            System.out.println("Equal!!");
        }
        else{
            System.out.println("Not equal!!");
        }
    }
}
