import java.util.*;
public class Product{
    public static int product(int a,int b){
       int prodt=a*b;
       return prodt;
    }
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("value of a :");
        int a=sc.nextInt();
        System.out.print("value of b:");
        int b=sc.nextInt();

        int multiply=product(a,b);
        System.out.println("a * b ="+multiply);

         multiply=product(10,5);
        System.out.println("a * b ="+multiply);
    }
}