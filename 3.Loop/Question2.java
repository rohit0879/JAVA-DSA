import java.util.*;
public class Question2
{
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.print("enter the number:");
    int n=sc.nextInt();
    int even_sum=0;
    int odd_sum=0;
    for(int i=1;i<=n;i++){
        if(i%2==0){ 
        even_sum+=i;
        System.out.println("even_sum:"+even_sum);
        } 
        else{
            odd_sum+=i;
            System.out.println("odd_sum:"+odd_sum);
        }    
    }
  }
} 
