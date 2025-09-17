package src.SlidingWindows;


import java.util.*;

public class FirstNegativeNumInSubArray {

    public static void main(String[] args) {
        int[] arr = new int[]{10, -1, -5, 7, -15, 20, 18, 24};
        int windSize = 2;
        List<Integer> ans = negSubArray(arr, windSize);
//        List<Integer> ans = findNegNumber(arr, windSize);
        System.out.println(ans);

    }

    private static List<Integer> findNegNumber(int[] arr, int k) {

        int n = arr.length;
        List<Integer> list = new ArrayList<>(n-k+1);
        Queue<Integer> q = new LinkedList<>();   // why queue. ....
        int i = 0;
        for(int j =0;j<n;j++){
            if (arr[j]<0){
                q.add(arr[j]);
            }
            if (j-i+1==k){
                if (q.isEmpty()){    // no negative found...
                    list.add(0);
                }
                else {
                    int r = q.peek();
                    list.add(r);
                    if (r==arr[i]){
                        q.remove(r);
                    }
                }
               i++;
            }
        }
       return list;
    }


    private static List<Integer> negSubArray(int[] arr, int k){

        int i = 0;
        int j = 0;
        int size = arr.length;

        List<Integer> negArr = new ArrayList<>();
        List<Integer> result = new ArrayList<>();

        while (j<size){

            if (arr[j]<0){
                negArr.add(arr[j]);
            }

            if (j-i+1<k){
                j++;
            } else if (j-i+1==k) {
                if (!negArr.isEmpty()){
                    result.add(negArr.getFirst());
                } else {
                    result.add(0);
                }
                if (arr[i]<0){
                    negArr.remove(Integer.valueOf(arr[i]));
                }
                i++;
                j++;
            }
        }
        return result;

    }

}
