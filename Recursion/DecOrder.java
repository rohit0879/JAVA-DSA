import java.util.*;
public class DecOrder{
    public static void printdec(int n){
       if(n==0){
        return ;
       }
       System.out.print(n+" ");
       printdec(n-1);
    }
    public static void main(String arg[]){
        int n=10;
        printdec(n);
    }
}