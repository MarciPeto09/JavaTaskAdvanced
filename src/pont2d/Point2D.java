package pont2d;

public class Point2D {
     float x;
     float y;

    public Point2D() {
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float[] getXY(float x, float y){
        return new float[]{x,y};
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY (float x, float y){
        this.x = x;
        this.y = y;
    }
    public String toString() {
        return  String.format("(%f,%f)", x, y);
    }
}
