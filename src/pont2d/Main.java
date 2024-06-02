package pont2d;

public class Main {
    public static void main(String[] args) {
      Point2D point2D = new Point2D(10,20);
        point2D.setXY(43, 65);
        System.out.println(point2D);

        Point3D point3D = new Point3D(10,20,30);
        point3D.setXY(8,4);
        System.out.println(point3D);

    }
}