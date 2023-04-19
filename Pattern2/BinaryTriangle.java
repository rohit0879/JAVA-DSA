import java.util.*;
public class BinaryTriangle{
    public static void Btangle(int n){
        //outer loop
        for(int i=1;i<=n;i++){
          //inner loop
          for(int j=1;j<=i;j++){
            int p=i+j;
            if(p%2==0){
                System.out.print("1");
            }
            else{
                System.out.print("0");
            }
          }
          System.out.println(); 
        }  
    }
    public static void main(String args[]){
       Btangle(5);
    }
}
