import java.util.HashMap;
public class TwoSum {
    public static void main(String args[]){
        int nums[] ={2,7,11,15};
        int target = 9;
        HashMap<Integer,Integer> hs = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hs.put(nums[i], i);
            
        } 
        System.out.println(hs);       
    }
}
