package curs6.Tema1;

public class TestClock {
    public static void main(String[] args) {
//        scrie o metoda care primeste ora sub format string de 12 ore si converteste in format string de 24h
//        input: "07:21:35AM"-> output: "07:21:35"
//        input: "07:21:35PM"-> output: "19:21:35"
//        exceptii
        System.out.println("Clock format with convertHourFormat() method:");
        convertHourFormat("07:21:35AM");
        convertHourFormat("07:21:35PM");
        System.out.println();
        System.out.println("Clock with clock obj:");
        Clock clock1 = new Clock("07:21:35AM");
        Clock clock2 = new Clock("07:21:35PM");
        clock1.print();
        clock2.print();
    }

    public static void convertHourFormat(String hour) {
        String[] parts = hour.split(":");
        String hours = parts[0];
        String minutes = parts[1];
        String seconds = parts[2];
        StringBuilder sec = new StringBuilder();
        String secondsOnly = String.valueOf(sec.append(seconds.charAt(0)).append(seconds.charAt(1)));
        StringBuilder type = new StringBuilder();
        String typeOfMerridie = String.valueOf(type.append(seconds.charAt(seconds.length() - 2)).append(seconds.charAt(seconds.length() - 1)));
        if (typeOfMerridie.equalsIgnoreCase("PM")) {
            hours = switch (hours) {
                case "01" -> "13";
                case "02" -> "14";
                case "03" -> "15";
                case "04" -> "16";
                case "05" -> "17";
                case "06" -> "18";
                case "07" -> "19";
                case "08" -> "20";
                case "09" -> "21";
                case "10" -> "22";
                case "11" -> "23";
                case "12" -> "24";
                default -> hours;
            };
        }
        System.out.println(hours + ":" + minutes + ":" + secondsOnly);
    }
}
