package src.SlidingWindows;

public class MaxSumOfSubArray {

    public static void main(String[] args) {

        int[] arr = new int[]{4,5,8,5,2,5,3,7,1,1};
        int windSize = 3;
        int ans = countSum(arr, windSize);
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
}
