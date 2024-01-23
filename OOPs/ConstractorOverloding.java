public class ConstractorOverloding {
   public static void main(String args[]){
    Rectangle r1=new Rectangle();
    Rectangle r2=new Rectangle(5);
    Rectangle r3=new Rectangle(5,10);

    System.out.println(r1.Area());
    System.out.println(r2.Area());
    System.out.println(r3.Area());
   }
}

class Rectangle{
    int length;
    int breath;

   Rectangle() {
        length=10; breath=20;
    }

    Rectangle(int a) {
        length=a; breath=a;
    }

    Rectangle(int a, int b) {
        length=a; breath=b;
    }

   int Area(){
       return length*breath;
    }
}

