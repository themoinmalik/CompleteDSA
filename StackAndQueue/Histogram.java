package src.StackAndQueue;

public class Histogram {

    public static void main(String[] args) {

        int[] arr = new int[]{3, 5, 1, 7, 5, 9};
        int ans = histogram(arr);
        System.out.println(ans);

    }


    public static int histogram(int[] arr){

         int max = Integer.MIN_VALUE;
         int[] newArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i-1; j >=0 ; j--) {

                if (arr[j]>arr[i]){
                    count++;
                }else {
                    break;
                }
            }

            for (int j = i+1;j<arr.length;j++){
                if (arr[j]>arr[i]){
                    count++;
                }else {
                    break;
                }
            }
            newArr[i] = count*arr[i];
        }

        for (int j : newArr) {
            if (j > max) {
                max = j;
            }
        }
         return max;
    }
}
