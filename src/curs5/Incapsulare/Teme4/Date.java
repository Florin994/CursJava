package curs5.Incapsulare.Teme4;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        setDay(day);
        this.month = month;
        this.year = year;
    }

    public void displayDate() {
        if (day < 10 && month < 10) {
            System.out.println("0" + day + "/" + "0" + month + "/" + year);
        } else if (day < 10) {
            System.out.println("0" + day + "/" + month + "/" + year);
        } else if (month < 10) {
            System.out.println(day + "/" + "0" + month + "/" + year);
        } else {
            System.out.println(day + "/" + month + "/" + year);
        }
    }

    public void setDay(int day) {
        if (day > 31 || day <= 0) {
            System.out.println("The day is not a valid date!");
        } else {
            this.day = day;
        }
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
}
