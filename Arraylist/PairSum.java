import java.util.*;
public class PairSum {
   
    /*  

    // time complexcity = O(n^2)
    public static void Psum(ArrayList<Integer> list,int tgt){
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i) + list.get(j) == tgt){
                   System.out.println("("+i+","+j+")");
                }
            }
        }
    }

    */

    public static boolean Psum(ArrayList<Integer> list,int tgt){
        int sp=0 , lp=list.size()-1;
        while(sp!=lp){ 
        if(list.get(sp) + list.get(lp) == tgt){
              return true;
        }else if (list.get(sp) + list.get(lp) < tgt){
            sp++;
        }else{
           lp-- ;
        }
    
    }
    return false;
    }

    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        
        int tgt=50;
        System.out.println(Psum(list,tgt));
    }
}
