package src.recursion_backtracking;

public class LenghtOfArray {

    public static void main(String[] args) {

        int[] arr = {1,2,4,56};

        length(arr,0);

    }

    public static void length(int[] arr, int ind){

        if (ind>=arr.length){
            System.out.println(ind);
            return;
        }
        length(arr,ind+1);

    }
}
