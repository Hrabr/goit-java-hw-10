import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class task1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Petro", "Nadia", "Alexandr ", "Andrew", "Stepan", "Sergei");
        for (int i = 0; i < list.size(); i++) {
            list.set(i, (i + ". " + list.get(i)));
        }

        String result = list.stream()

                .filter(s -> list.indexOf(s) % 2 != 0)
                .collect(Collectors.joining(", "));
        System.out.println(result);
    }
}
