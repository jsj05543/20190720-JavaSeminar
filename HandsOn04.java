import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HandsOn04 {

    public static void main(String[] args) {
        // 各要素を操作し、新しいコレクションを生成する
        List<String> langs = Arrays.asList("Java", "Ruby", "Go", "Python");

        HandsOn04 test = new HandsOn04();
        System.out.println("beforeLambda =====================================");
        System.out.println(test.beforeLambda(langs));
        System.out.println("afterLambda =====================================");
        System.out.println(test.afterLambda(langs));
    }

    public List<String>  beforeLambda(List<String> oldList) {
        List<String> newList = new ArrayList<>();

        for(String item : oldList) {
            newList.add("[" + item + "]");
        }
        return newList;
    }

    public List<String>  afterLambda(List<String> oldList) {
        return null;
    }
}
