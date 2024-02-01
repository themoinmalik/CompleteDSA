package src.StriverSheet;

import static src.arrays1D.TwoSum.swap;

public class ArrayDay2 {


    public static void main(String[] args) {

        int[] arr = new int[]{1,2,3,3,4};

        int ans = findDuplicate(arr);

        System.out.println(ans);
    }

    // rotate image

    public static int[][] rotate(int[][] arr){

        // two things are there...
        int row = arr.length;
        int col = arr[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                // transpose...
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // reverse...

        int left = 0;
        int right = row-1;

        for (int i = 0; i < row; i++) {
                while (left<=right){
                    int temp = arr[i][left];
                    arr[i][left] = arr[i][right];
                    arr[i][right] = temp;
                    left++;
                    right--;
                }
        }

        return arr;


    }


    // find duplicates...
    public static int findDuplicate(int[] arr){

        int i = 0;
       while (i<arr.length){
           int curr = arr[i]-1;
           if (arr[i]!=arr[curr]){
               swap(arr, i, curr);
           }else {
               i++;
           }
       }

       int k = 0;
       while (k<arr.length){

           if (arr[k] !=k+1 ){
               return arr[k];
           }
           k++;
       }
        return -1;
    }





}
