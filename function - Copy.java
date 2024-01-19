import java.util.Scanner;

public class function {
   // public static int calculatesum(int a, int b ){
     //   int sum = a + b;
   //     return sum;
    //}
    public static int calculateproduct(int a, int b){
        return a*b;
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("product of 2 numbers is:"+ calculateproduct(a, b));
    }
}
