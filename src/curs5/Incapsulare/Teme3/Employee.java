package curs5.Incapsulare.Teme3;

public class Employee {
    private String firstName;
    private String lastName;
    private double monthSalary;

    public Employee(String firstName, String lastName, double monthSalary) {
        setFirstName(firstName);
        setLastName(lastName);
        setMonthSalary(monthSalary);
    }

    public void addARise(int percent) {
        if (percent > 0) {
            this.monthSalary += ((this.monthSalary * percent) / 100);

        } else {
            throw new RuntimeException("You cant rice a salary by a negative percent!");
        }
    }

    public double getAnnualSalary() {
        return 12 * getMonthSalary();
    }

    public void setFirstName(String firstName) {
        for (int i = 0; i < firstName.length(); i++) {
            char c = firstName.charAt(i);
            if (!Character.isLetter(c)) {
                throw new RuntimeException("Invalid name format!");
            } else {
                this.firstName = firstName;
            }
        }
    }

    public void setLastName(String lastName) {
        for (int i = 0; i < lastName.length(); i++) {
            char c = lastName.charAt(i);
            if (!Character.isLetter(c)) {
                throw new RuntimeException("Invalid name format!");
            } else {
                this.lastName = lastName;
            }
        }
    }

    public void setMonthSalary(double monthSalary) {
        if (monthSalary <= 0) {
            this.monthSalary = 0.0;
            throw new RuntimeException("Salary can not be negative!");
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
