public class Nested_class {
    public static void main(String args[])
    {
            Outer o=new Outer();
               o.m1();
            Outer.Inner i=o.new Inner(); 
               i.m2();
    }
}

class Outer{
    int a=10,b=20;
    void m1()
        {
            System.out.println("Outer class m1() method");
        } 
    class Inner
       {
       int x=100,y=200;
       void m2()
        {
            System.out.println("Inner class m2() method"); 
            System.out.println(x+y);
             System.out.println(a+b);
            m1() ;
        } 
}
}