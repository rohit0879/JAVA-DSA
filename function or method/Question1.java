import java.util.*;
public class Question1{
    public static void sum(int a,int b,int c){
       int sum=a+b+c;
       int avg=sum/3;
       System.out.println("avergae = "+avg);

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter value a:");
        int a=sc.nextInt();
        System.out.print("enter value b:");
        int b=sc.nextInt();
        System.out.print("enter value c:");
        int c=sc.nextInt();
        sum(a,b,c);
    }
}