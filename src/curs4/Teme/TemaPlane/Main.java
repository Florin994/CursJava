package curs4.Teme.TemaPlane;

public class Main {
    public static void main(String[] args) {
//   creaza clasa plane cu campurile String Brand, String model, boolean isFlaying, int maxPassagers si metodele
//   addPassager, flay si land
//   un avion isi va lua zobrul daca este la sol si daca are la bord cel putin 1/2 din capacitatea maxima de pasageri
//   un avion va ateriza doar daca zboara si va trebui sa crezi un avion in care sa ii testezi toate funcionalitatile
//   in fiecare caz posibil
        Plane planeOne = new Plane("Boeing", "C-17 Globemaster III", 134);
        Plane planeTwo = new Plane("Antonov", "An-225 Mriya", 100);
        planeOne.addPassengers(67);
        planeOne.fly();
        planeOne.fly();
        System.out.println(planeOne.isFlaying());
        System.out.println();
        planeOne.land();
        planeOne.land();
        System.out.println(planeOne.isFlaying());
        System.out.println();
        System.out.println(planeOne);
        System.out.println(planeTwo);
    }
}
