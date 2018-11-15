public class Circle extends Shape {
    double part;

    public Circle(String kolor, double part) {
        super(kolor);
        this.part = part;
    }
    public double circleArea(){
        return Math.pow(part,2)*Math.PI;
    }
}
