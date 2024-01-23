import java.util.*;
public class LinkedList{

    //Node class
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }


    public static Node head;
    public static Node tail;
    public static int size;

    // addfirst
public static void addfirst(int data){
    Node newNode = new Node(data) ;
    size++;
    if(head == null){
        head = tail = newNode;
        return;
    }
    newNode.next = head ;
    head = newNode;
}

//addlast
public static void addlast(int data){
    size++;
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

    Node temp = head ;
    while(temp != null){
        System.out.print(temp.data+"->");
        temp=temp.next;
    }
    System.out.println("null");
}

  // Add in the Middle  
  
  public void addmiddle(int idx , int data){
    Node newNode = new Node(data); 
    if(idx == 0){
        addfirst(data);
        return;
    }
    Node temp = head;
    for(int i = 0 ; i < idx-1; i++){
        temp = temp.next;
    }
    newNode.next = temp.next;
    temp.next = newNode;
    
 } 

    public static void main(String args[]){
       LinkedList ll= new LinkedList();
       ll.print();
       ll. addfirst(2);
       ll.print();
       ll. addfirst(1);
       ll.print();
       ll. addlast(3);
       ll.print();
       ll. addlast(4);
       ll.print();
        ll.addmiddle(2,9);
        ll.print();

       System.out.println("size : "+size);
       
    }
}