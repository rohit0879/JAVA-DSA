public class Repeating_value {
    public static void main(String args[]){
        
        String a="umbralla";
        char arr[]=a.toCharArray();                            
        int n=arr.length;
        
        for(int i=0;i<n;i++){
            int count =1;
           for(int j=i+1; j<n;j++){
              if( arr[i]==arr[j]){
                   count++;
                   arr[j]='0';
                }
           }
           if(arr[i] != '0'){
            System.out.println(arr[i]+" = "+count);
           }
          
        }
    }
}
