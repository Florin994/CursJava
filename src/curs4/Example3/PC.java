package curs4.Example3;

public class PC {
    //        PC: boolean on, int ram, string procesor pressPowerButton
    private boolean on = false;
    private int ram;
    private String procesor;

    public PC(boolean on, int ram, String procesor) {
        this.on = on;
        this.ram = ram;
        this.procesor = procesor;
    }

    public void pressPowerButton() {
        if (on) {
            System.out.println("Pc-ul a fost oprit!");
            on = false;
        }
        System.out.println("Pc-ul a fost pornit");
        on = true;
    }

    @Override
    public String toString() {
        return "PC{" +
                "ram=" + ram +
                ", procesor='" + procesor + '\'' +
                '}';
    }
}
