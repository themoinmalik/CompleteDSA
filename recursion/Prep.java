package src.recursion;

public class Prep {

    public static void main(String[] args) {

//        int ans = calFib(5);
//        int ans = fact(5);
//        int ans = sumOfDigit(123);
        int ans = recur(9);
        System.out.println(ans);

        multi(24,5);

    }

    public static int calFib(int n){

        // base condition...
        if (n <=2){
            return 1;
        }

        return calFib(n-1) + calFib(n-2);

    }


    public static int fact(int n){

        /// base condition ...
        if (n<=2){
            return n;
        }

        return n*fact(n-1);

    }

    // sum of digits ...
    public static int sumOfDigit(int n){


        // base condition...
//        int sum = 0;
//        if (n>0){
//            int rem = n%10;
//            n = n/10;
//            sum = sumOfDigit(n)+rem;
//
//        }
//        return sum;

        // base condition more optimized...
        if (n == 0){
            return 0;
        }
        int rem = n%10;
        return rem+sumOfDigit(n/10);

    }

    // alternaet sum...

    public static int recur(int n){

        // base condition...
        if (n==0){
            return 0;
        }

        if (n%2 == 0){
            return recur(n - 1) - n;
        }else {
            return recur(n-1)+n;
        }

    }

    // find multiple...

    public static void multi(int n , int k){

        if (k==1){
            System.out.println(n);
            return;
        }
        multi(n,k-1);
        System.out.println(n * k);

    }
}
