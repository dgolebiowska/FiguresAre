public class Frame extends Square {
    String nazwa;

    public Frame(String kolor, double side, String nazwa) {
        super(kolor, side);
        this.nazwa = nazwa;
    }

    public double area() {
        return side * side;
    }
}