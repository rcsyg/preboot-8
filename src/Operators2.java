public class Operators2 {

    public static void main(String[] args) {
        int x = 5;
        int y = 2;

        boolean equal = (x == y);
        System.out.println("equal = " + equal);

        boolean notEqual = (x != y);
        System.out.println("notEqual = " + notEqual);

        boolean lessThan = (x < 7);
        System.out.println("lessThan = " + lessThan);
        boolean greaterThan = (x > 3);
        System.out.println("greaterThan = " + greaterThan);
        boolean leq = (y <= 2);
        System.out.println("leq = " + leq);
        boolean geq = y >= 4;
        System.out.println("geq = " + geq);
    }

}
