public class Conditionals {

    public static void main(String[] args) {

        boolean todayIsWednesday = true;
        if(todayIsWednesday) {
            System.out.println("Today is wednesday!");
            System.out.println("And if is working!");
        }

        int x = 5;
        if(x > 3) {
            System.out.println("x is greater than 3!");
        }

        if(x > 4 && x < 10) {
            System.out.println("x is greater than 3 and lesser than 10!");
        }

        if(x == 6) {
            System.out.println("It's impossible!");
        } else {
            System.out.println("x is NOT 6 !");
        }

        boolean isWithinTown = true;
        int maxSpeed;
        if(isWithinTown) {
            maxSpeed = 50;
        } else {
            maxSpeed = 90;
        }
        System.out.println("maxSpeed = " + maxSpeed);

        // The same, but ternary operator used
        maxSpeed = isWithinTown ? 50 : 90;
        System.out.println("maxSpeed = " + maxSpeed);



    }

}
