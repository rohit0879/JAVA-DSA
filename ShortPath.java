public class ShortPath {
    public static float printshort(String str){
        int x=0,y=0;
        for(int i=0;i<str.length();i++){ 
            char dir=str.charAt(i);
        if(dir=='N'){
            y++;
        }

        else if(dir=='S'){
            y--;
        }

        else if(dir=='W'){
            x--;
        }
        else{
            x++;
        }
    } 
    int X=x*x;
    int Y=y*y;
    return (float)Math.sqrt(X+Y);
    }
    public static void main(String args[]){
        String str="WNEENESENNN";
        System.out.print(printshort(str));
    }
}
