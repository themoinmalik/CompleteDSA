package src.TOPDSAQUESTIONS;

public class TWOSUM {

    public static int[] twoSum(int[] arr, int t){

        int l = 0;
        int r = arr.length;

        while (l<r){

            if (arr[l]+arr[r] == t){
                return new int[]{l,r};
            } else if (arr[l]+arr[r] > t) {
                r--;
            }else {
                l++;
            }
        }
        return new int[]{-1,-1};
    }


}
