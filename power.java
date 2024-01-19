public class power {
    public static int calcPower(int x, int n){
        if(n == 0){
            return 1;
        }
        if(x == 0){
            return 0;
        }
        int xPower1 = calcPower(x, n-1);
        int xPown = x * xPower1;
        return xPown;
    }
    public static void main(String args[]) {
        int x = 9, n = 0;
        int ans = calcPower(x, n);
        System.out.println(ans);
    }
}
