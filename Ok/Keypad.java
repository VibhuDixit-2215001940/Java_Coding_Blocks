import java.util.List;

public class Keypad {
    static String[] key = { "", "abc", "def", "ghi", "jkl", "mno", "pqr", "stuv", "wx", "yz" };
    static int count = 0;
    public static void main(String[] args) {
        String str = "12";
        ok(str,"");
        System.out.println();
        System.out.println(count);
    }
    public static void ok(String str,String ans){
        if(str.length()==0){
            System.out.print(ans+" ");
            count++;
            return ;
        }
        char x = str.charAt(0);
        String press = key[x - '0'];
        for(int i = 0; i < press.length(); i++){
            ok(str.substring(1),ans+press.charAt(i));
        }
    }
}
