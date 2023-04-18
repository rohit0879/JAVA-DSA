import java.util.*;
public class Question2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print(" enter your tempeture :");
        double a=sc.nextInt();

        if(a>100)
        System.out.println(" You have a fever");

        else{
            System.out.println(" you have not fever");
        }
    }
}