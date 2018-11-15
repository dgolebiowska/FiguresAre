public class Trapez extends Shape {
    double a;
    double b;
    double h;

    public Trapez(String kolor, double a, double b, double h) {
        super(kolor);
        this.a = a;
        this.b = b;
        this.h = h;
    }

    public double trapezArea(){
        return ((a+b)*h)/2;
    }
}
