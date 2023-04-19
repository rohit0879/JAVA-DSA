public class TrapingWater {
    public static void trape(int height[]){
        int n=height.length;

        int leftmax[]=new  int[n];
        leftmax[0]=height[0];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(height[i],leftmax[i-1]);
        }

        int rightmax[]=new int[n];
         rightmax[n-1]=height[n-1];
         for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(height[i],rightmax[i+1]);
         }

        int TrapingWater=0;
        for(int i=1;i<n;i++){
            int depthwater=Math.min(leftmax[i],rightmax[i]);
            TrapingWater+=depthwater-height[i];
        }
        System.out.print(TrapingWater);
    }
    public static void main(String args[]) {
        int height[]={4,2,0,6,3,2,5};
        trape(height);

    }
}
