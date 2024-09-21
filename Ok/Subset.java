public class Subset {
    public static void main(String[] args) {
        String str = "abc";
        ok(str,"");
    }
    public static void ok(String str,String s){
        if(str.isEmpty()){
            System.out.println(s);
            return;
        }
        char x = str.charAt(0);
        ok(str.substring(1),s+x);
        ok(str.substring(1),s);
    }
}
