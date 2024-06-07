package shape;

public class CircleClass extends ShapeClass{
    private int radiusValue;

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

    public double getArea(){
        return (double) Math.PI *Math.pow(radiusValue,2);
    }

    public double getPerimeter(){
        return (double) 2 * Math.PI * radiusValue;
    }

    public String toString(){
        return "Circle with radius= " + radiusValue + " which is a subclass off " + super.toString();
    }
}
