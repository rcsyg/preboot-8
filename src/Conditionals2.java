public class Conditionals2 {

    public static void main(String[] args) {
        boolean some = false;
        if (some) {
            System.out.println("Executed for true!");
        }

        if(!some) {
            System.out.println("Executed for false!");
        }

        if(some) {
            System.out.println("Line 1");
            System.out.println("Line 2");
            System.out.println("Line 3");
        }

        
    }

}
