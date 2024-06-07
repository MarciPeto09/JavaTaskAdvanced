package shape;

public class ShapeClass {
    private String color;
    private boolean isFilled;

    public ShapeClass() {
        this.color = "unknown";
        this.isFilled = false;
    }

    public ShapeClass(String color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }

    public String toString(){
        return "Shape with color " + color + " is filled " + isFilled;
    }
}
