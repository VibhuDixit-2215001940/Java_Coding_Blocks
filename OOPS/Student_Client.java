public class Student_Client {
    public static void main(String[] args) {
        String name;
        int age;
    
        public void Intro_yourSelf() {
    
            System.out.println("My Name is " + this.name + " and age is " + this.age);
    
        }
    
        public void SayHey(String name) {
            System.out.println(name + " say hey to " + this.name);
        }
    
        public static void fun() {
            System.out.println("hey say");
        }
        public static void main(String[] args) {
            // TODO Auto-generated method stub
            Student s = new Student();
            System.out.println(s.name);
            System.out.println(s.age);
            s.name = "kaju";
            s.age = 16;
            s.Intro_yourSelf();
            Student s1 = new Student();
            s1.name = "Kamlesh";
            s1.age = 18;
            s1.Intro_yourSelf();
            s1.SayHey("raju");
            Student.fun();
    
        }
}
//OBJECT --> Instance of class.
//CLASS --> blueprint
//What is this keyword in java? 
//static independent 
