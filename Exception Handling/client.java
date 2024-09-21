//Error can't be recover
//Exception can be handle using try & catch

//Error is an ibuilt class in lang package
public class client {
    // public static void main(String[] args) throws Exception{
    //     person p = new person();
    //     p.setAge(-1);
    //     System.out.println(p.getName()+" "+p.getAge());
    // }
    public static void main(String[] args) throws Exception{
            person p = new person();
            p.setAge(10);
            System.out.println(p.getName()+" "+p.getAge());
        }
}
