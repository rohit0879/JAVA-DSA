public class ClassObject {
    double width,height ,depth ;
    void volume(){
       System.out.print("Volume is : ");
       System.out.println(width * height * depth);
    }
}
 
    class BoxDemo{
    public static void main(String args[]){
        ClassObject Newbox1 = new ClassObject();
        ClassObject Newbox2 = new ClassObject();

        Newbox1.width = 10 ;
        Newbox1.height = 5 ;
        Newbox1.depth = 20 ;
        
        Newbox1.volume();

        Newbox2.width = 12 ;
        Newbox2.height = 5 ;
        Newbox2.depth = 10 ;

        Newbox2.volume();

    }

}
