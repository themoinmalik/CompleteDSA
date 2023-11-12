package src.recursion_backtracking;

public class FindTarget {


    public static void main(String[] args) {


        int[] arr = new int[]{1,2,3,4,5};
        int i = 0;
        int e = 5;
        boolean ans = target(arr, i, e);
        System.out.println(ans);


        //
        int n = 6;
        int fi = fib(n);
        System.out.println(fi);

    }


    public static boolean target(int[] arr, int i, int e){

        if (arr[i] == e){
            return true;
        }

        if (i == arr.length-1){
            return false;
        }

        return target(arr,i+1,e);

    }


    public static int fib(int n ){

        if (n<=1){
            return n;
//            System.out.println("print hello");
        }
        return fib(n-1) + fib(n-2);

    }
}
