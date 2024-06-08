package shape;
public class Main {
    public static void main(String[] args) {

        CircleClass circle = new CircleClass("blue", true, 20);
        System.out.println(circle);
        System.out.println("Siperfaqja e rrethit eshte " + circle.getArea() + " me perimeter " + circle.getPerimeter());

        RectangleClass rectangle = new RectangleClass("yellow", true, 20, 30);
        System.out.println(rectangle);
        System.out.println("Siperfaqja e drejtekendeshit eshte " + rectangle.getArea() + " me perimeter " + rectangle.getPerimeter());

        SquareClass square = new SquareClass("green", false, 40, 40);
        System.out.println(square);
        System.out.println("Siperfaqja e katrorit eshte " + square.getArea() + " me perimeter " + square.getPerimeter());

    //task 7
        System.out.println("Print i task 7");

        CircleClass circleGeometricObject = new CircleClass(14);
        System.out.println(circleGeometricObject.getArea());
        System.out.println(circleGeometricObject.getPerimeter());
        System.out.println(circleGeometricObject);

        Resizable resizable = new ResizableCircle(40);
        resizable.resize(30);
        System.out.println(resizable);
    }

//    public static interface GeometricObject {
//        double getPerimeter();
//        double getArea();
//   }
}

