public class Overloding {
    public static void main(String args[]){
        Calculator add = new Calculator();
        System.out.println("sum : "+add.sum(5,7));
        System.out.println("sum : "+add.sum(5,7,8));
        System.out.println("sum : "+add.sum((float)5.3,(float)7.2,(float)8.3));
    }
}

class Calculator{
    int sum(int a , int b){
        return (a+b);
    }
    float sum(float a , float b){
        return (a+b);
    }
    float sum(int a , float b){
        return (a+b);
    }
    float sum(float a , int b){
        return (a+b);
    }
    int sum(int a , int b,int c){
        return a+b+c;
    }
    float sum(float a,float b,float c){
        return a+b+c;
    }
}