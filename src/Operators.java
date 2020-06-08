public class Operators {

    public static void main(String[] args) {
        int x = 5;
        int y = 2;
        int z = x + y;
        System.out.println(z);

        double z2 = x + 2.5;
        System.out.println(z2);

        int sub = x - y;
        System.out.println(sub);

        int mul = x * y;
        System.out.println(mul);

        // 7 / 2 = 3.5 ?
        int r = 7 / 2;
        System.out.println(r);

        // 7 / 2 = 3.5 !
        double r2 = 7 / 2.0;
        System.out.println(r2);

        // 7 % 2 = 1
        int remainder = 7 % 2;
        System.out.println(remainder);

        // same actions
        x = x + 1;
        x += 1;
        x++;

        System.out.println(x);

        // same operations
        x = x - 1;
        x -= 1;
        x--;

        System.out.println(x);

        String helloWorld = "Hello " + "world";
        System.out.println(helloWorld);

        String result1 = "Result : " + x;
        //String result2 = x + "Result: ";
        System.out.println(result1);

        String s1 = "12" + "3";
        int i2 = 12 + 3;
        System.out.println("Concatenation: " + s1);
        System.out.println("Addition : " + i2);

        System.out.println("Int : " + 3 + " bool : " + true + " ,double : " + 5.75);

        int priority = 1 + 5 * 6;
        int priority2 = (1 + 5) * 6;
        System.out.println("priority = " + priority);
        System.out.println("priority2 = " + priority2);
    }

}
