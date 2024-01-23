import java.util.Scanner;
class Try_catch
{
   public static void main(String args[]){
    int a,b,c;
    Scanner s= new Scanner(System.in);
    System.out.println("enter value of a");
    a = s.nextInt();
    System.out.println("enter value of b");
    b = s.nextInt();

     try{
        c = a/b;
    } 
    catch (ArithmeticException e){
         System.out.println(e);
        } 
    }
}