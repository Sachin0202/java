public class function2 {
    public static int calcsum(int a, int b){
        int c;
        if(a>b){
            
            c = a+b;

        } else {
            
           c  = a-b;
        } 
        return c;
    }
    public static void main(String args[]){
        int x = 12;
        int y = 13;
        int z;
        z = calcsum(x, y);
        System.out.println(z);
        int d = 23;
        int e = 25;
        int f;
        f = calcsum(d, e);
        System.out.println(f);

    }
}
