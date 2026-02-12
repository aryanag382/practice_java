public class poly {
    public void cal() {
        System.out.println("lets goo");
    }
     static class car extends poly{
         public void cal(){
            System.out.println("hello");
        }
    }

// method overriding
    public static void main(String[] args) {
       car c= new car();
       c.cal();
    }
}
