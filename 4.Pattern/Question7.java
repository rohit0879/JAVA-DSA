import java.util.*;
public class Question3
{
    public static void main(String args[]){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int number=1;number<=n-i+1;number++){
                System.out.print(number);
            }
            System.out.println();
        }
    }
}