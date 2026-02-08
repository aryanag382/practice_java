public class Constructor {
    String color;
    String company;
    int speed;

    public Constructor(String company,String color,int speed){
       this.company=company;
        this.color=color;
        this.speed=speed;
    }
    public void men(){
        System.out.println(company + color + speed);
    }

    public static void main(String[] args) {
        Constructor car=new Constructor("Kia","blue",120);
//        car.company="KIA";
//        car.color="BLUE";
//        car.speed=120;
       car.men();

        Constructor car1=new Constructor("TATA","RED",50);{
//           car1.company="TATA";
//            car1.color="RED";
//            car1.speed=90;
        car1.men();
        }
    }
}
