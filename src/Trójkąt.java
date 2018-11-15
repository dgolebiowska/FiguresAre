public class Trójkąt extends Shape{
    double a;
    double h;

    public Trójkąt(String kolor, double a, double h) {
        super(kolor);
        this.a = a;
        this.h = h;
    }


    public double trójkątArea(){
        return (a*h)/2;
    }
}
