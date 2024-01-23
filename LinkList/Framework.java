import java.util.LinkedList;
public class Framework {
    public static void main(String args[]){
        LinkedList<Integer> ll = new LinkedList<>();
        ll.addLast(2);
        ll.addLast(3);
        ll.addFirst(1);
        System.out.println(ll);

        ll.remove(2); // index value 2
        System.out.print(ll);
    }
}
