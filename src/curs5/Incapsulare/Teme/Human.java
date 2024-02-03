package curs5.Incapsulare.Teme;

import java.util.ArrayList;
import java.util.Collections;

public class Human {
    private String name;
    private int age;
    private boolean sex;
    private ArrayList<Human> children;

    public Human(String name, int age, boolean sex) {
        setName(name);
        setAge(age);
        setSex(sex);
        this.children = new ArrayList<>();
    }

    public void setName(String name) {
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if (!Character.isLetter(c)) {
                throw new RuntimeException("Invalid name format!");
            } else {
                this.name = name;
            }
        }
    }

    public void setAge(int age) {
        if (age < 1 || age > 120) {
            throw new RuntimeException("The age is invalid!");
        } else {
            this.age = age;
        }
    }

    public void setSex(boolean sex) {
        this.sex = sex;
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
