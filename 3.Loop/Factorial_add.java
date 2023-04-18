import java.util.Scanner;

public class Factorial_add {
    public static void main(String arg[]){
        Scanner s= new Scanner(System.in);
        System.out.println("enter the range :");
        int range=s.nextInt();
        int i=1;
        int sum=0;
        int product=1;

        while(i<=range){
            sum+=i;
            product*=i;
            i++;

        }
        System.out.println("sum of factorial is :"+sum);
        System.out.println("product of factorial is :"+product);
    }

}
