import java.util.function.Function;


public class Fnusinginbuildfn {
    public static Function<Integer, Integer> sub =(a)->a-3;

    public static void main(String[] args) {
        System.out.println(sub.apply(10));
    }
}
