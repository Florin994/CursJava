package curs5.Incapsulare.Teme3;

public class Employee {
    private String firstName;
    private String lastName;
    private double monthSalary;

    public Employee(String firstName, String lastName, double monthSalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthSalary = monthSalary;
    }

    public void addARise(int percent) {
        if (percent > 0) {
            this.monthSalary += ((this.monthSalary * percent) / 100);

        } else {
            System.out.println("You cant rice a salary by a negative percent!");
        }
    }

    public double getAnnualSalary() {
        return 12 * getMonthSalary();
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMonthSalary(double monthSalary) {
        if (monthSalary <= 0) {
            this.monthSalary = 0.0;
        } else {
            this.monthSalary = monthSalary;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getMonthSalary() {
        return monthSalary;
    }
}
