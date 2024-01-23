//  Approch 1

public class Diameter {
    static class Node{
        int data;
        Node left;
        Node right;
       public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public static int hgt(Node root){
        if(root==null){
            return 0;
        }
        int lh = hgt(root.left);
        int rh = hgt(root.right);
        return Math.max(lh,rh)+1;
    }

    public static int diameter(Node root){
        if(root==null){
            return 0;
        }

        int leftDmt = diameter(root.left);
        int lh = hgt(root.left);
        int rightDmt = diameter(root.right);
        int rh = hgt(root.right);

        int selfDmt = lh + rh + 1;
         return Math.max(selfDmt,Math.max(leftDmt,rightDmt));
    }

    public static void main(String args[]){
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        
        System.out.println(diameter(root));         // output = 5
    }
}
