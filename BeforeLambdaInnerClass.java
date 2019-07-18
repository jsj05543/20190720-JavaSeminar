public class BeforeLambdaInnerClass {

    public static void main(String[] args) {

        Calculator add = new Calculator() {
            @Override
            public int calculate(int a, int b) {
                return a + b;
            }
        };
        System.out.println(add.calculate(10,20));

        Calculator sub = new Calculator() {
            @Override
            public int calculate(int a, int b) {
                return a - b;
            }
        };
        System.out.println(sub.calculate(10,20));
    }
}
