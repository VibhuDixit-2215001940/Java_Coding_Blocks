public class Day04{
    public static void main(String[] args) {
        // DATA TYPES
        // 1.Primitive Data Type(8)
        //     a.byte b.short c.int d.long
        //     a.float b.double
        //     a.char
        //     a.boolean
        // int z = 045;//0 represents it is a octal no
        // System.out.println(z);//37          4*8+5
        // char ch = 'A';
        // System.out.println((int)ch);//65
        // ch++; ch = (char)(ch+1)
        // System.out.println(ch++);//A
        // System.out.println(ch);//B
        // ch = ch + 1;//as 16 bit is added with 32 thats why error is given
        for(byte i = 0;i<127;i++){  //INFINITE LOOP as no. from 128 is typcast by byte i = (byte)i
            System.out.println(i);
        }
    }
}