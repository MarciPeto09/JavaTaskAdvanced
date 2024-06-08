package pont2d;

public class MovableCircle implements Movable{
    private float radius;
    private MovablePoint movablePoint;

    public MovableCircle(float radius, MovablePoint movablePoint) {
        this.radius = radius;
        this.movablePoint = movablePoint;
    }

    @Override
    public int moveUp() {
        return movablePoint.moveUp();

    }

    @Override
    public int moveDown() {
        return movablePoint.moveLeft();

    }

    @Override
    public int moveLeft() {
        return movablePoint.moveLeft();
    }

    @Override
    public int moveRight() {
        return movablePoint.moveRight();
    }
    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", movablePoint=" + movablePoint +
                '}';
    }
}
