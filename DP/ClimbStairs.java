package src.DP;

public class ClimbStairs {

    public static void main(String[] args) {

        int n = 5;
        int ans = climb(n);
        System.out.println(ans);

    }

    public static int climb(int n){

        if (n<0){
            return 0;
        }

        if (n==0){
            return 1;
        }

        int one_step = climb(n-1);
        int two_step = climb(n-2);

        System.out.println(one_step);
        System.out.println(two_step);
        return one_step+two_step;


    }


}
