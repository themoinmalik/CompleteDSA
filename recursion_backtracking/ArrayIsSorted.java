package src.recursion_backtracking;

public class ArrayIsSorted {


    public static void main(String[] args) {


        int[] arr = new int[]{1,2,3,4,5};
        int n = arr.length;
        boolean ans = sortedRecur(arr,n);
        System.out.println(ans);

    }


    public static boolean sorted(int[] arr){

        for (int i = 0; i < arr.length-1; i++) {

            if (arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;

    }


    /// recursive call...
    public static boolean sortedRecur(int[] arr, int i){

        i = i-1;
        if (i == 1){
            return true;
        }

        if (arr[i]>arr[i-1]){
            return sortedRecur(arr,i-1);
        }

        return false;

    }

}
