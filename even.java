
import java.util.*;
public class even {
    public static void printEvenOdd(int n){
        if(n%2 == 0){
            System.out.println("even number");
        
        }else{
            System.out.println("odd number");
            return;
        }
    }
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();


            printEvenOdd(n);

        
    }
}
