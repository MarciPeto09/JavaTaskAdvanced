package pont2d;

public class LineClass {
    private Point2D start;
    private Point2D end;

    public LineClass(Point2D start, Point2D end) {
        this.start = start;
        this.end = end;
    }

    public LineClass(float p1Start, float p1End, float p2Start, float p2End ){
        this.start = new Point2D( p1Start, p1End );
        this.end = new Point2D( p2Start, p2End );
    }

    public Point2D getStart() {
        return start;
    }

    public void setStart(Point2D start) {
        this.start = start;
    }

    public Point2D getEnd() {
        return end;
    }

    public void setEnd(Point2D end) {
        this.end = end;
    }

    public float lengthSetPoint(){
        return (float) Math.sqrt((Math.pow(end.getX()- start.getX(), 2) +
                Math.pow(start.getY() - start.getY(), 2)));
    }

    public Point2D getMiddlePoint() {
        float xMiddle = (start.getX() + start.getY() ) / 2;
        float yMiddle = (end.getX() + end.getY()) / 2;
        return new Point2D(xMiddle, yMiddle);
    }
}
