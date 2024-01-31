package curs4.Example3;

public class Main {
    public static void main(String[] args) {
//        creati clasele PC si monitor
//        PC: boolean on, int ram, string procesor pressPowerButton
//        Monitor: boolean on, double diagonala si pressPowerButton
//        pentru ambele clase metoda pres powerButton, va porni pc-ul/monitorul daca este inchis si il va inchide daca este pornit
//        creaza un pc si un monitor, pornestele si oprestele
        PC pc = new PC(false, 16, "AMD");
        Monitor monitor = new Monitor(false, 32);
        pc.pressPowerButton();
        monitor.pressPowerButton();
        pc.pressPowerButton();
        monitor.pressPowerButton();
    }
}
