import java.util.HashMap;
public class Hashmap{
    public static void main(String args[]){
        HashMap<String,Integer> hm = new HashMap<>();
     
        // put() =>  O(1)   
        hm.put("india",100);
        hm.put("pakistan",50);
        hm.put("china",120);
        hm.put("nepal",30);

        System.out.println(hm);

        // size()
        System.out.println("Size : "+hm.size());

        //get() => O(1)
        System.out.println(hm.get("india"));
        System.out.println(hm.get("china"));

        // containsKey() => O(1) return only True/False
        System.out.println(hm.containsKey("india"));  // true
        System.out.println(hm.containsKey("bhutan")); // false

        // remove() => O(1)
        System.out.println(hm.remove("china"));
        System.out.println(hm);

        // isEmpty() => return True/False
        System.out.println(hm.isEmpty());

        // clear()
        hm.clear();
        System.out.println(hm.isEmpty());
    }
}