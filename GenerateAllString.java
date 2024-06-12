import java.util.*;

public class GenerateAllString {
    public static void strings(int n, String str, char lastChar, List<String> result) {
        if (str.length() == n) {
            result.add(str);
            return;
        }
        strings(n, str+"0", '0', result);
        if (lastChar != '1') {
            strings(n, str + "1", '1', result);
        }
    }

    public static List<String> geratestrings(int n) {
        List<String> result = new ArrayList<>();
        strings(n, "", '0', result);
        return result;
    }

    public static void main(String[] args) {
        int n = 3;
        List<String> strings = geratestrings(n);
        for (String s : strings) {
            System.out.print(s + " ");
        }
    }
}