package curs4.Example2;

public class Human {
    private String firstName;
    private String lastName;
    private double height;
    private double weight;
    private String eyeColor;
    private Dog dog;
    private Pistol pistol;
    private MachineGun machineGun;

    public Human(String firstName, String lastName, double height, double weight,
                 String eyeColor, Dog dog, Pistol pistol, MachineGun machineGun) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.height = height;
        this.weight = weight;
        this.eyeColor = eyeColor;
        this.dog = dog;
        this.pistol = pistol;
        this.machineGun = machineGun;
    }

    @Override
    public String toString() {
        return "Human{" + "firstName=" + firstName + ", lastName=" + lastName + ", height=" + height +
                ", weight=" + weight + ", eyeColor='" + eyeColor + '\n' +
                ", dog=" + dog + '\n' +
                ", pistol=" + pistol + '\n' +
                ", machineGun=" + machineGun + "}\n";

    }
}
