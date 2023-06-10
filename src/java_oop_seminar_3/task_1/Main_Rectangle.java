package java_oop_seminar_3.task_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;


public class Main_Rectangle {
    public static void main(String[] args) {
        Comparator<Rectangle> compar = (diag1, diag2) -> {
            if (diag1.calculateDiagonal() > diag2.calculateDiagonal()) {
                return 1;
            } else if (diag1.calculateDiagonal() > diag2.calculateDiagonal()) {
                return -1;
            } else {
                return 0;
            }
        };
        ArrayList<Rectangle> lst = new ArrayList<>();
        for (int i = 10, j = 5; i < 20; i++, j++) {
            lst.add(new Rectangle(i, j));
        }
        lst.sort(compar);
        for (Rectangle rectangle : lst) {
            System.out.println(rectangle);
        }
    }
}
