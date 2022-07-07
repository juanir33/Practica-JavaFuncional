import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Peek {

    public void doPeek() {
        Stream.of("one", "two", "three", "four")
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e))
                .collect(Collectors.toList());
    }

    public void doSkip() {
        Stream.of("one", "two", "three", "four").skip(2).forEach(i -> System.out.println(i));

    }

    public void doMin() {
        List<Integer> list = Arrays.asList(-9, -2, 0, 34, 4);
        Integer min = list.stream().min(Integer::compare).get();
        System.out.println(min);
    }

    public void doMax() {
        List<Integer> list = Arrays.asList(-9, -2, 0, 34, 4);
        Integer man = list.stream().max(Integer::compare).get();
        System.out.println(man);
    }

    public void doReduce(){
        List<Integer> list = Arrays.asList(19, 22, 10, 4);
        Integer subs = list.stream().reduce((ele1, ele2) -> ele1 - ele2).orElse(-1);
        System.out.println("La resta es= " + subs);
    }


}
