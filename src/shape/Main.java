package shape;
public class Main {
    public static void main(String[] args) {
        ShapeClass shape = new ShapeClass("red", false);
        System.out.println(shape);

        CircleClass circle = new CircleClass("blue", true, 20);
        System.out.println(circle);
        System.out.println("Siperfaqja e rrethit eshte " + circle.getArea() + " me perimeter " + circle.getPerimeter());

        RectangleClass rectangle = new RectangleClass("yellow", true, 20, 30);
        System.out.println(rectangle);
        System.out.println("Siperfaqja e drejtekendeshit eshte " + rectangle.getArea() + " me perimeter " + rectangle.getPerimeter());

        SquareClass square = new SquareClass("green", false, 40, 40);
        System.out.println(square);
        System.out.println("Siperfaqja e katrorit eshte " + square.getArea() + " me perimeter " + square.getPerimeter());
    }
}

