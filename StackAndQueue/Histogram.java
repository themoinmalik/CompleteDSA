package src.StackAndQueue;

import java.util.Stack;

public class Histogram {

    public static void main(String[] args) {

        int[] arr = new int[]{2,1,5,6,2,3};   // 2,1,5,6,2,3
        int ans = histogramStack(arr);
        System.out.println(ans);

    }

//    public static int histogram(int[] arr){
//
//         int max = Integer.MIN_VALUE;
//
//        for (int i = 0; i < arr.length; i++) {
//            int count = 1;
//            for (int j = i-1; j >=0 ; j--) {
//                if (arr[j]>arr[i]){
//                    count++;
//                }else {
//                    break;
//                }
//            }
//
//            for (int j = i+1;j<arr.length;j++){
//                if (arr[j]>arr[i]){
//                    count++;
//                }else {
//                    break;
//                }
//            }
//            max = Math.max(count*arr[i], max);
//        }
//         return max;
//    }


    // using stack ...
    public static int histogramStack(int[] arr){

        int[] leftArr = new int[arr.length];
        int[] rightArr = new int[arr.length];

        int n = arr.length;
        Stack<Integer> stack = new Stack<>();
        int max = 0;

        // left array...
        for (int i = 0; i < arr.length; i++) {
            leftArr[i] = 1;
            while (!stack.empty() && arr[stack.peek()]>=arr[i]){
                stack.pop();
            }
            if (stack.empty()) {
                leftArr[i] = i+1;
            }else {
                leftArr[i] = i-stack.peek();
            }
            stack.push(i);
        }

        // clean stack....
        while (!stack.empty()){
            stack.pop();
        }

        // right array...
        findCount(arr, rightArr, n, stack);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (rightArr[i] + leftArr[i] -1)*arr[i];

            if (arr[i]>max){
                max = arr[i];
            }
        }

        return max;
    }

    static void findCount(int[] arr, int[] rightArr, int n, Stack<Integer> stack) {
        for (int i = n-1; i >=0 ; i--) {

            rightArr[i] = 1;
            while (!stack.empty() && arr[stack.peek()]>=arr[i]){
                stack.pop();
            }
            if (stack.empty()){
                rightArr[i] = n-i;
            }else {
                rightArr[i] = stack.peek()-i;
            }
            stack.push(i);
        }
    }
}
