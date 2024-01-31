package curs4.Exemple;

public class Example1 {
    public static void main(String[] args) {
//        Phone phoneOne = new Phone();
//        phoneOne.marca = "Apple";
//        phoneOne.color = "black";
//        phoneOne.model = "IPhone14";
//        phoneOne.nrTel = 760000;
//        phoneOne.suna();
        Dog caine1 = new Dog();
        Dog caine2 = new Dog();
        caine1.rasa = "Ciuaua";
        caine1.culoare = "maro";
        caine1.varsta = 2;
        caine2.rasa = "Biggle";
        caine2.culoare = "Alb cu pete maro";
        caine2.varsta = 1;
        System.out.println("Primul caine are rasa: " + caine1.rasa + ", culoarea " + caine1.culoare
                + " si varsta: " + caine1.varsta + " ani.");
        System.out.println(caine2.toString());
    }
}
