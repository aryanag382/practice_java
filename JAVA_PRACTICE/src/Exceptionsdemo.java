public class Exceptionsdemo {
    int[] book={5};
    public void available(int required) {
        try {
            int[] book = {1, 2, 3, 4, 5};
            System.out.println("available book" + book[required]);
        } catch (Exception e) {
            System.out.println("required book not available");
        }
        finally {
            System.out.println("thankyou");
        }
    }
        public static void main(String[] args) {
        Exceptionsdemo e=new Exceptionsdemo();
        e.available(3);

    }
}
