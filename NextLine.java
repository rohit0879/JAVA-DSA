import java.util.*;
public class NextLine{ 
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter the name:");
    String str=sc.nextLine();   // next print only one word but nextLine print a sentance
    System.out.println("your name is :"+str);
    System.out.print("Length of your name is :"+str.length());
}
}