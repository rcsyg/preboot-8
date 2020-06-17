package loop.basic;

public class LoopBasics {
    public static void main(String[] args) {
        int i = 1;
        while (i < 3) {
            System.out.print("Start of cycle | ");
            System.out.print("i = " + i);
            System.out.println(" | end of cycle");
            i++;
            // i = i + 1;
        }

        System.out.println("Loop is finished");

        i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }

        System.out.println("");

        i = 1;
        // 1 3 5 7 9

        while (i <= 10) {
            System.out.print(i + " ");
            i = i + 2;
        }

        System.out.println("");

        i = 2;
        // 2 4 6 8 10
        while (i <= 10) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }


    }
}
