import java.util.Iterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class task5 {
    public static void main(String[] args) {
        Stream<String> first = Stream.of("1", "2", "3", "4", "5");
        Stream<String> second = Stream.of("1", "2", "3", "4");

        System.out.println(zip(first, second).collect(Collectors.toList()));

    }

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> firstIterator = first.iterator();
        Iterator<T> secondIterator = second.iterator();

        Stream<T> result = Stream.empty();

        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            Stream<T> next = Stream.of(firstIterator.next(), secondIterator.next());
            result = Stream.concat(result, next);

        }
        return result;
    }

}