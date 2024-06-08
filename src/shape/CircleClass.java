package shape;

public class CircleClass extends ShapeClass implements GeometricObject{
    public int radiusValue;

    public CircleClass(int radiusValue) {
        this.radiusValue = radiusValue;
    }

    public CircleClass(String color, boolean isFilled) {
        super(color, isFilled);
        this.radiusValue = 1;
    }

    public CircleClass(String color, boolean isFilled, int radiusValue) {
        super(color, isFilled);
        this.radiusValue = radiusValue;
    }

    public int getRadiusValue() {
        return radiusValue;
    }

    public void setRadiusValue(int radiusValue) {
        this.radiusValue = radiusValue;
    }

    @Override
    public double getArea(){
        return (double) Math.PI *Math.pow(radiusValue,2);
    }
    @Override
    public double getPerimeter(){
        return (double) 2 * Math.PI * radiusValue;
    }

    public String toString(){
        return "Circle with radius= " + radiusValue + " which is a subclass off " + super.toString();
    }
}
