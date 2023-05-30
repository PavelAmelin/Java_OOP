package java_oop_seminar_1;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle() {
        this(100, 50);
    }
    public Rectangle(double width, double height) {
        setWidth(width);
        setHeight(height);
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double calculateArea() {
        return getWidth() * getHeight();
    }
    public double calculatePerimeter() {
        return 2 * (getWidth() + getHeight());
    }
}
