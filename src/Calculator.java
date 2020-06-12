import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: (a)");
        double a = sc.nextDouble();

        System.out.println("Enter operation: ( + | - | * | / )");
        char operation = sc.next().charAt(0);

        System.out.println("Enter number: (b)");
        double b = sc.nextDouble();

        double result = 0;
        boolean inputValid = true;
        switch (operation) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            default:
                inputValid = false;
        }

        if (inputValid) {
            System.out.println("Result : " + result);
        } else {
            System.out.println("I don't support such operation : " + operation);
        }
    }

}
