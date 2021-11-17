import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class task2 {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Petro","Nadia","Alexandr","Andrew","Stepan","Sergei");
        List<String> z= list.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder() )
                .collect(Collectors.toList());
        System.out.println(z);
    }
}
