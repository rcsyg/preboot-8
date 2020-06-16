public class TipsAndTricks {

    public static void main(String[] args) {
        int x = 8;
        int y = 4;
        int z = 3;

        if(x % y == 0) {
            System.out.println("Can be divided! #1");
        }

        if(x % z == 0) {
            // because divide results in remainder, we will not see this on screen
            System.out.println("Can be divided! #2");
        }

        int r = -12;
        System.out.println("(1) r = " + r);

        r = r * -1;
        System.out.println("(2) r = " + r);

        r = -r;
        System.out.println("(3) r = " + r);

        System.out.print("Text without newline!");
        System.out.print(" Continue in a row!");
    }

}
