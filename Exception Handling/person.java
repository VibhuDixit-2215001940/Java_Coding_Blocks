public class person {
    private String name = "Vibhu";
    private int age = 20;
    //Constructor is just like a method which initialize class data members.
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    // public void setAge(int age) throws Exception{
    //     if(age<0) {
    //         throw new Exception("Age must be positive");
    //     }
    //     this.age = age;
    // }
    public void setAge(int age) throws Exception{
        try{
            if(age<0 || age>100) {
                throw new Exception("Age must be positive");
            }
            this.age = age;
        }
        catch(Exception e){
            e.printStackTrace();//This method prints a stack trace for this Throwable object 
        }
        finally {
            System.out.println  ("Age="+this.age);
        }
    }
    //throw --> exception generation is done by this keyword
    //throws --> it tells may be exception may happen, means tells signature code
}
