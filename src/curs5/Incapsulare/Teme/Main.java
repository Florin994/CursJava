package curs5.Incapsulare.Teme;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Human child1 = new Human("Florin", 3, true);
        Human child2 = new Human("Ana", 5, false);
        Human child3 = new Human("Bogdan", 8, true);

        Human parent1 = new Human("Mihai", 35, true);
        Human parent2 = new Human("Anca", 36, false);

        Human grandparent1 = new Human("Alin", 70, true);
        Human grandparent2 = new Human("Alina", 71, false);
        Human grandparent3 = new Human("George", 68, true);
        Human grandparent4 = new Human("Elena", 69, false);

        parent1.addChild(child1);
        parent1.addChild(child2);
        parent1.addChild(child3);
        parent2.addChild(child1);
        parent2.addChild(child2);
        parent2.addChild(child3);

        grandparent1.addChild(parent1);
        grandparent2.addChild(parent1);
        grandparent3.addChild(parent2);
        grandparent4.addChild(parent2);

        System.out.println(grandparent1.display());
        System.out.println(grandparent2.display());
        System.out.println(grandparent3.display());
        System.out.println(grandparent4.display());
        System.out.println(parent1.display());
        System.out.println(parent2.display());
        System.out.println(child1.display());
        System.out.println(child2.display());
        System.out.println(child3.display());
    }
}
