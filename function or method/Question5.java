import java.util.*;
public class Question5{
public static void num(int n){
 int lastnum;
 int sum=0;
 while(n>0){
    lastnum=n%10;
    n=n/10;
    sum=sum+lastnum;
   
 }
 System.out.print(sum);
}
    public static void main(String args[]){
        num(123);
    }
}
