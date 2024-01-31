package curs4.Exemple1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Phone phoneOne = new Phone("Apple", "IPhone7", "Amoled", 8.0, "Black");
        Phone phoneTwo = new Phone("Samsung", "S8", "led", 6.0, "gold");
        System.out.println(phoneOne);
        System.out.println(phoneTwo);
        Phone phoneThree = new Phone("Samsung", "S1");
        Phone phoneFour = new Phone("Apple", "IPhoneX");
        Phone phone = new Phone("MyPhone", 8.0, "black", 2300.99);
        System.out.println(phone);
        phone.call(766000);
        ArrayList<Phone> phones = new ArrayList<>(Arrays.asList(phoneTwo, phoneThree, phoneFour));
        phones.add(phone);
        phones.add(phoneOne);
        phone.callAllPhones(phones);

    }
}
