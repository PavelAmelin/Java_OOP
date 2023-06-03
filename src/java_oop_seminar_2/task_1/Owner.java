package java_oop_seminar_2.task_1;

public class Owner implements I_Plays{
    private String name;

    public Owner(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void plays() {
        System.out.println("Владелец играет с котом");
    }
}
