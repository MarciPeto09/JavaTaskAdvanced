package shape;

public class ResizableCircle extends CircleClass implements Resizable {
    private CircleClass circle;

    public ResizableCircle(int radiusValue) {
        super(radiusValue);
    }

    @Override
    public void resize(int percent) {
        radiusValue = radiusValue * radiusValue / 100;

    }
    @Override
    public String toString() {
        return "ResizableCircle{" +
                "radius=" + radiusValue +
                '}';
    }
}
