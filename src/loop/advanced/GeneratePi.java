package loop.advanced;

public class GeneratePi {

    public static void main(String[] args) {

        // 1 3 5 7 9 11
        // 0 1 2 3 4  5

        double sum = 0;
        for (int i = 0, j = 1; i < 100_000; i++, j+=2) {
            double n = 1 / (double) j;
            if(i % 2 == 0) {
                sum = sum + n;
            } else {
                sum = sum - n;
            }
        }

        // 3,1415926535
        double pi = 4 * sum;
        System.out.println("pi = " + pi);
    }

}
