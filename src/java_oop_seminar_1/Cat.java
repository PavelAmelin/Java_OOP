package java_oop_seminar_1;

public class Cat {
    private String name;
    private int age;
    private Owner owner;

    public Cat(String name, int age, Owner owner) {
        setName(name);
        setAge(age);
        setOwner(owner);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public void greet() {
        System.out.printf("Мяу! Меня зовут %s." +
                        " Мне %d года(лет)." +
                        " Мой владелец - %s.",
                getName(), getAge(), getOwner().getName());
    }
}
