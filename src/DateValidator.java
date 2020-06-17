import java.util.Scanner;

public class DateValidator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter day:");
        int date = sc.nextInt();

        System.out.print("Enter month:");
        int month = sc.nextInt();

        System.out.print("Enter year:");
        int year = sc.nextInt();

        sc.close();

        if (date < 1 || month < 1 || month > 12) {
            System.out.println("Incorrect request");
        } else {

            int maxDaysInMonth = 31;
            String monthName = "";

            switch (month) {
                case 1:
                    monthName = "January";
                    break;
                case 2:
                    monthName = "February";
                    if (year % 4 == 0) {
                        maxDaysInMonth = 29;
                    } else {
                        maxDaysInMonth = 28;
                    }
                    break;
                case 3:
                    monthName = "March";
                    break;
                case 4:
                    monthName = "April";
                    maxDaysInMonth = 30;
                    break;
                case 5:
                    monthName = "May";
                    break;
                case 6:
                    monthName = "June";
                    maxDaysInMonth = 30;
                    break;
                case 7:
                    monthName = "July";
                    break;
                case 8:
                    monthName = "August";
                    break;
                case 9:
                    monthName = "September";
                    maxDaysInMonth = 30;
                    break;
                case 10:
                    monthName = "October";
                    break;
                case 11:
                    monthName = "November";
                    maxDaysInMonth = 30;
                    break;
                case 12:
                    monthName = "December";
                    break;
            }

            if (date > maxDaysInMonth) {
                System.out.println("Incorrect request");
            } else {
                if (year < 0) {
                    System.out.println(date + ". " + monthName + ", " + (year * -1) + " BC");
                } else {
                    System.out.println(date + ". " + monthName + ", " + year);
                }
            }

        }

    }

}
