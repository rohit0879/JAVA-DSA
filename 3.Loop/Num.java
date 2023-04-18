import java.util.*;
public class Num {
    public static void main(String str[]){
        Scanner sc= new Scanner(System.in);

        System.out.print("enter your number :");
        int tem=0;
        int num = sc.nextInt();
        while(num!=0){

            int dig = num % 10;
            tem = tem * 10 + dig;
            num /=10;
        }
        // System.out.println(" your number :"+tem);

        while(tem!=0){
            int lef = tem % 10;

            if(lef == 0){
                System.out.print("zero "); 
             }

             tem = tem/10;

        switch  (lef){
            case 9:
            System.out.print("nine ");
            break;

            case 8:
            System.out.print("eight ");
            break;

            case 7:
            System.out.print("seven ");
            break;

            case 6:
            System.out.print("six ");
            break;
            case 5:
            System.out.print("five ");
            break;

            case 4:
            System.out.println("four ");
            break;

            case 3:
            System.out.print("three ");
            break;

            case 2:
            System.out.print("two ");
            break;

            case 1:
            System.out.print("one ");
            break;

        }
        }
    }
}
