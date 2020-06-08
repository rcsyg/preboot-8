import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number:");
        int userNumber = sc.nextInt();
        System.out.println("userNumber = " + userNumber);

        System.out.println("Enter text:");
        String userText = sc.next();
        System.out.println("userText = " + userText);

        //System.out.println(userText + userNumber);
        System.out.println("Enter double:");
        double userDouble = sc.nextDouble();
        System.out.println("userDouble = " + userDouble);

        System.out.println("Enter logical fact:");
        boolean userBoolean = sc.nextBoolean();
        System.out.println("userBoolean = " + userBoolean);

        sc.close();
    }

}
