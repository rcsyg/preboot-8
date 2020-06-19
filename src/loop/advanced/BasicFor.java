package loop.advanced;

public class BasicFor {

    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            System.out.println("do something!");
            i++;
        }

        for (int j = 0; j < 5; j++) {
            System.out.println(j + " - do something!");
        }

        // Extra variables declared / updated
        for (int j = 0, k = 5; j < 5 && k < 8; j++, k += 2) {
            System.out.println(j + " " + k + " - do something!");
        }

        System.out.println("\n\n");

        for (int j = 1; j < 10; j += 2) {
            System.out.print(j + " ");
        }

    }

}
