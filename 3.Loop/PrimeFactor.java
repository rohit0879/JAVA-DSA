import java.util.*;
public class PrimeFactor {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your number : ");
        int n = sc.nextInt();
        for(int i = 2 ; i< n; i++){
            while(n % i == 0){
                System.out.print(i+" ");
                 n = n/i;
            }
        }
        if(n >=2) {
            System.out.print(n+" ");
         }
    }
}
