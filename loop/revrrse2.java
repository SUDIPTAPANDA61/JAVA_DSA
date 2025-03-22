
public class revrrse2 {
    public static void main(String args[]){
        int n=10899;
        int rev=0;
        while(n>0){
            int lastDigt=n%10;
            rev=(rev*10)+lastDigt;
            n=n/10;
        }
        System.out.println(rev);
    }
    
}
