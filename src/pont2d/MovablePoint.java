package pont2d;

public class MovablePoint implements Movable {
    int x, y, speedX, speedY;

    public MovablePoint(int x, int y, int speedX, int speedY) {
        this.x = x;
        this.y = y;
        this.speedX = speedX;
        this.speedY = speedY;
    }

    @Override
    public int moveUp() {
        y += speedY;
        return y;
    }

    @Override
    public int moveDown() {
        y -= speedY;
        return y;
    };

    @Override
    public int moveLeft() {
        x -= speedX;
        return x;
    };



    @Override
    public int moveRight() {
        x += speedX;
        return x;
    };



    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + speedX +
                ", ySpeed=" + speedY +
                '}';


    }
}
