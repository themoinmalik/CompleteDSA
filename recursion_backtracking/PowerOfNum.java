package src.recursion_backtracking;

public class PowerOfNum {

    public static void main(String[] args) {

        int a = 2;
        int b = 3;
        int ans = power(a, b);
        System.out.println(ans);

        int n = 16;
        boolean ans1 = isPower(n);
        System.out.println(ans1);

    }

    public static int power(int a, int b) {

        if (b == 1) {
            return a;
        }

        return power(a, b - 1) * a;


    }

    // power of 2, 3,4... yes or no...

    public static boolean isPower(int n){

        if (n==1){
            return true;
        }

        if (n<=1  || n%2!=0){
            return false;
        }
        return isPower(n/2);

    }

}
