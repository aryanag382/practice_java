public class day2 {
    public static void main(String[] args) {
        vehicle car1=new vehicle();
        car1.color="blue";
        car1.company="Tata";
        car1.speed=100;
        car1.car();
        vehicle car2= new vehicle();
        car2.color="red";
        car2.company="kia";
        car2.speed=90;
        car2.car();

    }
}
class vehicle{
    String company;
    int speed;
    String color;
    public void car(){
        System.out.println(company +" " + color+ " " + speed);
    }
}