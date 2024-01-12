package src.pwskils.arrays;

import java.util.Arrays;

public class ArraysInJava {

    // Diagonal  sum...
    public static int[][] solution(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        Integer a =  500;
        Integer b = 500;

        int c = 10;
        int d = 10;

        System.out.println(c==d);

        System.out.println(a==b);

        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {

                    row[i] = true;
                    col[j] = true;


                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(row[i] || col[j]){
                    matrix[i][j] = 0;
                }
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        // int A[][] = {{1,1,1},{1,0,1},{1,1,1}};
         int[][] A = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
//        int[][] A = {{0,1}};
        int[][] ans = solution(A);
        System.out.println(Arrays.deepToString(ans));
    }
}
