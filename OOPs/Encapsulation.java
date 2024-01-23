public class Encapsulation {
    public static void main(String args[]){
        Student sc=new Student("rohit kumar");
        System.out.println(sc.Name);
    }
}
class Student{
    String Name;
    int Roll;
    Student(String Name){
        this.Name=Name;
    }
}