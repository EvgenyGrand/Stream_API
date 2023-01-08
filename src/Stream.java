import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(11);
        numbers.add(12);
        numbers.add(15);
        numbers.add(16);
        numbers.add(17);
        numbers.add(22);
        numbers.add(0);
        numbers.add(-1);

        List<Integer> result = numbers.stream()
                .filter(integer -> integer > 0)
                .peek(integer ->{
                        System.out.println("natural numbers " + integer);
    })
                .collect(Collectors.toList());
    }
}