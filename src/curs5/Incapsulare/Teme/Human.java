package curs5.Incapsulare.Teme;

import java.util.ArrayList;

public class Human {
    private String name;
    private int age;
    private boolean sex;
    private ArrayList<Human> children;

    public Human(String name, int age, boolean sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.children = new ArrayList<>();
    }

    public void addChild(Human child) {
        this.children.add(child);
    }

    public ArrayList<Human> getChildren() {
        return new ArrayList<>(this.children);
    }

    public String display() {
        StringBuilder text = new StringBuilder();
        text.append("Name: ").append(this.name);
        text.append(", sex: ").append(this.sex ? "male" : "female");
        text.append(", age: ").append(this.age);
        int childCount = this.children.size();

        if (childCount > 0) {
            text.append(", children: ").append(this.children.get(0).name);

            for (int i = 1; i < childCount; i++) {
                Human child = this.children.get(i);
                text.append(", ").append(child.name);
            }
        }
        return text.toString();
    }

}
