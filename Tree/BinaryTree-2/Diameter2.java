public class Diameter2 {
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

    public class Info{
         int diam;
         int ht;
         public Info(int diam,int ht){
            this.diam=diam;
            this.ht=ht;
         }
    }
    
    public static Info diameter(Node root){
        if(root == null){
            return new Info(0,0);
        }
        Info leftInfo = diameter(root.left);
        Info rightInfo = diameter(root.right);

        int diam = Math.max(Math.max(leftInfo.diam,rightInfo.diam),leftInfo.ht+rightInfo.ht+1);
        int ht = Math.max(leftInfo.ht, rightInfo.ht)+1;

        return new Info(diam, ht);

    }
    public static void main(String args[]){
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        
        System.out.println(diameter(root).diam);         // output = 5
    }
}
