package curs4.Exemple1;

import java.util.ArrayList;

public class Phone {
    ArrayList<Phone> phones;
    String name;
    String marca;
    String model;
    String display;
    double ram;
    String color;
    double price;


    public Phone(String marca, String model) {
        this.marca = marca;
        this.model = model;
    }

    public Phone(String marca, String model, String color) {
        this(marca, model);
        this.color = color;

    }

    public Phone(String marca, String model, String display, double ram, String color) {
        this(marca, model, color);
        this.display = display;
        this.ram = ram;
    }

    public Phone(String name, Double ram, String color, double price) {
        this.name = name;
        this.ram = ram;
        this.color = color;
        this.price = price;
        System.out.println("Am generat un telefon nou marca: " + this.name);
    }

    public void call(int phoneNumber) {
        System.out.println("Am apelat numarul: " + phoneNumber);
    }

    public void callAllPhones(ArrayList<Phone> phones) {
        this.phones = phones;
        for (Phone phone : phones) {
            System.out.println("Telephonul " + phone + " suna!");
        }
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", ram=" + ram +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
