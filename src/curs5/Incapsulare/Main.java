package curs5.Incapsulare;

 public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog(5);
        System.out.println(myDog.getAge());
        myDog.setAge(100);
        System.out.println(myDog.getAge());
    }
}
