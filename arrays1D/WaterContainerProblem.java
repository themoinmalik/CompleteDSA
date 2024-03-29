package src.arrays1D;

public class WaterContainerProblem {

    public static void main(String[] args) {

        int[] arr = new int[]{4,2,0,3,2,5};
        int maxArea = waterProblem(arr);
        System.out.println(maxArea);
    }

    private static int waterProblem(int[] arr) {

        int maxArea = Integer.MIN_VALUE;
        int beg = 0;
        int end = arr.length-1;   //
        while (beg < end) {
            int width = end - beg;
            int height = Math.min(arr[beg], arr[end]);
            int area = width*height;
            maxArea = Math.max(maxArea,area);

            if (arr[beg] < arr[end]) {
                beg++;
            } else {
                end--;
            }

        }

        return maxArea;
    }
}
