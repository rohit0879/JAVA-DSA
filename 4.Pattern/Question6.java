import java.util.*;
public class Question4
{
    public static void main(String args[]){
        int n=5;
        int p=1;
        for(int i=1;i<=n;i++){
            for(int number=1;number<=i;number++){
                System.out.print( p );
                p++;
            }
            System.out.println();
        }
    }
}
