package java_oop_seminar_4;

public class task_2 {
    public static void main(String[] args) {
        Integer[] num_arr = new Integer[] {453, 34, 35, 345, 46567, 46};
        printArray(num_arr);
        String[] s_arr = new String[] {"because", "Python", "of", "pay"};
        printArray(s_arr);
        Double[] db_arr = new Double[] {25.324, 14.1234, 214.235, 6.69};
        printArray(db_arr);
    }

    public static <T> void printArray(T[] arr) {
        for (T el : arr) {
            System.out.println(el);
        }
    }
}
