package curs4.Example3;

public class Monitor {
    //    Monitor: boolean on, double diagonala si pressPowerButton
    private boolean on;
    double diagonala;

    public Monitor(boolean on, double diagonala) {
        this.on = on;
        this.diagonala = diagonala;
    }

    public void pressPowerButton() {
        if (on) {
            System.out.println("Monitorul a fost oprit!");
            on = false;
        }
        System.out.println("Monitorul a fost pornit");
        on = true;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "diagonala=" + diagonala +
                '}';
    }
}
