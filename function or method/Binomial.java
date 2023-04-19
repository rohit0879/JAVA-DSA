import java.util.*;
public class Binomial{
    public static int fact(int a)
    {
      int f=1;
      for(int i=1;i<=a;i++){
        f*=i;
      }
        return f;
      
    }
    public static float bioCoff(int n,int r){
        int fact_n=fact(n);
        int fact_r=fact(r);
        int fact_d=fact(n-r);
        int deno=(fact_r*fact_d);

        int bioCoff=fact_n /deno;
        return bioCoff;
    }
    public static void main (String args[]){
    
      System.out.println(bioCoff(5,2) );
    }
}
