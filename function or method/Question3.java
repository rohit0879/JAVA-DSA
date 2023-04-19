import java.util.*;
public class Question3{
    public static void palindrome(int n){
        int sum=0;
        while(n>0){
            int LD=n%10;
            sum=sum*10+LD;
            n=n/10;
        }
        System.out.print(sum);
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        palindrome(n);
    }
}
