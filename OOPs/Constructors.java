
public class Constructors {
    public static void main(String args[]){
        Student s = new Student("Rohit");
        System.out.println(s.name);
    }
}
class Student{
    String name;
    int roll;
    Student(String name){   // Parameterised constractor
        this.name=name;
    }
}