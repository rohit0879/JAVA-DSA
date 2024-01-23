public class Remove {
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
       

        // addFirst

        public static void addfirst(int data){
            Node newNode = new Node(data);
            
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
            
            if(head == null){
                head = tail = newNode;
                return ;
            }

            tail.next = newNode;
            tail = newNode;
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

        // Remove to end side

        public void remove(int n){
            int size = 0 ;
            Node temp = head ; 
            while(temp != null){
                temp = temp.next;
                size++; 
            }

            if( n == size){         // remove first
                head = head.next ;
                return;
            }
            
            int i = 1;
            int iToFind = size-n;
            Node prev = head;
            while(i < iToFind){
                prev = prev.next;
                i++;
            }

            prev.next = prev.next.next;
            return;

        }

   

    public static void main(String args[]){
        Remove ll= new Remove();


         ll. addfirst(2);

         ll. addfirst(1);

         ll. addlast(3);

         ll. addlast(4);

         ll. addlast(5);
         ll.print();
        
         ll.remove(2);
         ll.print();

         
    }
}
