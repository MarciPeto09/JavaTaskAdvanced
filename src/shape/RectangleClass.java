package shape;

public class RectangleClass extends ShapeClass {
    private double width;
    private double height;

    public RectangleClass(String color, boolean isFilled,  double width,
                          double length) {
        super(color, isFilled);
        this.width = 1;
        this.height = 1;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    @Override
    public double getArea(){
        return  width * height;
    }
    @Override
    public double getPerimeter(){
        return 2 * (width + height);
    }

    public String toString(){
        return "Rectangle with width= " + width + " and length= "+height + " which is a subclass off " + super.toString();
    }
}
