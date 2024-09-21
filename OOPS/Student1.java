public class Student1 {
    private String name = "Vibhu";
    private int age = 20;
    //Constructor is just like a method which initialize class data members.
    //It has no return type.
    //Its name is same as class name 
    //In program sabse pahele constructor nahi chalta 
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return this.age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public Student1(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //Constructor
    public Student1(){

    }
}
