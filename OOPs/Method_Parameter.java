public class Method_Parameter {
    double width, height, depth;
// compute and return volume
    double volume() {
        return width * height * depth;
    }
// sets dimensions of box
   void setDim(double w, double h, double d) {
        width = w; height = h; depth = d;
    }
}

class BoxDemo {
    public static void main(String args[]) {

       Method_Parameter mybox1 = new Method_Parameter();

       Method_Parameter mybox2 = new Method_Parameter();

       double vol;

       mybox1.setDim(10, 20, 15);
       vol = mybox1.volume();
       System.out.println("Volume is: " + vol);

       mybox2.setDim(3, 6, 9);
       vol = mybox2.volume();
       System.out.println("Volume is: " + vol);
    }
 }