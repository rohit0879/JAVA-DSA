import java.util.*;
public class Binary
{
    public static void bintoDec(int n){
      int myNum=n;
        int pow=0;
        int dec=0;
        while(n>0){
        int LD=n%10;
        dec=dec+(LD*(int)Math.pow(2,pow));
        pow++;
        n=n/10;
      }
      System.out.println("decimal of "+myNum+"="+dec);
      
    }
    public static void main(String args[]){
    bintoDec(11);
    }
}
