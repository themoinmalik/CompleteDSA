package src.recursion_backtracking;

import java.util.Arrays;

public class Nqueen {

    int n = 4;
    int[] x = new int[n]; // Array to store queen positions

    public void nqueen(int k) {
        if (k == n) {
            // Base case: All queens are placed, print the solution
            System.out.println(Arrays.toString(x));
            return;
        }

        for (int i = 0; i < n; i++) {
            if (isValid(k, i)) {
                x[k] = i; // Place the queen at (k, i)
                nqueen(k + 1); // Recur for the next row
            }
        }
    }

    public boolean isValid(int k, int i) {
        for (int j = 0; j < k; j++) {
            // Check if the queen in row j conflicts with the current position
            if (x[j] == i || Math.abs(j - k) == Math.abs(x[j] - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Nqueen nq = new Nqueen();
        nq.nqueen(0); // Start with the first row (k=0)
    }
}
