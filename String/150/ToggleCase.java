import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] chara = str.toCharArray();
        for(int i=0;i<chara.length;i++){
            char flag = chara[i];
            if(Character.isLowerCase(flag)){
                chara[i] = Character.toUpperCase(flag);
            }
            else{
                chara[i] = Character.toLowerCase(flag);
            }
        }
        System.out.println(chara);
    }
}
