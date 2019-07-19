import java.util.stream.IntStream;

public class HandsOn02 {

    public static void main(String[] args) {
        HandsOn02 test = new HandsOn02();
        System.out.println("beforeLambda =====================================");
        test.beforeLambda();
        System.out.println("afterLambda =====================================");
        test.afterLambda();
    }

    public void beforeLambda() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " X " + i + " = " + i*j + "\t");
                if (i == j) {
                    System.out.println();
                }
            }
        }
    }

    public void afterLambda() {

    }
}
