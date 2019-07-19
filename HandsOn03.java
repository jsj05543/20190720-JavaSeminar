import java.util.Arrays;
import java.util.List;

public class HandsOn03 {

    public static void main(String[] args) {
        // リスト内の奇数を合計し、出力する
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        HandsOn03 test = new HandsOn03();
        System.out.println("beforeLambda =====================================");
        System.out.println(test.beforeLambda(list));
        System.out.println("afterLambda =====================================");
        System.out.println(test.afterLambda(list));
    }

    public int beforeLambda(List<Integer> list) {
        int sum = 0;
        for(Integer i : list) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        return sum;
    }

    public int afterLambda(List<Integer> list) {
        int sum = 0;
        return sum;
    }
}
