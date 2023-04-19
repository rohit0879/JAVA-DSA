import java.util.*;
public class Prime{
    public static boolean isprime(int n){
        boolean isprime=true;
        for(int i=2;i<n;i++){
            if(n%i==0){

                isprime=false;
                break;
            }
        }
        return isprime;
    } 
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number for prime :");
        int n=sc.nextInt();
        System.out.println(isprime(n));
    }
}
