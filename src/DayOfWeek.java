import java.util.Scanner;

public class DayOfWeek {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter day of week (ordinal): ");
        int dayOfWeek = sc.nextInt();

        sc.close();

        /* if( dayOfWeek == 1) {
            System.out.println("Monday");
        } else if (dayOfWeek == 2) {
            System.out.println("Tuesday");
        } else if (dayOfWeek == 3) {
            System.out.println("Wednesday");
        } else {
            System.out.println("Something another");
        } */

        switch (dayOfWeek) {
            case 5:
                System.out.println("Friday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Something another");
        }

        String s = "abc";
        switch (s) {
            case "abc":
                System.out.println("ABC");
                break;
            case "def":
                System.out.println("DEF");
                break;
            default:
                System.out.println("Do not know!");
        }

        // nothing will be executed
        char ch = 'd';
        switch (ch) {
            case 'a':
                System.out.println("A");
                break;
            // C - 67
            case 'C':
                System.out.println("c - upper");
                break;
            // c - 99
            case 'c':
                System.out.println("c - lower");
                break;
        }
    }

}