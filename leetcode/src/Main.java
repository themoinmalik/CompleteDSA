import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);

        String str = "III";
        char[] arr = str.toCharArray();
//        StringBuilder strnew = new StringBuilder();

        int result = 0;


        for (char c : arr) {
            result = result + map.get(c);
        }

        System.out.println(result);
    }
}