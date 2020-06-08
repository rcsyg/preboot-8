public class Operators3 {

    public static void main(String[] args) {

        // A && B | R
        // F && F | F
        // T && F | F
        // F && T | F
        // T && T | T

        System.out.println("F && F = " + (false && false));
        System.out.println("T && F = " + (true && false));
        System.out.println("F && T = " + (false && true));
        System.out.println("T && T = " + (true && true));

        System.out.println("F || F = " + (false || false));
        System.out.println("T || F = " + (true || false));
        System.out.println("F || T = " + (false || true));
        System.out.println("T || T = " + (true || true));

        boolean todayIsMonday = true;
        System.out.println("todayIsMonday = " + todayIsMonday);
        boolean negated = !todayIsMonday;
        System.out.println("negated = " + negated);

        boolean toBe = true;
        boolean shakeSpear = toBe || !toBe;
        System.out.println("shakeSpear = " + shakeSpear);

    }

}
