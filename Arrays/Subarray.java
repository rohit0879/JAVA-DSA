public class Subarray {
    public static void Subarray(int number[]){
        int st=0;
        for(int i=0;i<number.length;i++){
            int first=i;
            for(int j=i+1;j<number.length;j++){
                int last=j;
                for(int start=first;start<=last;start++){
                    System.out.println(number[start]);
                    
                }
                st++;
                System.out.print(" ");
            }
        System.out.println();
        }
        System.out.println("no of subarray is :"+st);
    }
    public static void main(String args[]){
        int number[]={2,4,6,8,10};
        Subarray(number);
    }
}
