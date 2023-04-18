import java.util.*;
public class Question1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print(" enter a :");
        int a=sc.nextInt();

        if(a>0)
        System.out.println(a+" posative:");

        else{
            System.out.println(a+" negative");
        }
    }
}
