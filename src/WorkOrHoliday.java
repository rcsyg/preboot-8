import java.util.Scanner;

public class WorkOrHoliday {

    public static void main(String[] args) {
        // 1 - 5 : working day
        // 6 - 7 : holiday
        // < 1 || > 7 : not a day

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter day of week (ordinal): ");
        int dayOfWeek = sc.nextInt();

        sc.close();

        // System.out.println("dayOfWeek = " + dayOfWeek);

        // ..... 1 ... 5 .. 7 ........

        if (dayOfWeek < 1 || dayOfWeek > 7) {
            System.out.println("Not a day!");
        }

        if (dayOfWeek >= 1 && dayOfWeek <= 5) {
            System.out.println("Working day!");
        }

        if (dayOfWeek >= 6 && dayOfWeek <= 7) {
            System.out.println("Holiday!");
        }

        // -------------- 2nd approach ----------

        if (dayOfWeek < 1 || dayOfWeek > 7) {
            System.out.println("Not a day!");
        } else {
            if(dayOfWeek <= 5) {
                System.out.println("Working day!");
            } else {
                System.out.println("Holiday!");
            }
        }

        // --------------- 3rd approach ----------
        if (dayOfWeek < 1 || dayOfWeek > 7) {
            System.out.println("Not a day!");
        } else {
            String dayType = dayOfWeek <= 5 ? "Working day!" : "Holiday!";
            System.out.println(dayType);
        }


    }

}
