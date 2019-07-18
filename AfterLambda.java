public class AfterLambda {

    public static void main(String[] args) {

        Calculator add = (a, b) -> a + b;
        System.out.println(add.calculate(10,20));

        Calculator sub = (a, b) -> a - b;
        System.out.println(sub.calculate(10,20));
    }
}
