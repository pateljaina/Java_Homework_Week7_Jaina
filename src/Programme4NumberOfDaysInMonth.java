import java.util.Scanner;

public class Programme4NumberOfDaysInMonth {
    public static void main(String[] args) {
        int year;
        int month;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter Year?:");
        year = scanner.nextInt();
        isLeapYear(year);
        System.out.println("Please enter Days in Month:");
        month = scanner.nextInt();
        getDaysInMonth(month, year);
        scanner.close();
    }


    public static boolean isLeapYear(int year) {//isLeapYear method with parameter
        boolean b;
        if (year >= 1 && year <= 9999) {
            b = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);//parameter condition
            System.out.println(year + "Entered Year is Leap Year.");
        } else {
            b = false;
            System.out.println(year + "false since the Data is not in between 1-9999");
            System.out.println("Enter Year Again for valid leap year");
        }
        return b;
    }


    public static int getDaysInMonth(int month, int year) {//getDaysInMonth for getting days in the month
        int days = 0;
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        }
        switch (month) {//switch statement
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                System.out.println(31);
                break;
            case 2:
                if (isLeapYear(year)) {
                    days = 29;
                    System.out.println(29);
                } else {
                    days = 28;
                    System.out.println(28);
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                System.out.println(30);
                break;
        }
        return days;//returns days in the month
    }
}

