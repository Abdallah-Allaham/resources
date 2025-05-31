package data_structure.class_and_object;

public class RectClass {
    private double width;
    private double height;

    public RectClass() {
        this.width = 1.0;
        this.height = 1.0;
    }

    public RectClass(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public RectClass(double length) {
        this.width = length;
        this.height = length;
    }

    public double getArea(){
        return width * height;
    }

    public double getPerimeter(){
        return 2 * ( width + height);
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

    public String toString() {
        return "RectClass{" + "width=" + width + ", height=" + height + '}';
    }
}
