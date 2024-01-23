import java.util.*;
public class LinkedhashMap{
    public static void main(String args[]){
        HashMap<String,Integer> hm = new HashMap<>();
     
        // put() =>  O(1)   
        hm.put("india",100);
        hm.put("pakistan",50);
        hm.put("china",120);
        hm.put("nepal",30);

         LinkedHashMap<String,Integer> lm = new LinkedHashMap<>(); // it is in order
     
        // put() =>  O(1)   
        lm.put("india",100);
        lm.put("pakistan",50);
        lm.put("china",120);
        lm.put("nepal",30);

        System.out.println(hm);
        System.out.println(lm);

       

    }
}
