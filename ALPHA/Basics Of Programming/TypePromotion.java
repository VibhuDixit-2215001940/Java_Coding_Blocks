public class TypePromotion {
    public static void main(String[] args) {
        //Java automaticlly promotes each byte,short,or char operand to int when evaluating an expression.
        // char a = 'a';
        // char b = 'b';
        // System.out.println((int)(b));//98
        // System.out.println((int)a);//97
        // System.out.println(b-a);//1
        // short a= 5;
        // byte b = 25;
        // char c = 'c';
        // byte z = (byte)(a+b+c);//-127
        // System.out.println(z);
        // int a = 10;
        // float b = 20.25f;
        // long c = 30;
        // double d = 25;
        // double ans = a+b+c+d;//Now here compiler sees double as largest preferable thus convert all to double.
        // System.out.println(ans);
        // // 85.25

        //NOTE!!
        //Whenever we use small datatypes like byte in some expression then java automatically convert that into int;
        byte b = 5;
        byte a =(byte)( b * 2);
        //We have to typecast it  to byte even though it can be liable .
        System.out.println(a);//10

    }
}
