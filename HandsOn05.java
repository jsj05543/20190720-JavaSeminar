import java.util.Arrays;
import java.util.List;

public class HandsOn05 {

    public static void main(String[] args) {
        // 満点の人がいるか判断
        // 全員合格しているか判断
        List<Integer> points = Arrays.asList(100, 59, 60, 80, 69);

        HandsOn05 test = new HandsOn05();
        System.out.println("beforeLambda =====================================");
        test.beforeLambda(points);
        System.out.println("afterLambda =====================================");
        test.afterLambda(points);
    }

    public void  beforeLambda(List<Integer> points) {
        boolean hasPerfect = false;
        for(Integer point : points) {
            if (point == 100) {
                hasPerfect = true;
                break;
            }
        }
        System.out.println("満点の人は" + (hasPerfect ? "います。" : "いません。"));

        boolean allPass = false;
        int count = 0;
        for(Integer point : points) {
            if (point >= 60) {
                count++;
            }
        }
        if (count == points.size()) {
            allPass = true;
        }
        System.out.println("全員合格" + (allPass ? "です。" : "ではありません。"));
    }

    public void afterLambda(List<Integer> points) {
        boolean hasPerfect = false;

        System.out.println("満点の人は" + (hasPerfect ? "います。" : "いません。"));

        boolean allPass = false;

        System.out.println("全員合格" + (allPass ? "です。" : "ではありません。"));
    }
}
