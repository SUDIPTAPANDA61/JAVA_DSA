
import java.util.*;

public class Solution3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        float pencil = sc.nextFloat();
        float pen    = sc.nextFloat();
        float eraser = sc.nextFloat();

        float total = pencil + pen + eraser;
        System.out.println("Bill is : " + total);
        //add 18% gst tax
        float tax = total+(0.18f * total);
        System.out.println("tax is:" +tax);
    
}
}
