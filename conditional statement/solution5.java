import java.util.*;
public class solution5 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        boolean x=(year%4==0);
        boolean y=(year%100!=0);
        boolean z=((year%100==0))&&(year%400==0);
        if(x && (y||z)){
            System.out.println("it is a leap year:" +year);
        }
        else{
            System.out.println( "it is not leap year:"+year);
        }
    }
    
}
 