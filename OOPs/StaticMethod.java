public class StaticMethod {
    public static void Static(){
        System.out.println("Static methods can be called without creating objects");
    }
    public void mypublic(){
        System.out.println("public methods can be called by creating objects");
    }
    public static void main(String args[]){
        Static();
        StaticMethod my = new StaticMethod();
        my.mypublic();
    }
}
