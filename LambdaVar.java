import java.util.List;

public class LambdaVar {
    public static void main(String args[]) throws Exception{
        List.of("赤", "青", "白", "黒", "翠")
                .stream()
                .forEach((var s) -> {
                    System.out.println(s);
                });
    }
}
