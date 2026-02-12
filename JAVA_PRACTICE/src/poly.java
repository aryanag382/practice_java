public class poly {
    public int cal(int a,int b){
        return a+b;
    }
    public double cal(double a,double b){
       return a+b;
    }
// method overloading
    public static void main(String[] args) {
        poly p= new poly();
        System.out.println(p.cal(5,6));
        System.out.println(p.cal(5.5,6.5));;
    }
}
