public class Remove_DublicateValue {
    public static void main(String args[]){ 
    String S="gfgfdrd" ;
    char arr[]= S.toCharArray();
    for(int i=0;i<arr.length;i++){
        // int count=1;
        for(int j =i+1;j<arr.length;j++){
            if(arr[i]==arr[j]){
                // count++;
                arr[j]='0';
            }
        }
        
        if(arr[i] !='0' ){
            System.out.print(arr[i]);
        }
    }

  }  
}
