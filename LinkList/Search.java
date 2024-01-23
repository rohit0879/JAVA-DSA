import java.util.*;
public class Search {
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

    public void addfirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }


    public void addlast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }

    public void print(){
        if(head == null){
            System.out.println("LL is empty");
        }
    
        Node temp = head ;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public int Search(int key){
       Node temp =head;
       int i=0;
       while(temp != null){
            if(temp.data == key){
                return i;
            }
           temp =temp.next;
           i++; 
       }
       return -1;
    } 

    public static void main(String args[]){
        Search sc = new Search();
        sc.addfirst(2);
        sc.addfirst(1);
        sc.addlast(3);
        sc.addlast(4);
        sc.addlast(5);
        sc.print();
        System.out.println(sc.Search(1));
        System.out.println(sc.Search(6 ));
    }
}
