import java.util.Scanner;
public class SwitchCase{
    public static void main(String[] args) {
        //To prevent execution of every case we use break statement
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch(a){
            case 1: System.out.println("Samosa");break;
            case 2: System.out.println("Burger");break;
            case 3: System.out.println("Mango shake");break;
            default: System.out.println("Kuch bhi");
        }
    }
}