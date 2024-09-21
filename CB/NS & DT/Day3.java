public class Day3 {
    public static void main(String[] args) {
        byte b = 10;
        short sh = 20;
        int in = 30;
        long ln = 40;

        //WRONG ASSIGNMENT
        b = sh;
        b = in;
        b = ln;

        sh = in
        sh = ln;

        in = ln;

        //RIGHT ASSIGNMENT
        sh = b;

        in = b;
        in = sh;

        ln = b;
        ln = sh;
        ln = in;

    }
}
