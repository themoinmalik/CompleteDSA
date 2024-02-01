package src.SlidingWindows;

public class MaxSumOfSubArray {

    public static void main(String[] args) {

        int[] arr = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        int windSize = 3;
        int ans = maxSum(arr);
        System.out.println(ans);
    }

//    private static int findMax(int[] arr, int windSize) {
//        int sum = 0;
//        int i = 0;
//        int j=0;
//        int max = 0;
//
//        while (j<arr.length) {
//
//            sum = sum + arr[j];
//
//            if (j-i+1 < windSize) {
//                j++;
//            } else if (j-i+1 == windSize) {
//                max = Math.max(max,sum);
//                sum = sum - arr[i];
//                i++;
//                j++;
//            }
//        }
//        return max;
//    }


    public static Integer countSum(int[] arr, int k){

        int sum = 0;
        int i = 0;
        int max_sum = Integer.MIN_VALUE;

        for (int j = 0; j < arr.length; j++) {

            sum = sum + arr[j];

            if (j-i+1 == k){
                max_sum = Math.max(max_sum,sum);
                sum = sum - arr[i];
                i++;
            }
        }
        return max_sum;
    }

    // max sub array ...
    public static int maxSum(int[] arr){

        int i = 0;
        int sum = 0;
        int max_sum = Integer.MIN_VALUE;

        for (int j=0;j<arr.length;j++){
            sum = sum + arr[j];
            max_sum = Math.max(max_sum,sum);
            if (sum<max_sum){
//                max_sum = Math.max(sum,max_sum);
                sum = sum-arr[i];
                i++;
            }

        }
        return max_sum;
    }
}
