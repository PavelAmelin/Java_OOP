package java_oop_seminar_3.task_1;


import java.util.Arrays;

public class Rectangle implements I_Rectangle {
    private double width;
    private double height;
    I_Diag d;

    public Rectangle() {
        this(default_width, default_height);
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
    @Override
    public double calculateDiagonal() {
        d = ((x, y) -> Math.pow((Math.pow(x, 2) + Math.pow(y, 2)), 0.5));
        return d.get_diag(getWidth(), getHeight());
    }
    @Override
    public String toString() {
        return "width=" + width + ", height=" + height;
    }

}



