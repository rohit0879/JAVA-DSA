import java.util.*;
public class Decimal{
    public static void DecToBin(int n){
        int bnr=n;
        int pow=0;
        int bin=0;
        while(n>0){
            int rem=n%2;
            bin=bin+rem*(int)Math.pow(10,pow);
            pow++;
            n=n/2;
        }
        System.out.println("binary from of "+bnr+"="+bin);
    }
    public static void main(String args[]){
        DecToBin(6);
    }
}
