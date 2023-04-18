public class Reverse {
   public static void main(String args[]){
     int i=108999;
     int last_digit;
     while(i>0){
      last_digit=i%10;
     i/=10;
     System.out.print(last_digit);
     }
   } 
}
