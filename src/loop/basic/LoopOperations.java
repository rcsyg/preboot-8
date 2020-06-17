package loop.basic;

public class LoopOperations {

    public static void main(String[] args) {
        // 1 + 2 + 3 ... + 10
        int i = 1;
        int sum = 0;
        while (i <= 10) {
            sum = sum + i;
            i++;
        }

        System.out.println("sum = " + sum);

        i = 1;
        sum = 0;
        do {
            sum = sum + i;
            i++;
        } while (i <= 10);

        System.out.println("sum = " + sum);

    }

}
