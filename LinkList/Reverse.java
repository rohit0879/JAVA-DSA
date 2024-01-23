// import java.lang.NullPointerException;
public class Reverse {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }    
        public static Node head;
        public static Node tail;
        public static int size;

        // addFirst

        public static void addfirst(int data){
            Node newNode = new Node(data);
            size++;
            if(head == null){
                head = tail = newNode;
                return ;
            }

            newNode.next = head;
            head = newNode;
          
        }

        // addlast

        public static void addlast(int data){
            Node newNode = new Node(data);
            size++;
            if(head == null){
                head = tail = newNode;
                return ;
            }

            tail.next = newNode;
            tail = newNode;
        }

          // Reverse

            public void reverse(){
            Node prev = null;
            Node curr = tail = head ;
            Node next ;
            while(curr != null){
                next = curr.next;
                curr.next = prev;
                prev = curr ;
                curr = next ;
            }
            head = prev;
         }

         // print

        public void print(){
            if(head == null){
                System.out.println("LL is empty");
            }
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data+"->");
                temp = temp.next;
            }
             System.out.println(" Null");
         }
   

    public static void main(String args[]){
        Reverse ll= new Reverse();


         ll. addfirst(2);

         ll. addfirst(1);

         ll. addlast(3);

         ll. addlast(4);

         ll. addlast(5);
         ll.print();

         ll.reverse();
         ll.print();
         
    }
}
