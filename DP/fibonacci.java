package src.DP;

import java.util.Arrays;

public class fibonacci {


    public static void main(String[] args) {

        int n = 4;
        int ans = fibo(n);
        System.out.println(ans);

    }

    public static int fibo(int n){

        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return solv(n, dp);


    }

    public static int solv(int n, int[] dp){

        if (n<=1) return n;

        if (dp[n]!=-1) return dp[n];

        return dp[n] = solv(n-1, dp) + solv(n-2, dp);
    }


}
