package src.recursion;

public class Prep {

    public static void main(String[] args) {

//        int ans = calFib(5);
//        int ans = fact(5);
//        int ans = sumOfDigit(123);
//        int ans = recur(9);
//        System.out.println(ans);

//        printMulti(24,5);

//        int[] arr = new int[]{3,5,7,9,14,21};
//        boolean ans1 = binarySearch(arr,3);
//        System.out.println(ans1);
//        int i = 0;
//        int len1 = lenArr(arr,i);
//        System.out.println(len1);

        boolean ans = powOf2(9);
        System.out.println(ans);

        int[] arr = new int[]{1,2,4,5,6};
        reverse(arr,0);


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
//        }
//        return sum;

        // base condition more optimized...
        if (n == 0){
            return 0;
        }
        int rem = n%10;
        return rem+sumOfDigit(n/10);

    }

    // alternate sum...

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

            int mid = (left+right)/2;

            if (arr[mid] == k){
                return true;
            }
            if (k>arr[mid]){
                left = mid+1;
            }else {
                right = mid-1;
            }
        }
        return false;
    }

    // len of an array ...
    public static int lenArr(int[] arr, int i){

        if (i==arr.length){
            return 0;
        }
        return 1+lenArr(arr,i+1);

    }
    ////

    public static boolean powOf2(int n){

        if (n == 1){
            return true;
        }
        if (n<=0 || n%2!=0){
            return false;
        }
        return powOf2(n/2);
    }

    public static void reverse(int[] arr, int i){

        if(i>=arr.length-1){
            return;
        }
        System.out.println(arr[i]);
        reverse(arr,i+1);
        //  memoization....
//        System.out.println(arr[i]);


    }

}
