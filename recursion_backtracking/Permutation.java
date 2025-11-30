package src.recursion_backtracking;

public class Permutation {

    int n = 3;  // size of string.
    char[] str = new char[]{'A', 'B', 'C'};
    char[] res = new char[n];
    boolean[] sel = new boolean[n];

    public void solve(int k){

        //base condition....
        if (k == n){
            System.out.println(res);
            return;
        }

        // hypothesis.
        for (int i = 0; i < n; i++) {
            if (sel[i] == false){
                if (isValid(str[i], k)){
                    res[k] = str[i];
                    sel[i] = true;
                    solve(k+1);
                    sel[i] = false;
                }

            }
        }
    }

    public boolean isValid(char c, int k){

        for (int i = 0; i < k; i++) {
        if (c - res[k-1] == 1){
            return false;
        }
        }

        return true;

    }


    int sum = 0;

   int convert(String str, int n){

       if (str.length() == 0) return 0;

       return convert(str, n-1 )*10 + str.charAt(n-1);

   }
}
