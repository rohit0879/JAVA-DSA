import java.util.*;
public class Iteration{
    public static void main(String args[]){
        HashMap<String,Integer> hm = new HashMap<>();
     
        // put() =>  O(1)   
        hm.put("india",100);
        hm.put("pakistan",50);
        hm.put("china",120);
        hm.put("nepal",30);

        System.out.println(hm);

        // Iteration => O(1)
        Set<String> key= hm.keySet();
        System.out.println(key);

        //forEach loop
        for(String k:key){
            System.out.println(k);
        }
    }
}
