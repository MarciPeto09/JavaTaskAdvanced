package pont2d;

public class Main {
    public static void main(String[] args) {
      Point2D point2D = new Point2D(10,20);
        point2D.setXY(43,65);
        System.out.println(point2D);

        Point3D point3D = new Point3D(10,20,30);
        point3D.setXY(8,4);
        System.out.println(point3D);

        LineClass line = new LineClass(10, 20, 30, 40);
        System.out.println(line.lengthSetPoint());
        System.out.println(line.getMiddlePoint());

      Movable movablePoint = new MovablePoint(10, 10, 3, 3);
      System.out.println(movablePoint);
      movablePoint.moveRight();
      movablePoint.moveUp();
      System.out.println(movablePoint);

      Movable movableCircle = new MovablePoint(20, 30, 4, 4);
      System.out.println(movableCircle);
      movableCircle.moveRight();
      movableCircle.moveUp();
      System.out.println(movableCircle);

    }
}