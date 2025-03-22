import java.util.*;
public class NaturalSum {
   public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       int i=1;
       int n=sc.nextInt();
       int sum=0;
       while(i<=n){
           sum +=i;
           i++;           //sum=sum+i
       }
       System.out.println( + sum );
   }
}