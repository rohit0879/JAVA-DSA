import java.util.*;
public class Range_print
{ 
   public static void main(String args[])
    {
      Scanner sc= new Scanner(System.in);
      System.out.print("enter base number :");
      int base=sc.nextInt();

      System.out.print("To range :");
      int range=sc.nextInt();

       while(base<=range)
       {
        System.out.println(base);
        base++;
       }

    }
}
