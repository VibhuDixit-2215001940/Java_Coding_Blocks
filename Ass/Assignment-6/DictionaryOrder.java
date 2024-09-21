import java.util.*;
public class DictionaryOrder {
    static List<String> ll = new ArrayList<String>();      //MAKE ARRAYLIST
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);        //SCANNER DEFINING
        String str = sc.next();                     //INPUT
        ok(str, str, "");                       //F( ) CALLING
        Collections.sort(ll);                       //SORT ARRAYLIST
        for (int i = 0; i < ll.size(); i++) {       //PRINTING THE ARRAYLIST
            System.out.println(ll.get(i));
        }
    }
    public static void ok(String str, String rest, String ans) {
        if (rest.length() == 0) {
            boolean flag = false;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) > ans.charAt(i)) {
                    break;
                }
                if (str.charAt(i) < ans.charAt(i)) {
                    flag = true;
                    ll.add(ans);
                    break;
                }
            }
            return;
        }
        for (int i = 0; i < rest.length(); i++) {
            String part1 = rest.substring(0, i);
            String part2 = rest.substring(i + 1);
            ok(str, part1 + part2, ans + rest.charAt(i));
        }
    }
}