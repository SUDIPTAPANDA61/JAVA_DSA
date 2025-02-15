import java.util.*;
public class mark{
 public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   System.out.println("enter number");
    int marks = sc.nextInt();
    String reportCard = marks >= 33 ? "PASS" : "FAIL";
    System.out.println(reportCard);
 }   
}