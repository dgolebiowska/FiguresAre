public class Square extends Shape {

   protected double side;

    public Square(String kolor, double side) {
        super(kolor);
        this.side = side;
    }

    public double area(){
        return side*side;
    }
}
