import java.util.Scanner;

public class Do_while2 {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        do{
            System.out.print("enter the value of n :");
            int n=sc.nextInt();
            if(n%10==0){
                continue;
            }
            System.out.println("you print :"+n);
        }while(true);
    }
}
