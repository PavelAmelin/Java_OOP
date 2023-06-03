package java_oop_seminar_2.task_2;

import java.util.ArrayList;

public class Rectangle implements I_Rectangle, I_Coordinates{
    private double width;
    private double height;

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
    public double calculateArea() {
        return getWidth() * getHeight();
    }
    public double calculatePerimeter() {
        return 2 * (getWidth() + getHeight());
    }
    @Override
    public void calculate_coordinates() {
        System.out.printf("нижний левый угол по x %.1f\n", x_coord_downleft);
        System.out.printf("нижний левый угол по y %.1f\n", y_coord_downleft);
        System.out.printf("верхний левый угол по x %.1f\n", x_coord_downleft);
        System.out.printf("верхний левый угол по y %.1f\n", y_coord_downleft + height);
        System.out.printf("нижний правый угол по x %.1f\n", x_coord_downleft + width);
        System.out.printf("нижний правый угол по y %.1f\n", y_coord_downleft);
        System.out.printf("верхний правый угол по x %.1f\n", x_coord_downleft + width);
        System.out.printf("верхний правый угол по y %.1f\n", y_coord_downleft + height);
    }
}
