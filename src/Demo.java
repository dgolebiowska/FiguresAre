public class Demo {

    public static void main(String[] args) {

        Square square1 = new Square("czerwony", 23.78);
        System.out.println(square1.side);
        System.out.println(square1.area());
        System.out.println(square1.getKolor());

        Circle circle1 = new Circle("niebieski", 12.5);
        System.out.println(circle1.circleArea());
        Trójkąt trójkąt1 = new Trójkąt("zielony", 10, 15);
        System.out.println(trójkąt1.trójkątArea());
     Trapez trapez1=new Trapez("żółty",1,2,3);
        System.out.println(trapez1.trapezArea());
Frame f1=new Frame("czarny", 23.67,"kkk");
        System.out.println(f1.area());

    }
}

