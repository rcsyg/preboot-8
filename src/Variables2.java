public class Variables2 {

    public static void main(String[] args) {
        int x = 5;
        int y = 2;
        System.out.println(x);

        x = 4;
        System.out.println(x);

        x = y;
        System.out.println(x);

        byte b = 10;
        long big = 10000000000000L;

        x = b;
        x = (int) big;

        System.out.println(x);

        double decimal = 2.5d;
        x = (int) decimal;
        System.out.println(x);

        decimal = b;
        System.out.println(decimal);

        char c = 'K';
        x = c;
        System.out.println(x);

        c = 76;
        System.out.println(c);

    }

}
