import java.util.*;
public class income {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int income = sc.nextInt();
    int tax;
    if(income <= 50000 ){
       tax=0; 
    }
    else if(income >= 50000 && income < 10000 ){
        tax =(int)(income*0.2);
    }
    else{
      tax = (int) (income*0.3); 
    }
    System.out.println("your tax is:" + tax);

  }  
}
