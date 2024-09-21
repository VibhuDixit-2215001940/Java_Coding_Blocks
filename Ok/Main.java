import java.util.*;
public class Main{
	public static void main(String[] args) {
	    String s = "yes";
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    for(int i=0;i<t;i++){
	        String str = sc.next();
	        str = str.toLowerCase();
	        System.out.println((s.equals(str))?"YES":"NO");
	    }
	}
}
