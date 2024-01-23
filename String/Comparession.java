public class Comparession {
    public static String compress(String str){
        String st =" ";
        
        for(int i=0; i<str.length() ; i++){
            Integer count = 1;
             while(i < str.length()-1 &&  str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
             }
             st += str.charAt(i);
             if(count > 1){
                st += count.toString(); 
             }
        }
        return st;
    }
    public static void main(String args[]){
        String str = "aaabbccdd";
        System.out.print(compress(str)); 
    }
}
