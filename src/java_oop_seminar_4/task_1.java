package java_oop_seminar_4;

public class task_1 {
    public static void main(String[] args) {
        Integer num = 100;
        printElement(num);
        String s = "Hello";
        printElement(s);
        Double db = 100.436;
        printElement(db);
    }

    public static <T> void printElement(T element) {
        System.out.println(element);
    }
}
