public class Inheritance {
    public static void main(String args[]){
      Fish sark=new Fish();
      sark.eat();
      sark.Swim();
      sark.colour="red";
      System.out.println(sark.colour);
    }
}

// Base class
class Animal{
    String colour;
    void eat(){
        System.out.println("eats");
    }
    void breath(){
        System.out.println("breath");
    }
}

// Derived class
class Fish extends Animal{
    void Swim(){
        System.out.println("swim in water");
    }
}
