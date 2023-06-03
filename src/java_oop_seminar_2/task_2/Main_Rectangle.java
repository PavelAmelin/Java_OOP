package java_oop_seminar_2.task_2;

public class Main_Rectangle {
    public static void main(String[] args) {
        Rectangle rect_1 = new Rectangle();
        Rectangle rect_2 = new Rectangle(400, 320);
        System.out.printf("%.1f; %.1f\n", rect_1.calculateArea(), rect_1.calculatePerimeter());
        rect_1.calculate_coordinates();
        System.out.printf("%.1f; %.1f\n", rect_2.calculateArea(), rect_2.calculatePerimeter());
        rect_1.setWidth(44);
        rect_1.setHeight(24);
        System.out.printf("%.1f; %.1f\n", rect_1.calculateArea(), rect_1.calculatePerimeter());
        rect_1.calculate_coordinates();
    }
}
