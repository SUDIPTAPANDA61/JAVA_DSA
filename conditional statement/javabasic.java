import java.util.*;
public class javabasic{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value");
        int number = sc.nextInt();
        switch(number) {
         case 1:
         System.out.println("pizza");
         break;
         case 2:
         System.out.println("burger");
         break;
         case 3:
         System.out.println("sandwitch");
         break;
         default :
         System.out.println("wake up");   
        }
    }
}