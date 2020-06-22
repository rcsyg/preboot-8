package loop.advanced;

public class NestedLoops {

    public static void main(String[] args) {

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                int result = i * j;
                if (result < 10) {
                    System.out.print(" ");
                }
                System.out.print(result + " ");
            }
            System.out.println("");
        }

    }

}
