import java.lang.*;
import java.util.Scanner;
public class Question2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the side of square :");
        int side=sc.nextInt();
        int area=side*side;
        System.out.println("area of square is :"+area);
    }
}