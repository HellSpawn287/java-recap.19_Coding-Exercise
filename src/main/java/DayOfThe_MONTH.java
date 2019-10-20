public class DayOfThe_MONTH {

    public static boolean isLeapYear(int year) {
        boolean result = false;
        if (year > 0 && year < 10_000) {
            int divBy4 = year % 4;
            int divBy100 = year % 100;
            int divisibleBy400 = year % 400;
            if ((divBy4 == 0) && !(divBy100 == 0) || (divisibleBy400 == 0)) {
                result = true;
            }
            return result;
        }
        return result;
    }

    public static int getDaysInMonth(int month, int year) {
        int daysOfThe_MONTH = -1;
        if ((year > 0 && year < 10_000) && (month > 0 && month < 13)) {
            String leap = String.valueOf(isLeapYear(year));
            switch (leap) {
                case "true":
                    switch (month) {
                        case 1:
                            daysOfThe_MONTH = 31;
                            break;
                        case 2:
                            daysOfThe_MONTH = 29;
                            break;
                        case 3:
                            daysOfThe_MONTH = 31;
                            break;
                        case 4:
                            daysOfThe_MONTH = 30;
                            break;
                        case 5:
                            daysOfThe_MONTH = 31;
                            break;
                        case 6:
                            daysOfThe_MONTH = 30;
                            break;
                        case 7:
                            daysOfThe_MONTH = 31;
                            break;
                        case 8:
                            daysOfThe_MONTH = 31;
                            break;
                        case 9:
                            daysOfThe_MONTH = 30;
                            break;
                        case 10:
                            daysOfThe_MONTH = 31;
                            break;
                        case 11:
                            daysOfThe_MONTH = 30;
                            break;
                        case 12:
                            daysOfThe_MONTH = 31;
                            break;
                    }
                    break;
                case "false":
                    switch (month) {
                        case 1:
                            daysOfThe_MONTH = 31;
                            break;
                        case 2:
                            daysOfThe_MONTH = 28;
                            break;
                        case 3:
                            daysOfThe_MONTH = 31;
                            break;
                        case 4:
                            daysOfThe_MONTH = 30;
                            break;
                        case 5:
                            daysOfThe_MONTH = 31;
                            break;
                        case 6:
                            daysOfThe_MONTH = 30;
                            break;
                        case 7:
                            daysOfThe_MONTH = 31;
                            break;
                        case 8:
                            daysOfThe_MONTH = 31;
                            break;
                        case 9:
                            daysOfThe_MONTH = 30;
                            break;
                        case 10:
                            daysOfThe_MONTH = 31;
                            break;
                        case 11:
                            daysOfThe_MONTH = 30;
                            break;
                        case 12:
                            daysOfThe_MONTH = 31;
                            break;
                    }
                    break;
                default:
                    System.out.println("Something went wrong");
                    break;
            }
        }
        return daysOfThe_MONTH;
    }

    public static void main(String[] args) {
        System.out.println("This is a leap year: " + isLeapYear(-1604));
        System.out.println("This is a leap year: " + isLeapYear(1604));
        System.out.println("This is a leap year: " + isLeapYear(2017));
        System.out.println("This is a leap year: " + isLeapYear(2000));
        System.out.println("This is a leap year: " + isLeapYear(1800));
        System.out.println("This is a leap year: " + isLeapYear(1924));

        System.out.println("\n\n Get DAYS of the MONTH \n\n");

        System.out.println("February in 1990 had " + getDaysInMonth(2, 1990) + " days");
        System.out.println("February in 2018 had " + getDaysInMonth(2, 2017) + " days");
        System.out.println("January in 2000 had " + getDaysInMonth(1, 2000) + " days");
        System.out.println("\nFebruary in 2000 had ".toUpperCase() + getDaysInMonth(2, 2000) + " days\n".toUpperCase());
        System.out.println("February in 1800 had " + getDaysInMonth(2, 1800) + " days");
        System.out.println("April in 1990 had " + getDaysInMonth(4, 1990) + " days");
        System.out.println("July in 1990 had " + getDaysInMonth(7, 1990) + " days");
    }
}

