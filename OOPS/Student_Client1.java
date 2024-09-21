public class Student_Client1 {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        Student1 s2 = new Student1("Kaju",20);
        //new Student1(); isse heap memory mai Student() class ka data aa jayega 
        System.out.println(s2.getName());
        s2.setAge(90);
        System.out.println(s2.getAge());
    }
}
