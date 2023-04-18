import java.util.*;

public class Question3
 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("amount  of pencil:");
        float pencil=sc.nextFloat();
        System.out.print("amount  of pen:");
        float pen=sc.nextFloat();
        System.out.print("amount  of eraser:");
        float eraser=sc.nextFloat();
        float amount=pencil+pen+eraser;
        System.out.println("amount of items :"+amount);
        
        float GST=amount*0.18f;
        float Bill=amount+GST;
        System.out.print("Total amount of items with GST  is :"+Bill);

    }

}
