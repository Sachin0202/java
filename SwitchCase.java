import java.util.*;

public class SwitchCase {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int operator = sc.nextInt();

        switch(operator) {
            case 1: System.out.println(a+b);
            break;
            case 2: System.out.println(a-b);
            break;
            case 3: System.out.println(a*b);
            break;
            case 4: if(b == 0){
                System.out.println("invalid divison");

            }else{

                System.out.println(a/b);
            }
            case 5: if(b == 0){

                System.out.println("invalid division");
            }else{

                System.out.println(a%b);
            }
            default : System.out.println("invalid operator");
        }

     }
}
