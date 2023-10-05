package src.recursion;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class FindSubseq {

    public static void main(String[] args) {

        List<String> ans = subseq("", "abc");
        System.out.println(ans);

    }


    public static List<String> subseq(String p, String up){

        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> left = (ArrayList<String>) subseq(p,up.substring(1));
        ArrayList<String> right = (ArrayList<String>) subseq(p+ch,up.substring(1));

        left.addAll(right);

        return left;

    }


}
