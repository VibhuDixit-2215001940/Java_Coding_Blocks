public class Day5 {
    public static void main(String[] args) {
        //How to store floating no.?

        // float f = 10.5;     //Error as default data type is double
        float f = 10.5f;
        System.out.println(f);
        System.out.println(((Object)f).getClass().getSimpleName());//Float

        double db = 10.5;
        System.out.println(db);
        System.out.println(((Object)db).getClass().getSimpleName());//Double
    }
}
