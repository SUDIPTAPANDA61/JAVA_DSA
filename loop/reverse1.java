
public class reverse1 {
    public static void main(String args[]){
        int n=1089;
        while(n>0){
            int lastDigit=n%10;
            System.out.println(lastDigit +" ");
            n= n/10;
        }
        System.out.println();
    }
}