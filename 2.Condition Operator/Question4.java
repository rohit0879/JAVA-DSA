import java.util.*;
public class Question4
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the year for leap year :");
        int year=sc.nextInt();
        if((year%4==0) && (year%100==0) && (year%400==0))
        {
          System.out.print("leap year");
        }
        else{
            System.out.println("not leap year");
        }
    }
}