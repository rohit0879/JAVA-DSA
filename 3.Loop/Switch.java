import java.util.*;
public class Switch{
    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);

        System.out.print("enter your name :");
        String name = sc.nextLine();

        System.out.print("enter your Roll :");
        int roll = sc.nextInt();

        System.out.println(" your name :"+name);
        System.out.println("your Roll :"+roll);
        
        System.out.print("enter your marks :");
        int marks1=sc.nextInt();
        int marks2=sc.nextInt();
        int marks3=sc.nextInt();
        int marks4=sc.nextInt();
        int marks5=sc.nextInt();

        int per =(marks1 +marks2+marks3+marks4+marks5)/5;
        int avg = per / 10;

        switch  (avg){
            case 9:
            System.out.println("Grade O");
            break;
            case 8:
            System.out.println("Grade E");
            break;
            case 7:
            System.out.println("Grade A");
            break;
            case 6:
            System.out.println("Grade B");
            break;
            case 5:
            System.out.println("Grade C");
            break;
            case 4:
            System.out.println("Grade D");
            break;
            default:
            System.out.println("Fail");
            break;
        }
    }
}