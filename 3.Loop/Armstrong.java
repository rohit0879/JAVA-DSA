import java.util.*;
public class Armstrong {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value :");
        int n = sc.nextInt();
        int sum = 0;
         
        int s=0;
        int digit = 0;
        while(n!=0){
             int last = n % 10;
             s = s*10 + last;
             n=n/10;
             digit++;
        }
        System.out.println("digit "+digit);
        while(s!=0){
            int last = s % 10;
            sum += (Math.pow(last, digit));
            s /=10;
        }
        System.out.println("sum "+sum);

        if(sum == n)
               System.out.println("Armstrong");
    
        else
              System.out.println("Not armstrong");
        
    }
}
