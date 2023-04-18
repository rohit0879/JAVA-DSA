public class Do_while {
    public static void main(String args[])
    {
        int counter=1;
        do{
            if(counter==1){
                break;
            }
            System.out.println(counter);
            counter++;
        }while(counter<=10);
    }
}
