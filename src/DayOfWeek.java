import java.util.Scanner;

public class DayOfWeek {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter day of week (ordinal): ");
        int dayOfWeek = sc.nextInt();

        sc.close();

        if( dayOfWeek == 1) {
            System.out.println("Monday");
        } else if (dayOfWeek == 2) {
            System.out.println("Tuesday");
        } else if (dayOfWeek == 3) {
            System.out.println("Wednesday");
        } else {
            System.out.println("Something another");
        }

    }

}