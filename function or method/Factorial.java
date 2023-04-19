import java.util.*;
public class Factorial{
    public static int fact(int a)
    {
      int f=1;
      for(int i=1;i<=a;i++){
        f*=i;
      }
        return f;
      
    }
    public static void main (String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.print("value of a :");
      int a=sc.nextInt();
      int factorial=fact(a); 
      System.out.println("factorial is :"+factorial );
    }
}
