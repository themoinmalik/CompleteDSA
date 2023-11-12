package src.recursion_backtracking;

public class PowerOfNum {

    public static void main(String[] args) {

        int a = 2;
        int b = 3;
        int ans = power(a,b);
        System.out.println(ans);

    }

    public static int power(int a, int b){

        if (b==1){
            return a;
        }

        return power(a,b-1)*a;


    }
}
