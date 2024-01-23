// time complexcity is O(n^2)

import java.util.ArrayList;

public class MostWater {
    public static int area(ArrayList<Integer> height){
        int maxwater=Integer.MIN_VALUE;
        for(int i=0;i<height.size();i++){
            for(int j=i+1;j<height.size();j++){
                  int lgt = Math.min(height.get(i),height.get(j));
                  int width = j-i;
                  int area = lgt * width;
                  if(area > maxwater){
                    maxwater=area;
                  }
            }
        }
        return maxwater;
    }
    public static void main(String args[]){
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(area(height));
    }
}
