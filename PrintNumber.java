import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrintNumber {

    public static void main(String... args) {
        List<Integer> myList = Stream.of(1, 2, 3, 4, 5)
                .collect(Collectors.toList());

        IntStream.range(1, 5)
                .filter(n -> n % 3 == 0)
                .forEach(n -> myList.remove(n));

        myList.forEach(System.out::print);
    }

}
