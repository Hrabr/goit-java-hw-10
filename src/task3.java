import java.util.Arrays;
import java.util.stream.Collectors;

public class task3 {
    public static void main(String[] args) {
        String[] list = {"1, 2, 0", "4, 5"};

        String a = Arrays.stream(list)
                .flatMap(x -> Arrays.stream(x.split(", ")))
                .sorted()
                .collect(Collectors.joining(", "));
        System.out.println(a);
    }
}