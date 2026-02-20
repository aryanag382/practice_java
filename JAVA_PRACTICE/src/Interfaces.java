@FunctionalInterface
interface operation{
    int add(int x,int b);
}
public class Interfaces {
    public static void main(String[] args) {
        operation a=(int x,int b) ->{
            return x+b;
        };
        System.out.println(a.add(10,20));
    }

}
