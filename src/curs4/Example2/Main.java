package curs4.Example2;

public class Main {
    public static void main(String[] args) {
//        Creaza clasa human cu campurile nume prenume, inaltime, greutate, culoarea ochilor, care sa aiba un caine, un pistol si o arma
//        cainele are nume, rasa, varsta, culoare
//        pistolul va avea un tip, modle si calibru
//        arma va avea tip, modle, calibru, culoare
//        instantiaza doi oameni diferiti
        Dog dogOne = new Dog("Rocky", "Husky", 2.5, "Black");
        Dog dogTwo = new Dog("Willy", "Husky", 1.0, "White");
        Pistol pistolOne = new Pistol("Kolibri", "2mm", 2.7);
        Pistol pistolTwo = new Pistol("AutoMag", "Four", 9.0);
        MachineGun machineGunOne = new MachineGun("Besal", "One", 7.7, "black");
        MachineGun machineGunTwo = new MachineGun("Breda", "38", 8.0, "grey");
        Human jhon = new Human("Jhonson", "Jhon", 1.81, 94.5,
                "brawn", dogOne, pistolOne, machineGunOne);
        Human mike = new Human("Jepherson", "Mike", 1.75, 70.4,
                "blue", dogTwo, pistolTwo, machineGunTwo);
        System.out.println(jhon);
        System.out.println(mike);
    }
}
