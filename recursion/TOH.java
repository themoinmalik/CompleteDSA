package src.recursion;

public class TOH {


    public static void main(String[] args) {
        int n = 3;
        int a = 1;
        int b = 2;
        int c = 3;

        towerOfH(n,a,b,c);

    }

    public static void towerOfH(int n, int a, int c, int b){

        if (n == 0){
            return;
        }

        towerOfH(n-1,a,b,c);
        System.out.println(n+"from" + a + "to" + c);
        towerOfH(n-1,b,c,a);

    }
}
