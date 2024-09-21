public class InsertChar {
    public static void main(String[] args) {
        String str = "Hello World";
        char c = 'C';
        int pos = 5;
        StringBuffer stringBuffer = new StringBuffer(str);
        stringBuffer.insert(pos, c);
        System.out.println(stringBuffer);//HelloC World
    }
}
