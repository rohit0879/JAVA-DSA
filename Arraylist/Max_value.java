import java.util.*;
public class Max_value {
    public static int maxvalue(ArrayList<Integer> list,int max){
       for(int i=0;i<list.size();i++){
        //if(list.get(i)>max){
          //  max=list.get(i);
          max=Math.max(max,list.get(i));
       // }
       }
       return max;
    }
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        int max=Integer.MIN_VALUE;
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        
        System.out.println(maxvalue(list,max));
    }
}
