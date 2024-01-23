import java.util.ArrayList;
import java.util.*;
public class InArraylist{ 
    static class stack{
       static ArrayList<Integer> list = new ArrayList<>();

       // IsEmpty
        public static boolean isEmpty(){
            return list.size()==0;
        }

        // Push
        public static void push(int data){
            list.add(data);
        }

        //PoP
        public static int pop(){
            int temp = list.get(list.size()-1);
            list.remove(list.size()-1);
            return temp;
        }

        //peek

        public static int peek(){
            return list.get(list.size()-1);
        }
    }
    public static void main(String args[]){
        stack s = new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}