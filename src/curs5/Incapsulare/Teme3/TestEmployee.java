package curs5.Incapsulare.Teme3;

public class TestEmployee {
    public static void main(String[] args) {
        Employee alan = new Employee("Alan", "Ianis", 3200);
        Employee alin = new Employee("Alin", "Johnson", 3255);
        System.out.println(alan.getMonthSalary());
        System.out.println(alin.getMonthSalary());
        alan.addARise(10);
        alin.addARise(12);
        System.out.println(alan.getMonthSalary());
        System.out.println(alin.getMonthSalary());
    }
}
