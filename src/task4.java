import java.util.stream.Stream;

public class task4 {
    public static void main(String[] args) {
        long a = 25214903917l;
        int c = 11;
        long m = (long) Math.pow(2,48);
        long seed=7;
        System.out.println(generate(a,c,m,seed).toList());
    }
    static Stream<Long> generate(long a, long c, long m , long seed){
        return  Stream.iterate(seed,x->((a*x)+c)%m)
                .limit(30);
    }
}
