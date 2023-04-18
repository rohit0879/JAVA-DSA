import java.util.*;
public class Question3{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the factorial number :");
        int n=sc.nextInt();
        int i=1;
        int fact=1;
        
        while(i<=n){
            
            fact*=i;
            i++;
             
        }
        System.out.println("factorial :"+fact); 
       
    }
}
