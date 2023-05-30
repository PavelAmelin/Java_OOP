package java_oop_seminar_1;

public class Main_Cat {
    public static void main(String[] args) {
        Owner owner = new Owner("Pavel");
        Cat cat = new Cat("Bas", 4, owner);
        cat.greet();
    }
}
