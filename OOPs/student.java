import java.util.*;
public class student { 
    String  name;
    int roll;
    student(String str,int r){
       name=str;
       roll=r;
    }

    student(student ref){
        name=ref.name;
        roll=ref.roll;
    }
   
    void display(){
        System.out.println(name+" "+roll);
    }


public static void main(String args[]){
    student s1 = new student("rohit",2270282);
    student s2 = new student(s1);
    s1.display();
  }
}  


