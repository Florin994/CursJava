package curs5.Incapsulare.Teme4;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        setDay(day);
        setMonth(month);
        setYear(year);
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
            throw new InvalidDayException("Invalid day!");
        } else {
            this.day = day;
        }
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12) {
            throw new RuntimeException("Invalid month!");
        } else {
            this.month = month;
        }
    }

    public void setYear(int year) {
        if (year < 1 || year > 2024) {
            throw new RuntimeException("Invalid year!");
        } else {
            this.year = year;
        }
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
