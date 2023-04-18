import java.util.*;
public class Question3 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the week days number :");
        int week=sc.nextInt();
        switch(week){
            case 1:
            System.out.println("Sunday");
            break;

            case 2:
            System.out.println("Monday");
            break;

            case 3:
            System.out.println("Tuesday");
            break;

            case 4:
            System.out.println("Wednesday");
            break;
            
            case 5:
            System.out.println("Thresday");
            break;

            case 6:
            System.out.println("Friday");
            break;

            case 7:
            System.out.println("Saturday");
            break;

            default :
                     System.out.println("print only 1 to 7 ");
             
        }
           
    }
}
