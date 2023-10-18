package src.recursion;

public class Prep {

    public static void main(String[] args) {

//        int ans = calFib(5);
//        int ans = fact(5);
//        int ans = sumOfDigit(123);
        int ans = recur(9);
//        System.out.println(ans);

//        printMulti(24,5);

        int[] arr = new int[]{3,5,2,4,7,21};
        boolean ans1 = binarySearch(arr,3);
        System.out.println(ans1);

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


    public static void printMulti(int n, int k){

        if (k == 1){
            System.out.println(n);
            return;
        }

        printMulti(n,k-1);
        System.out.println(n*k);

    }


    //binary search ...
    public static boolean binarySearch(int[] arr, int k){


        int left = 0;
        int right = arr.length-1;

        while (left<=right){

            int mid = left - (left+right)/2;

            if (arr[mid] == k){
                return true;
            }

            if (arr[mid]>k){
                left = mid+1;
            }else {
                right = mid-1;
            }

        }

        return false;

    }
}
