import java.util.HashSet;
public class Hashset {
    public static void main(String args[]){
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(5);
        set.add(7);
        set.add(2);
        set.add(1); 

        System.out.println(set);

        System.out.println(set.contains(2));
        set.remove(2);
        System.out.println(set.contains(2));
        
        System.out.println(set.size());
        System.out.println(set.isEmpty());

        set.clear();
        System.out.println(set.isEmpty());

    }
}
