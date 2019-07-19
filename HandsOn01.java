import java.util.Arrays;
import java.util.List;

public class HandsOn01 {

    // 一番長い文字列を探す
    public static void main(String[] args) {
        HandsOn01 test = new HandsOn01();
        List<String> list = Arrays.asList("hoge", "hage", "huga", "foo", "1234", null, "hogehoge", "?");
        System.out.println("beforeLambda =====================================");
        System.out.println(test.beforeLambda(list));
        System.out.println("afterLambda =====================================");
        System.out.println(test.afterLambda(list));
    }


    public String beforeLambda(List<String> list) {
        String result = "";
        for (String str : list) {
            if (str != null && str.length() >= result.length()) {
                result = str;
            }
        }
        return result;
    }

    public String afterLambda(List<String> list) {
        return "";
    }
}
