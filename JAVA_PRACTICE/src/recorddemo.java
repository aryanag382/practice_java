
public class recorddemo {
    record bike (String company,int speed){}

    public static void main(String[] args) {
       bike b=new bike("BMW",120);
        bike d=new bike("tata",20);
        System.out.println(b);
        System.out.println(d);
    }
}
