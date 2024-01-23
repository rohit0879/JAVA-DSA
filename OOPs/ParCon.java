public class ParCon {
    int l;
    int b;
    ParCon(int l,int b){
        this.l=l;
        this.b=b;
    }
    public void area(){
        System.out.println(l*b);
    }
    public static void main(String[] args) {
      ParCon ne = new ParCon(5, 6);
    ne.area();
    }
}
