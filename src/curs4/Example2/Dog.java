package curs4.Example2;

public class Dog {
    private String name;
    private String breed;
    private double age;
    private String color;

    public Dog(String name, String breed, double age, String color) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" + "name=" + name + ", breed=" + breed + ", age=" + age + ", color=" + color + '}';
    }
}
