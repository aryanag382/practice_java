import java.util.function.Predicate;

public class Predicates {
    public static void main(String[] args) {
        Predicate <Integer> isOdd =n->n%2==0;
        System.out.println(isOdd.test(3));
        System.out.println(isOdd.test(10));
    }
}
