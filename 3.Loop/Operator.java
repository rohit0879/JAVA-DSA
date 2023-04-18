import java.util.*;
public class Operator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value a : ");
        int a=sc.nextInt();
      
        System.out.print("Enter value of b : ");
        int b=sc.nextInt();

        System.out.print("Enter your operator ");
        int opr = sc.next().charAt(0);

        System.out.println("your operator is :"+opr);

        
        switch  (opr){
            case '+':
            System.out.println(" Sum :"+(a+b));
            break;

            case '-':
            System.out.println("Substract :"+(a-b));
            break;

            case '/':
            System.out.println("divide :"+(a/b));
            break;

            case '*':
            System.out.println("Multiply :"+(a*b));
            break;

            default:
            System.out.println("Fail");
            break;
        }
    }
}
