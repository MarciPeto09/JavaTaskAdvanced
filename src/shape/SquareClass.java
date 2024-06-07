package shape;

public class SquareClass extends RectangleClass{
    public SquareClass(String color, boolean isFilled, double width, double length) {
        super(color, isFilled, width, length);
    }

    @Override
    public void setWidth(double width){
        super.setWidth(width);
        super.setHeight(width);
    }
    @Override
    public void setHeight(double height){
        super.setWidth(height);
        super.setHeight(height);
    }
    @Override
    public double getArea(){
        return super.getWidth() * super.getWidth();
    }

    @Override
    public double getPerimeter(){
        return 4 * super.getWidth();
    }
    @Override
    public String toString() {
        return ("Square with width= " + super.getWidth() + " and length= " + super.getHeight() + " which is subclass off " + super.toString());
    }

}
