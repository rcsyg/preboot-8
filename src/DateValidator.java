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

        String[] monthNames = new String[] {"January", "February", "March", "April",
                "May", "June", "July", "August", "September", "October", "November", "December"};

        if (date < 1 || month < 1 || month > 12) {
            System.out.println("Incorrect request");
        } else {

            int maxDaysInMonth = 31;
            String monthName = "";

            switch (month) {
                case 1:
                    break;
                case 2:
                    if (year % 4 == 0) {
                        maxDaysInMonth = 29;
                    } else {
                        maxDaysInMonth = 28;
                    }
                    break;
                case 3:
                    break;
                case 4:
                    maxDaysInMonth = 30;
                    break;
                case 5:
                    break;
                case 6:
                    maxDaysInMonth = 30;
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    maxDaysInMonth = 30;
                    break;
                case 10:
                    break;
                case 11:
                    maxDaysInMonth = 30;
                    break;
                case 12:
                    break;
            }

            if (date > maxDaysInMonth) {
                System.out.println("Incorrect request");
            } else {
                monthName = monthNames[month - 1];
                if (year < 0) {
                    System.out.println(date + ". " + monthName + ", " + (year * -1) + " BC");
                } else {
                    System.out.println(date + ". " + monthName + ", " + year);
                }
            }

        }

    }

}
