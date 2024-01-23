public class Occurence {
    public static int occur(int n[],int key,int i){
        if(i == n.length){
            return -1;
        }
       if(n[i] == key){
          return i;
       }
       return occur(n,key,i+1);
    }
    public static void main(String args[]){
       int n[]={8,3,6,9,5,10,2,5,3};
       int key=5;
       int i=0;
       System.out.print(occur(n,key,i));
    }
}
