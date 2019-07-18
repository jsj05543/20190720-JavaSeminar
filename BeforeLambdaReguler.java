public class BeforeLambdaReguler {

    public static void main(String[] args) {
        AddCalculator add = new AddCalculator();
        System.out.println(add.calculate(10,20));

        SubCalculator sub = new SubCalculator();
        System.out.println(sub.calculate(10,20));

    }
}
