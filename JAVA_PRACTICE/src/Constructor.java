public class Constructor {
   private String Color;
    String company;
    int speed;

    public Constructor(String company,String Color,int speed){
       this.company=company;
        this.Color=Color;
        this.speed=speed;
    }
    public void men(){
        System.out.println(company + Color + speed);
    }

    public String getColor() {
        return Color;
    }
    public void setColor(String Color){
    Color = Color;
    }

    public static void main(String[] args) {
        Constructor car=new Constructor("Kia","blue",120);
//        car.company="KIA";
//        car.color="BLUE";
//        car.speed=120;
       car.men();

        Constructor car1=new Constructor("TATA","RED",50);
//           car1.company="TATA";
//            car1.color="RED";
//            car1.speed=90;
        car1.men();
            System.out.println(car1.getColor());
           car1.setColor("Red");
            System.out.println(car1.getColor());
            car1.setColor("yellow");
        System.out.println(car1.getColor());
        }
    }

